package com.qfedu.service;

import com.qfedu.pojo.NetCollect;
import com.qfedu.pojo.Songs;
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
    //增加点击量
    public ResultVo updateSongsTimes(int sid);

    //添加收藏
    public ResultVo addCollect(NetCollect collect);

    //根据用户ID查找收藏的歌曲ID
    public ResultVo selectAllSidByUid(int uid);

    //删除歌曲收藏
    public ResultVo delCollectBySidAndUid(NetCollect netCollect);
}
