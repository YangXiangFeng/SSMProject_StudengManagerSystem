package service;

import mapper.ClazzMapper;
import pojo.Clazz;
import pojo.Page;

import java.util.List;
import java.util.Map;

import static org.springframework.util.StringUtils.isEmpty;

public class ClazzServiceImpl implements ClazzService {
    ClazzMapper clazzMapper;

    public void setClazzMapper(ClazzMapper clazzMapper) {
        this.clazzMapper = clazzMapper;
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
        if (isEmpty(map.get("clazzName"))) {  //������ȫ����ѯ
            return clazzMapper.getClazzListByPage(map);
        } else {
            System.out.println("the name of query:"+map.get("clazzName"));
            //������ģ����ѯ
            return clazzMapper.getClazzByName(map);
        }
    }

    public List<Clazz> getAllClazz() {
        return clazzMapper.getAllClazzList();
    }
}
