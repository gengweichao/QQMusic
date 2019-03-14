package com.qfedu.service.impl;

import com.qfedu.dao.CollectMapper;
import com.qfedu.pojo.Collect;
import com.qfedu.service.CollectService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.CollectVO;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gengweichao
 * @date 2019/3/13 22:18
 */
@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;
    @Override
    public ResultVo addByUidSidCollect(Collect collect) {
        Collect collect1 = collectMapper.queryByUidSid(collect.getUid(), collect.getSid());
        if(collect1 == null){
            return ResultUtil.exec(collectMapper.addCollect(collect)>0,"收藏歌单",null);
        }else {
            return ResultUtil.exec(false,"已经收藏该歌曲",null);
        }

    }

    @Override
    public ResultVo delectByUidSidCollect(Collect collect) {
        return ResultUtil.exec(collectMapper.delectCollct(collect)>0,"OK",null);
    }

    @Override
    public ResultVo selectByUidCollect(int uid) {
        List<CollectVO> list = collectMapper.queryByCollect(uid);
        if(list != null){
            return ResultUtil.exec(true,"查询用户的收藏歌单",list);
        }else{
            return ResultUtil.exec(false,"查询失败",null);
        }
    }
}
