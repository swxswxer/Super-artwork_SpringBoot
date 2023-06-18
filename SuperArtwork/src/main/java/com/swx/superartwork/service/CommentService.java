package com.swx.superartwork.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.superartwork.domain.Comment;

import java.util.List;

public interface CommentService extends IService<Comment> {
    List getCommentByPaintingId(Integer paintingId);
}
