package com.qfedu.service.impl;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;
    @Override
    public ResultVo login(String name, String password) {

        User user = userDao.selectByName(name);

        if(user != null &&user.getUsertatu().equals("1") && user.getUserpassword().equalsIgnoreCase(password)){
            return ResultUtil.exec(true,"登录成功",null);
        } else{
            return ResultUtil.exec(false,"登录失败，请重新登录",null);
        }





    }

    @Override
    public ResultVo addUser(User user) {

              User user1 = userDao.selectByName(user.getUsername());
              if(user1 == null) {
                  userDao.addUser1(user);
                  return ResultUtil.exec(true,"注册成功",null);
              } else {
                  return ResultUtil.exec(false,"用户名已存在",null);
              }






    }
}
