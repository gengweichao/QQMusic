package com.qfedu.dao;

import com.qfedu.pojo.Songs;

public interface SongsMapper {
    int deleteByPrimaryKey(Integer songid);

    int insert(Songs record);

    int insertSelective(Songs record);

    Songs selectByPrimaryKey(Integer songid);

    int updateByPrimaryKeySelective(Songs record);

    int updateByPrimaryKey(Songs record);
}