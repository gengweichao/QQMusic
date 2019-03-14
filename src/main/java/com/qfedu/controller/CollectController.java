package com.qfedu.controller;

import com.qfedu.pojo.NetCollect;
import com.qfedu.service.SongsService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengweichao
 * @date 2019/3/14 21:56
 */
@RestController
public class CollectController {

    @Autowired
    private SongsService service;

    @RequestMapping("netadd.do")
    public ResultVo addCollect(NetCollect collect){
       return service.addCollect(collect);
    }
    @RequestMapping("netquery.do")
    public ResultVo queryAllCollect(int uid){
        return service.selectAllSidByUid(uid);
    }
    @RequestMapping("netdel.do")
    public ResultVo delCollect(NetCollect netCollect){
        return  service.delCollectBySidAndUid(netCollect);
    }
}
