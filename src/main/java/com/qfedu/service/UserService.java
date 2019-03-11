package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.ResultVo;


public interface UserService {
    //用户账号密码登录
    public ResultVo login(String name, String password);

    //增加用户
    public ResultVo addUser(User user);
}
