package mapper;

import pojo.Clazz;
import pojo.Page;

import java.util.List;

public interface ClazzMapper {
    List<Clazz> getAllClazzList();

    List<Clazz> getClazzListByPage(Page page);

}
