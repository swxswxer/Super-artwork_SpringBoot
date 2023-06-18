package com.swx.superartwork.domain;
import lombok.Data;

@Data
public class Comment {
    int  commentId;
    int userId;
    int paintingId;
    String comment;
    String date;
}
