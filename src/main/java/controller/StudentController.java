package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Page;
import pojo.Student;
import service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    private StudentService service = (StudentService) context.getBean("studentService");

    @RequestMapping("studentListController")
    public String queryAllStudent(Model model) {
        return "view/student/studentList";
    }

//    studentList.jsp中url会来这里请求数据
    @RequestMapping("getStudentList")
    @ResponseBody
    public String getStudentList(Integer clazzid, @RequestParam("page") Integer currentPage,
                                 @RequestParam("rows") Integer pageSize,
                                 String studentName)
            throws JsonProcessingException {
        Map<String, Object> map = new HashMap<String, Object>();
        Page page = new Page(currentPage,pageSize);
        map.put("pageSize",page.getPageSize());
        map.put("start",page.getStart());
        map.put("clazzId",clazzid);
        map.put("studentName",studentName);
        List<Student> students = service.getStudentListByPage(map);

        int total = service.getTotalNumber();
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("rows",students);
        ret.put("total", total);
        ObjectMapper Jsonmapper = new ObjectMapper();
        System.out.println("jsonData="+Jsonmapper.writeValueAsString(students));
        return Jsonmapper.writeValueAsString(ret);
    }
}
