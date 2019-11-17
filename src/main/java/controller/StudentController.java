package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.Admin;
import pojo.Page;
import pojo.Student;
import service.AdminService;
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
//        List<Student> students = service.queryAllStudent();
        return "view/student/studentList";
    }

//    studentList.jsp中url会来这里请求数据
    @RequestMapping("getStudentList")
    @ResponseBody
    public String getStudentList() {
        List<Student> students = service.getStudentListByPage(new Page(1,8));
        Map ret = new HashMap();
        ret.put("rows",students);
//        ObjectMapper Jsonmapper = new ObjectMapper();
//        System.out.println("jsonData="+Jsonmapper.writeValueAsString(students));
//        return Jsonmapper.writeValueAsString(ret);
        return ret.toString();
    }
}
