package com.swx.superartwork.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.superartwork.dao.CommentDao;
import com.swx.superartwork.domain.Comment;
import com.swx.superartwork.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {
    @Autowired
    CommentDao commentDao;
    @Override
    public List getCommentByPaintingId(Integer paintingId) {
        return commentDao.getCommentByPaintingId(paintingId);
    }
}
