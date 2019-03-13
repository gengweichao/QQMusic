package com.qfedu.dao;

import com.qfedu.pojo.Songs;
import com.qfedu.vo.SongsVO;

import java.util.List;

public interface SongsMapper {
    int deleteByPrimaryKey(Integer songid);

    int insert(Songs record);

    int insertSelective(Songs record);

    Songs selectByPrimaryKey(Integer songid);

    int updateByPrimaryKeySelective(Songs record);

    int updateByPrimaryKey(Songs record);

    //根据歌曲名字查找歌曲的信息
    Songs queryBySongsName(String songname);
    //查询所有的歌曲
    List<Songs> queryAllSongs();
    //根据歌手ID查询所有歌曲信息
    List<SongsVO> queryBySonger(int singid);
    //根据歌手名字查询所有歌曲信息
    List<SongsVO> queryBySongerName(String name);


}