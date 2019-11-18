package service;

import mapper.StudentMapper;
import org.apache.ibatis.jdbc.Null;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Page;
import pojo.Student;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.springframework.util.StringUtils.isEmpty;

public class StudentServiceImpl implements StudentService {
    private StudentMapper mapper;

    public StudentMapper getMapper() {
        return mapper;
    }

    public void setMapper(StudentMapper mapper) {
        this.mapper = mapper;
    }
    //    private ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    public List<Student> queryStudent() {
        return null;
    }

    //��
    public void insertStudent(Student student) {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.insertStudent(student);
    }

    @Test
    public void deleteStudentById() {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.deleteStudentById(1);
    }

    //ɾ
    public void deleteStudentById(int id) {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.deleteStudentById(id);
    }

    //��
    public void updateStudentNameById(Map map) {
//        StudentMapper mapper = (StudentMapper)context.getBean("studentMapper");
        mapper.updateStudentNameById(map);
    }


    public Student queryStudentById(int id) {
        return mapper.queryStudentById(id);
    }

    public List<Student> queryStudentByPage(int page) {
        return null;
    }

    public int getTotalNumber() {
        return mapper.queryTotalStudentNumber();
    }

    public List<Student> getStudentListByPage(Map map) {
        if (isEmpty(map.get("clazzId")) && isEmpty(map.get("studentName"))) {  //������ȫ����ѯ
            return mapper.getAllStudentByPage(map);
        } else if (!isEmpty(map.get("studentName")) && map.get("clazzId").equals(0)) {
            //������ģ����ѯ
            return mapper.getStudentByName(map);
        } else
            //�԰༶�ж�����ģ����ѯ
//            if (!isEmpty(map.get("studentName")) && !map.get("clazzId").equals(0)) {
            return mapper.getStudentByNameInClass(map);
    }
}

