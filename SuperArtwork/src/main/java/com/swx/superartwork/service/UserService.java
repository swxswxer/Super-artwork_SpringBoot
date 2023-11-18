package com.swx.superartwork.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.superartwork.domain.User;

import java.util.List;

public interface UserService extends IService<User> {

    User getUser(String username);

}
