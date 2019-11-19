package service;

import mapper.TeacherMapper;
import pojo.Teacher;

import java.util.List;
import java.util.Map;

import static org.springframework.util.StringUtils.isEmpty;

public class TeacherServiceImpl implements TeacherService {
    private TeacherMapper teacherMapper;

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public void deleteTeacher(String teacherIds) {
        teacherMapper.deleteTeacher(teacherIds);
    }

    public int getTotalTeacher() {
        return teacherMapper.getTotalTeacher();
    }

    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }

    public void updateTeacherById(Teacher teacher) {
        teacherMapper.updateTeacherById(teacher);
    }


    public List<Teacher> getTeacherListByPage(Map map) {
        if (isEmpty(map.get("teacherName"))) {  //无条件全部查询
            List<Teacher> teachers = teacherMapper.getTeacherListByPage(map);
            for (Teacher t :
                    teachers) {
                System.out.println(t.toString());
            }
            return teacherMapper.getTeacherListByPage(map);
        } else {
            System.out.println("the name of query:" + map.get("teacherName"));
            //对姓名模糊查询
            return teacherMapper.getTeacherByName(map);
        }
    }

    public List<Teacher> getAllTeacher() {
        return teacherMapper.getAllTeacherList();
    }
}
