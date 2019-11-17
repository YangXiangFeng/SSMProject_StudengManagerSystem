package mapper;

import pojo.Admin;
import pojo.Student;

import java.util.List;
import java.util.Map;

public interface AdminMapper2 {
    public void insertAdmin(Admin admin);

//    public Admin queryAdmin(String name,String password);
    public Admin queryAdmin(Map map);

    List<Student> queryAllStudent();
}
