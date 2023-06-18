package com.swx.superartwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.superartwork.domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentDao extends BaseMapper<Comment> {
    @Select("select * from tbl_comment where paintingId = #{paintingId}")
    public List<Comment> getCommentByPaintingId(int paintingId);

}
