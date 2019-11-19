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
import pojo.Teacher;
import pojo.Page;
import service.TeacherService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TeacherController {
    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    private TeacherService service = (TeacherService) context.getBean("teacherService");
    private ObjectMapper jsonMapper = new ObjectMapper();

    @RequestMapping("/teacherListController")
    public String handle(Model model, String name, String password) {

        return "view/teacher/teacherListPage";
    }

    //    是从 teacherListPage.jsp这个页面点击跳转过来的
//    这个teacherName是在班级列表表单里传过来的,刚开始点进去的时候这个参数是空
    @RequestMapping("/getTeacherList")
    @ResponseBody
    public String getTeacher(@RequestParam("page") Integer currentPage,
                             @RequestParam("rows") Integer pageSize,
                             String from)
            throws JsonProcessingException {

        Map<String, Object> map = new HashMap<String, Object>();
        Page page = new Page(currentPage, pageSize);
        map.put("pageSize", page.getPageSize());
        map.put("start", page.getStart());

        List<Teacher> teacherList = service.getTeacherListByPage(map);

        int total = service.getTotalTeacher();
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("rows", teacherList);
        ret.put("total", total);
        return jsonMapper.writeValueAsString(ret);
    }

    @RequestMapping("/editTeacher")
    @ResponseBody
    public String editTeacher(Integer id, String number, String name, String sex, String phone, String qq, Integer classId) throws IOException {
        Teacher teacher = new Teacher(id, number, name, sex, phone, qq);
        System.out.println(teacher.toString());
        service.updateTeacherById(teacher);
        Map<String, String> ret = new HashMap<String, String>();
        ret.put("status", "updated");
        return jsonMapper.writeValueAsString(ret);
    }

    @RequestMapping("/addTeacher")
    @ResponseBody
    public String addTeacher(String number, String name, String sex, String phone, String qq) throws IOException {
        Teacher teacher = new Teacher(name, number, sex, qq, phone);
        service.addTeacher(teacher);
        Map<String, String> ret = new HashMap<String, String>();
//        不一定要添加这个信息,只要返回了json数据前台就视为添加成功
        ret.put("msg", "success");
        return jsonMapper.writeValueAsString(ret);
    }

    @RequestMapping("/deleteTeacher")
    @ResponseBody
    public String deleteTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String[] ids = request.getParameterValues("ids[]");
        String idStr = "";
        for (String id : ids) {
            idStr += id + ",";
        }
        idStr = idStr.substring(0, idStr.length() - 1);
        System.out.println("ids = "+idStr);
        service.deleteTeacher(idStr);
        Map<String, String> ret = new HashMap<String, String>();
        ret.put("msg", "success");
        return jsonMapper.writeValueAsString(ret);
    }
}
