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
import org.springframework.web.bind.annotation.RestController;
import pojo.Admin;
import pojo.Clazz;
import pojo.Page;
import pojo.Student;
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

    public String getClazz(@RequestParam("page") Integer currentPage,
                           @RequestParam("rows") Integer pageSize,
                           String clazzName, String from)
            throws JsonProcessingException {

        System.out.println("aaaaaaaaaa"+clazzName);
        Map<String, Object> map = new HashMap<String, Object>();
        Page page = new Page(currentPage, pageSize);
        map.put("pageSize", page.getPageSize());
        map.put("start", page.getStart());
        map.put("clazzName", clazzName);

        List<Clazz> clazzList = service.getClazzListByPage(map);

        int total = service.getTotalClazz();
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("rows", clazzList);
        ret.put("total", total);
        ObjectMapper jsonmapper = new ObjectMapper();
        if (from.equals("combox")) {
            return jsonmapper.writeValueAsString(clazzList);
        } else {
            return jsonmapper.writeValueAsString(ret);
        }
    }

    @RequestMapping("/editClazz")
    @ResponseBody
    public String editClazz(Integer id, String name, String info) throws IOException {
        Clazz clazz = new Clazz(id, name, info);
        System.out.println(clazz.toString());
        service.updateClazzById(clazz);
        Map ret = new HashMap();
        ret.put("status", "updated");
        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(ret);
    }

    @RequestMapping("/addClazz")
    @ResponseBody
    public String addClazz(String name, String info) throws IOException {
        Clazz clazz = new Clazz(name, info);
        service.addClazz(clazz);
        Map ret = new HashMap();
        ret.put("msg", "success");
        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(ret);
    }
}
