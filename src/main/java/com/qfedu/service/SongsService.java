package com.qfedu.service;

import com.qfedu.vo.ResultVo;

/**
 * @author gengweichao
 * @date 2019/3/13 16:04
 */
public interface SongsService {
    //根据详细的歌曲名字获取歌曲所有的信息
    public ResultVo selectBySongsName(String songname);
    //查询所有的歌曲信息
    public ResultVo selectAll();
    //根据歌手ID查询所有的歌曲
    public ResultVo selectAllById(int singid);
    //根据歌手ID查询所有的歌曲
    public ResultVo selectAllByName(String name);
}
