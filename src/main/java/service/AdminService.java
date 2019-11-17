package service;

import pojo.Admin;
import pojo.Student;

import java.util.List;
import java.util.Map;

public interface AdminService {
    public void insertAdmin(Admin admin);
    public Admin queryAdminByName(Map map);
}
