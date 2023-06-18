package com.swx.superartwork;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("com.swx.superartwork.mapper")
@SpringBootApplication
public class SuperArtworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperArtworkApplication.class, args);
    }

}
