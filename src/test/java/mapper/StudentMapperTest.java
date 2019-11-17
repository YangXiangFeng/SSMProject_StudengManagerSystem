package mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import utils.MybatisUtils;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class StudentMapperTest {
    @Test
    public void test() throws IOException {
        //先根据得到session是必须的
        MybatisUtils utils = new MybatisUtils();
        SqlSession sqlSession = utils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> list = mapper.queryStudent();
        for (Student s :
                list) {
            System.out.println(s.toString());
        }
    }
}