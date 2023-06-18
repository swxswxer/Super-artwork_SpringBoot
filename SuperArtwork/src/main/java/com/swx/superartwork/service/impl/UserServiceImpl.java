package com.swx.superartwork.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.superartwork.dao.UserDao;
import com.swx.superartwork.domain.User;
import com.swx.superartwork.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
