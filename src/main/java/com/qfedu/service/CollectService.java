package com.qfedu.service;

import com.qfedu.pojo.Collect;
import com.qfedu.vo.ResultVo;

/**
 * @author gengweichao
 * @date 2019/3/13 22:17
 */
public interface CollectService {
    public ResultVo addByUidSidCollect(Collect collect);

    public ResultVo delectByUidSidCollect(Collect collect);

    public ResultVo selectByUidCollect(int uid);
}
