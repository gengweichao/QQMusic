package com.qfedu.controller;

import com.qfedu.service.SongsService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengweichao
 * @date 2019/3/13 16:13
 */
@RestController
public class SongsController {
    @Autowired
    private SongsService songsService;

    //根据歌曲名查询
    @RequestMapping("queryByName.do")
    public ResultVo queryBySongName(String songname){
        return songsService.selectBySongsName(songname);
    }

    //查询所有的歌曲信息
    @RequestMapping("queryAll.do")
    public ResultVo queryAll(){
        return songsService.selectAll();
    }
    //根据歌手ID查询他的所有歌曲
    @RequestMapping("queryBySongerID.do")
    public ResultVo queryByID(int singid){
        return songsService.selectAllById(singid);
    }

    //根据歌手名字查询他的所有歌曲
    @RequestMapping("queryBySongerName.do")
    public ResultVo queryByID(String name){
        return songsService.selectAllByName(name);
    }
}
