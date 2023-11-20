package com.swx.superartwork.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.superartwork.dao.UserDao;
import com.swx.superartwork.domain.User;
import com.swx.superartwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserByName(String username) {
        return userDao.getByUsername(username);
    }
}
