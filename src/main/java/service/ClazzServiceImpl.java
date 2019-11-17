package service;

import mapper.ClazzMapper;
import pojo.Clazz;
import pojo.Page;

import java.util.List;

public class ClazzServiceImpl implements ClazzService {
    ClazzMapper clazzMapper;

    public void setClazzMapper(ClazzMapper clazzMapper) {
        this.clazzMapper = clazzMapper;
    }


    public List<Clazz> getClazzListByPage(Page page) {
        return clazzMapper.getClazzListByPage(page);
    }

    public List<Clazz> getAllClazz() {
        return clazzMapper.getAllClazzList();
    }
}
