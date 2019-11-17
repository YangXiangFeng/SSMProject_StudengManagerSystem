package service;

import pojo.Clazz;
import pojo.Page;

import java.util.List;

public interface ClazzService {
    List<Clazz> getAllClazz();
    List<Clazz> getClazzListByPage(Page page);

}
