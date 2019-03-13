package com.qfedu.dao;

import com.qfedu.pojo.Singers;
import com.qfedu.vo.SongsVO;

import java.util.List;

public interface SingersMapper {
    int deleteByPrimaryKey(Integer singid);

    int insert(Singers record);

    int insertSelective(Singers record);

    Singers selectByPrimaryKey(Integer singid);

    int updateByPrimaryKeySelective(Singers record);

    int updateByPrimaryKey(Singers record);

    //查询所有歌手
    List<Singers> queryAll();
}