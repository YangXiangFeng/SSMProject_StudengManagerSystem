package service;

import pojo.Page;
import pojo.Student;

import java.util.List;
import java.util.Map;

/*
* 一个dao就有一个service,这是最基本的,dao只是最基本的操作
* 然后要想做复杂的业务,比如分页,要多写业务
* */
public interface StudentService {
    //    新增学生
    public void insertStudent(Student student);
    //    根据id删除学生
    public void deleteStudentById(int id);
    //更新学生信息
    public void updateStudentNameById(Map map);
    //查询所有学生
    public List<Student> queryStudent();

    Student queryStudentById(int id);

    List<Student> queryStudentByPage(int page);

    List<Student> getStudentListByPage(Map map);

    int getTotalNumber();
}
