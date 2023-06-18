package com.swx.superartwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.superartwork.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
