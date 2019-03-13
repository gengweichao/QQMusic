package com.qfedu.service.impl;

import com.qfedu.dao.SingersMapper;
import com.qfedu.pojo.Singers;
import com.qfedu.service.SingersService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gengweichao
 * @date 2019/3/13 18:05
 */
@Service
public class SingersServiceImpl implements SingersService {
    @Autowired
    private SingersMapper singersMapper;
    @Override
    public ResultVo selectAll() {
        List<Singers> list = singersMapper.queryAll();


        if(list != null){
            return ResultUtil.exec(true,"查询所有歌手信息",list);
        }else{
            return ResultUtil.exec(false,"查询失败",null);
        }
    }
}
