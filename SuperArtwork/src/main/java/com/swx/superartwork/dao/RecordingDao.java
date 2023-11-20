package com.swx.superartwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.superartwork.domain.Recording;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordingDao extends BaseMapper<Recording> {
//    @Select("select * from tbl_comment where paintingId = #{paintingId}")
//    public List<Comment> getCommentByPaintingId(int paintingId);

}