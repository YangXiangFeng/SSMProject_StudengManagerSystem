package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Clazz;
import pojo.Page;
import pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
//    新增学生
    public void insertStudent(Student student);
//    根据id删除学生
    public void deleteStudentById(int sid);
    //更新学生信息
    public void updateStudentNameById(Map map);
    //查询所有学生

    Student queryStudentById(int id);

    int queryTotalStudentNumber();

    List<Student> getStudentListByPage(Map map);

    List<Student> getAllStudentByPage(Map map);

    List<Student> getStudentByName(Map map);

    List<Student> getStudentByNameInClass(Map map);

    void updateStudentById(Student student);

    int getStudentNumberByClazzId(Integer clazzId);
}
