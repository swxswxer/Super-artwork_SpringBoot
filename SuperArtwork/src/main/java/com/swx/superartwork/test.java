package com.swx.superartwork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(System.currentTimeMillis());
//        System.out.println(formatter.format(date));
        String s = formatter.format(date);
        System.out.println(s);
    }
}
