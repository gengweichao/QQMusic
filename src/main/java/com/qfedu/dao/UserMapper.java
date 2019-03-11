package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //根据名字查找是否有存在的用户
    @Select("select * from t_user where userphone=#{name}")
    @ResultType(User.class)
    User selectByName(String name);

  /* //增加用户
    @Insert("insert into t_user(username,password,phone,email,sex) values(#{name},#{password},#{phone},#{email},#{sex})")
    void addUser(String name,String password,String phone,String email,String sex);*/

    int addUser1(User user);
}