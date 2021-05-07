package com.quint.mapper;

import com.quint.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //增加一个用户
    void addUser(User user);

    //根据ID删除已给用户
    void deleteUser(int id);

    //更改此ID的用户为
    void updateUser(User user);

    //根据ID查询用户
    User getUserById(int id);

    //查询全部用户，返回list
    List<User> listUser();

    //通过map传参增加一个用户 甚至不需要实体类
    void addUser_map(Map<String,Object> map);

    //模糊查询
    List<User> getUserLike(String str);

}
