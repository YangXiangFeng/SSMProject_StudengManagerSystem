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

    //����Ա��¼ֱ�ӵ�����
    @RequestMapping("/login")
    public String handle(Model model, String name, String password) {
        //���ݵ�¼����������֤��¼
        Map map = new HashMap();
        map.put("name", name);
        map.put("password", password);
        Admin admin1 = service.queryAdminByName(map);
        //�õ�����Ա������
        String username = admin1.getName();
        model.addAttribute("user", username);
        return "view/admin/admin";
    }

    //����Ա�ǳ�����
    @RequestMapping("/logout")
    public String logout(Model model) {
        System.out.println("logout");
        return "view/admin/logout";
    }

}
