package controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.Admin;
import pojo.Clazz;
import pojo.Page;
import service.AdminService;
import service.ClazzService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClazzController {
    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    private ClazzService service = (ClazzService) context.getBean("clazzService");

    @RequestMapping("/clazzListController")
    public String handle(Model model, String name, String password) {

        return "view/clazz/clazzListPage";
    }

//    是从 clazzListPage.jsp这个页面点击跳转过来的
//    这个clazzName是在班级列表表单里传过来的,刚开始点进去的时候这个参数是空
    @RequestMapping("/getClazzList")
    @ResponseBody
    public String getClazz() throws IOException {
        List<Clazz> clazzList = service.getClazzListByPage(new Page(1, 5));
        int total = clazzList.size();
        System.out.println("total:" + total);
        Map<String, Object> ret = new HashMap<String, Object>();

        ret.put("rows", clazzList);
        ret.put("total", total);
        return ret.toString();
    }
}
