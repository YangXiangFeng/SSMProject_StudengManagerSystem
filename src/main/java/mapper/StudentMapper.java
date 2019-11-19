package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Clazz;
import pojo.Page;
import pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
//    ����ѧ��
    public void insertStudent(Student student);
//    ����idɾ��ѧ��
    public void deleteStudentById(int sid);
    //����ѧ����Ϣ
    public void updateStudentNameById(Map map);
    //��ѯ����ѧ��

    Student queryStudentById(int id);

    int queryTotalStudentNumber();

    List<Student> getStudentListByPage(Map map);

    List<Student> getAllStudentByPage(Map map);

    List<Student> getStudentByName(Map map);

    List<Student> getStudentByNameInClass(Map map);

    void updateStudentById(Student student);

    int getStudentNumberByClazzId(Integer clazzId);
}
