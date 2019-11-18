package service;

import pojo.Page;
import pojo.Student;

import java.util.List;
import java.util.Map;

/*
* һ��dao����һ��service,�����������,daoֻ��������Ĳ���
* Ȼ��Ҫ�������ӵ�ҵ��,�����ҳ,Ҫ��дҵ��
* */
public interface StudentService {
    //    ����ѧ��
    public void insertStudent(Student student);
    //    ����idɾ��ѧ��
    public void deleteStudentById(int id);
    //����ѧ����Ϣ
    public void updateStudentNameById(Map map);
    //��ѯ����ѧ��
    public List<Student> queryStudent();

    Student queryStudentById(int id);

    List<Student> queryStudentByPage(int page);

    List<Student> getStudentListByPage(Map map);

    int getTotalNumber();
}
