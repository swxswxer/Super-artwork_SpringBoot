package com.swx.superartwork.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.superartwork.controller.utils.R;
import com.swx.superartwork.domain.Comment;
import com.swx.superartwork.service.CommentService;
import com.swx.superartwork.service.PaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/comment")

public class CommentController {
    @Autowired
    private CommentService commentService;


    @PostMapping("/publishedComment")
    public R save(@RequestParam("paintingId") Integer paintingId , @RequestParam("comment") String Scomment) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String Sdate = formatter.format(date);
        Comment comment = new Comment();
        comment.setPaintingId(paintingId);
        comment.setComment(Scomment);
        comment.setDate(Sdate);
        comment.setUserId(1);
        return new R(commentService.save(comment));
    }
    @PostMapping("/getCommentByPaintingId")
    public R getCommentByPaintingId(@RequestParam("paintingId") Integer paintingId) {

        QueryWrapper qw = new QueryWrapper();
        qw.eq("painting_id",paintingId);
        return new R(true, commentService.list(qw));
    }

}
