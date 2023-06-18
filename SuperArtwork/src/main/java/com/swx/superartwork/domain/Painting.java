package com.swx.superartwork.domain;
import lombok.Data;

import java.util.Date;
@Data
public class Painting {
    int id ;
    String name;
    String artist;
    String description;
    String image;
    String Style;
    String date;
}
