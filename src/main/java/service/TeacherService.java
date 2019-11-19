package service;

import pojo.Teacher;
import java.util.List;
import java.util.Map;

public interface TeacherService {
    List<Teacher> getAllTeacher();
    List<Teacher> getTeacherListByPage(Map map);

    void updateTeacherById(Teacher teacher);

    void addTeacher(Teacher teacher);

    int getTotalTeacher();

    void deleteTeacher(String teacherId);
}
