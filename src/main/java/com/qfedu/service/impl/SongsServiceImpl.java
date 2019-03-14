package com.qfedu.service.impl;

import com.qfedu.dao.NetCollectMapper;
import com.qfedu.dao.SongsMapper;
import com.qfedu.pojo.NetCollect;
import com.qfedu.pojo.Songs;
import com.qfedu.service.SongsService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.SongsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gengweichao
 * @date 2019/3/13 16:06
 */
@Service
public class SongsServiceImpl implements SongsService {
    @Autowired
    private SongsMapper songsMapper;
    @Autowired
    private NetCollectMapper netDao;
    @Override
    public ResultVo selectBySongsName(String songname) {
        Songs list = songsMapper.queryBySongsName(songname);
        if(list != null) {
            return ResultUtil.exec(true,"查询成功",list);
        }else{
            return ResultUtil.exec(false,"没有该歌曲",null);
        }

    }

    @Override
    public ResultVo selectAll() {
        List<Songs> list = songsMapper.queryAllSongs();
        if(list != null){
            return ResultUtil.exec(true,"查询所有歌曲信息",list);
        }else{
            return ResultUtil.exec(false,"查询失败",null);
        }


    }

    @Override
    public ResultVo selectAllById(int singid) {
        List<SongsVO> list = songsMapper.queryBySonger(singid);

        if(list != null){
            return ResultUtil.exec(true,"查询所有歌曲信息",list);
        }else{
            return ResultUtil.exec(false,"查询失败",null);
        }
    }

    @Override
    public ResultVo selectAllByName(String name) {
        List<SongsVO> list = songsMapper.queryBySongerName(name);
        if(list != null){
            return ResultUtil.exec(true,"查询所有歌曲信息",list);
        }else{
            return ResultUtil.exec(false,"查询失败",null);
        }
    }

    @Override
    public ResultVo updateSongsTimes(int sid) {
        Songs songs = songsMapper.queryBusid(sid);

        Integer times1 = songs.getTimes();
        int times;
        times=times1+1;
        songsMapper.updateTimes(times,sid);


        return ResultUtil.exec(true,"OK",null);
    }

    //增加收藏，需要参数用户ID和歌曲ID，返回ResultVo
    @Override
    public ResultVo addCollect(NetCollect collect) {
        NetCollect netCollect = netDao.selectByUidAndSid(collect.getUid(), collect.getSid());
        if (netCollect != null) {
            return ResultUtil.exec(false,"歌曲已收藏",null);
        }
        netDao.insertSelective(collect);
        return ResultUtil.exec(true,"收藏成功",null);
    }

    @Override
    public ResultVo selectAllSidByUid(int uid) {
        List<String> list = netDao.selectAllByUid(uid);
        if (list == null){
            return  ResultUtil.exec(false,"未收藏任何歌曲",null);
        }
        return ResultUtil.exec(true,"OK",list);
    }

    @Override
    public ResultVo delCollectBySidAndUid(NetCollect netCollect) {

        return ResultUtil.exec(netDao.deleteByUidAndSid(netCollect)>0,"取消收藏成功",null);
    }
}
