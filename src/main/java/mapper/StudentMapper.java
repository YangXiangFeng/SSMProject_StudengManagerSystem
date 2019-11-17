package mapper;

import org.apache.ibatis.annotations.Param;
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
    public List<Student> queryStudent();

    Student queryStudentById(int id);

    List<Student> findStudentByPage(int page);

    List<Student> getSudentListByPage(Page page);
}
