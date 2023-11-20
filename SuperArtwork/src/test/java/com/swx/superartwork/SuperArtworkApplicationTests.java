package com.swx.superartwork;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.superartwork.controller.utils.R;
import com.swx.superartwork.dao.PaintingDao;
import com.swx.superartwork.domain.User;
import com.swx.superartwork.service.CommentService;
import com.swx.superartwork.service.PaintingService;
import com.swx.superartwork.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@MapperScan("com.swx.superartwork.dao")
class SuperArtworkApplicationTests {


    @Autowired
    private UserService userService;
    @Autowired
    private PaintingService   paintingService;

    @Autowired
    private CommentService commentService;

    @Test
    void contextLoads() {
//        System.out.println(userService.list());
        QueryWrapper qw = new QueryWrapper();
        qw.eq("painting_id",1);
        commentService.list(qw).forEach(System.out::println);
    }

    @Test
    void testUserService(){
      ;
        User user = userService.getById(1);
        user.setRemark("test");
        userService.updateById(user);

    }

}
