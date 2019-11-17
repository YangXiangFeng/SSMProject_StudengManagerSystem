package service;

import mapper.StudentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Page;
import pojo.Student;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService{
    private StudentMapper mapper;

    public StudentMapper getMapper() {
        return mapper;
    }

    public void setMapper(StudentMapper mapper) {
        this.mapper = mapper;
    }
    //    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    @Test
    public void test(){
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        Date date = new Date();
        date.getTime();
//        Student student1 = new Student(5,"aaa","woman","111",date,"play","student");
//        mapper.insertStudent(student1);
    }

    //Ôö
    public void insertStudent(Student student) {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.insertStudent(student);
    }

    @Test
    public void deleteStudentById() {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.deleteStudentById(1);
    }

    //É¾
    public void deleteStudentById(int id) {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.deleteStudentById(id);
    }

    //¸Ä
    public void updateStudentNameById(Map map) {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.updateStudentNameById(map);
    }

    //²é
    public List<Student> queryStudent() {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        return  mapper.queryStudent();
    }

    public Student queryStudentById(int id) {
        return mapper.queryStudentById(id);
    }


    public List<Student> getStudentListByPage(Page page) {
        return mapper.getSudentListByPage(page);
    }

    public List<Student> queryStudentByPage(int page) {
        return mapper.findStudentByPage(page);
    }
}
