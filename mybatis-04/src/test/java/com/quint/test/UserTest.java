package com.quint.test;

import com.quint.mapper.UserMapper;
import com.quint.pojo.User;
import com.quint.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class   UserTest {
    public static void main(String[] args) {

    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(2);
        System.out.println(user);

        sqlSession.commit();
        sqlSession.close();
    }
}
