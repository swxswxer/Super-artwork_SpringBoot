package com.swx.superartwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.superartwork.domain.Painting;
import com.swx.superartwork.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("SELECT * FROM tbl_user WHERE username = #{username}")
    public User getByUsername(String username);

}
