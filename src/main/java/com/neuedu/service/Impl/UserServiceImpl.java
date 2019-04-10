package com.neuedu.service.Impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.pojo.UserExample;
import com.neuedu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mabaicong on 2019/4/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> list() {
        PageHelper.startPage(1,3);
        return userMapper.selectByExample(new UserExample());
    }
}
