package com.quint.mapper;

import com.quint.pojo.User;
import com.quint.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方法一:getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList1 = mapper.getUserList();

            //方法二：selectList
            List<User> userList2 = sqlSession.selectList("getUserList");

            for (User user : userList2) {
                System.out.println(user);
            }
        }catch (Exception e){
        }finally {
            sqlSession.close();
        }
    }
}
