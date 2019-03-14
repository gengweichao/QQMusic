package com.qfedu.controller;

import com.qfedu.service.SingersService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengweichao
 * @date 2019/3/13 18:07
 */
@RestController
public class SingersController {
    @Autowired
    private SingersService singersService;

    //查询所有的歌手信息
    @RequestMapping("queryAllsinger.do")
    public ResultVo queryAllsinger1(){
        return singersService.selectAll();
    }


}
