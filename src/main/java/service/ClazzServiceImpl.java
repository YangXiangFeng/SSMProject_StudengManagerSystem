package service;

import mapper.ClazzMapper;
import mapper.StudentMapper;
import pojo.Clazz;

import java.util.List;
import java.util.Map;

import static org.springframework.util.StringUtils.isEmpty;

public class ClazzServiceImpl implements ClazzService {
    private ClazzMapper clazzMapper;
    StudentMapper studentMapper;

    public void setClazzMapper(ClazzMapper clazzMapper) {
        this.clazzMapper = clazzMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int deleteClazz(Integer clazzId) {
//        先看看对应的班级有没有学生,如果有就不能删除
        int num = studentMapper.getStudentNumberByClazzId(clazzId);
        if (num > 0){
            return 0; //代表失败
        }else {
            clazzMapper.deleteClazz(clazzId);
            return 1;
        }
    }

    public int getTotalClazz() {
        return clazzMapper.getTotalClazz();
    }

    public void addClazz(Clazz clazz) {
        clazzMapper.addClazz(clazz);
    }

    public void updateClazzById(Clazz clazz) {
        clazzMapper.updateClazzById(clazz);
    }


    public List<Clazz> getClazzListByPage(Map map) {
        if (isEmpty(map.get("clazzName"))) {  //无条件全部查询
            return clazzMapper.getClazzListByPage(map);
        } else {
            System.out.println("the name of query:"+map.get("clazzName"));
            //对姓名模糊查询
            return clazzMapper.getClazzByName(map);
        }
    }

    public List<Clazz> getAllClazz() {
        return clazzMapper.getAllClazzList();
    }
}
