package com.qfedu.controller;

import com.qfedu.pojo.Collect;
import com.qfedu.service.CollectService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengweichao
 * @date 2019/3/13 22:21
 */
@RestController
@CrossOrigin
public class CollerController {
    @Autowired
    private CollectService collectService;

    @RequestMapping("addColler.do")
    public ResultVo addColl(Collect collect){
        return collectService.addByUidSidCollect(collect);
    }
    @RequestMapping("delColler.do")
    public ResultVo delColl(Collect collect){
        return collectService.delectByUidSidCollect(collect);
    }

    @RequestMapping("queryByUidColler.do")
    public ResultVo queryByUid(int uid){
        return collectService.selectByUidCollect(uid);
    }
}
