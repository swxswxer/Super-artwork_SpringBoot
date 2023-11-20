package com.swx.superartwork.domain;
import lombok.Data;

@Data
public class Recording {
    int  id;
    int userId;
    int paintingId;
    String date;
}
