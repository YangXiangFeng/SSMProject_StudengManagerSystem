package mapper;

import pojo.Clazz;
import pojo.Page;

import java.util.List;
import java.util.Map;

public interface ClazzMapper {
    List<Clazz> getAllClazzList();

    List<Clazz> getClazzListByPage(Map map);

    void updateClazzById(Clazz clazz);

    void addClazz(Clazz clazz);

    int getTotalClazz();

    List<Clazz> getClazzByName(Map map);

    void deleteClazz(Integer clazzId);

}
