package service;

import mapper.AdminMapper2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Admin;
import pojo.Student;

import java.util.List;
import java.util.Map;

public class AdminServiceImpl implements AdminService{
    private AdminMapper2 mapper;

    public AdminMapper2 getMapper() {
        return mapper;
    }

    public void setMapper(AdminMapper2 mapper) {
        this.mapper = mapper;
    }

    public void insertAdmin(Admin admin) {
        mapper.insertAdmin(admin);
    }

    public List<Student> queryAllStudent() {
       return mapper.queryAllStudent();
    }

    public Admin queryAdminByName(Map map) {
        return mapper.queryAdmin(map);
    }
}
