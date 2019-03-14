package com.qfedu.dao;


import com.qfedu.pojo.Collect;
import com.qfedu.vo.CollectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    //查询用户是否收藏指定歌曲,用于收藏时判断是否已经收藏
    //根据uid和sid判断
    Collect queryByUidSid(@Param("uid") int uid,@Param("sid") int sid);
    //收藏歌曲
    int addCollect(Collect collect);
    //取消歌单
    int delectCollct(Collect collect);

    //查询指定用户收藏的所有歌曲
    List<CollectVO> queryByCollect(int uid);
}