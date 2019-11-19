package mapper;

import pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
    List<Teacher> getAllTeacherList();

    List<Teacher> getTeacherListByPage(Map map);

    void updateTeacherById(Teacher teacher);

    void addTeacher(Teacher teacher);

    int getTotalTeacher();

    List<Teacher> getTeacherByName(Map map);

    void deleteTeacher(List<Integer> idList);

}
