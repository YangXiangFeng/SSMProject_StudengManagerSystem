package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Admin;
import pojo.Student;
import service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    private AdminService service = (AdminService) context.getBean("adminService");

    //管理员登录直接到这里
    @RequestMapping("/login")
    public String handle(Model model, String name, String password) {
        //根据登录名和密码验证登录
        Map map = new HashMap();
        map.put("name", name);
        map.put("password", password);
        Admin admin1 = service.queryAdminByName(map);
        //得到管理员的姓名
        String username = admin1.getName();
        model.addAttribute("user", username);
        return "view/admin/admin";
    }

    //管理员登出功能
    @RequestMapping("/logout")
    public String logout(Model model) {
        System.out.println("logout");
        return "view/admin/logout";
    }

}
