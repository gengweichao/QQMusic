package com.qfedu.dao;

import com.qfedu.pojo.Singers;

public interface SingersMapper {
    int deleteByPrimaryKey(Integer singid);

    int insert(Singers record);

    int insertSelective(Singers record);

    Singers selectByPrimaryKey(Integer singid);

    int updateByPrimaryKeySelective(Singers record);

    int updateByPrimaryKey(Singers record);
}