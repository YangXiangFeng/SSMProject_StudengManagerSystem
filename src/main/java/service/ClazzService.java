package service;

import pojo.Clazz;

import java.util.List;
import java.util.Map;

public interface ClazzService {
    List<Clazz> getAllClazz();
    List<Clazz> getClazzListByPage(Map map);

    void updateClazzById(Clazz clazz);

    void addClazz(Clazz clazz);

    int getTotalClazz();

    int deleteClazz(Integer clazzId);
}
