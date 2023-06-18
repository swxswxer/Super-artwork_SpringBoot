package com.swx.superartwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.superartwork.domain.Author;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorDao extends BaseMapper<Author> {
}
