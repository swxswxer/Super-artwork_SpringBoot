package com.swx.superartwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.superartwork.domain.Painting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PaintingDao extends BaseMapper<Painting> {

    @Select("SELECT * FROM tbl_painting WHERE style = #{style}")
    List<Painting> getByStyle(String style);

}
