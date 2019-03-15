package com.qfedu.dao;

import com.qfedu.pojo.NetCollect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NetCollect record);

    int insertSelective(NetCollect record);

    NetCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetCollect record);

    int updateByPrimaryKey(NetCollect record);

    List<String> selectAllByUid(int uid);

    int deleteByUidAndSid(NetCollect netCollect);

    NetCollect selectByUidAndSid(@Param("uid") int uid,@Param("sid") String sid);
}