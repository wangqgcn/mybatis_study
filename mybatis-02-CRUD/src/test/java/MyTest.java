import com.quint.mapper.UserMapper;
import com.quint.pojo.User;
import com.quint.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(3,"UserUser","2414144"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser_Map(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userid",6);
        map.put("username","daw11da");
        map.put("password","123456");
        mapper.addUser_map(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(3);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.getUserById(4);
        u.setName("newUser");
        u.setPwd("adawada");
        mapper.updateUser(u);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(44);
        System.out.println(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void listUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.listUser();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserLike("User");

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }

}
