package com.swx.superartwork.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.superartwork.controller.utils.R;
import com.swx.superartwork.domain.Painting;
import com.swx.superartwork.domain.User;
import com.swx.superartwork.service.PaintingService;
import com.swx.superartwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/painting")
public class PaintingController {
    @Autowired
    private PaintingService paintingService;
    @Autowired
    private UserService userService;


    //   - `GET /paintings`: 获取所有画作的列表。
    @GetMapping
    public R getAll() {
        return new R(true, paintingService.list());
    }
    //   - `GET /paintings/{paintingId}`: 获取特定画作的详细信息。
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, paintingService.getById(id));
    }
    //查询某风格的所有画作
    @PostMapping("/searchByStyle")
    public R getByStyle(@RequestParam("style") String style) {
        return new R(true, paintingService.getByStyle(style));
    }
    //根据名字查询画作
    @PostMapping("/searchByName")
    public R search(@RequestParam("name") String name) {
        QueryWrapper qw = new QueryWrapper();
        qw.like("name", name);
        return new R(true, paintingService.list(qw));
    }
    //查询某个作者的所有画作
    @PostMapping("/searchByAuthor")
    public R getByAuthor(@RequestParam("author") String author) {
        QueryWrapper qw = new QueryWrapper();
        qw.eq("artist",author);
        return new R(true, paintingService.list(qw));
    }

    @PostMapping("/updataOwner")
    public R updataOwner(@RequestParam("userId") Integer userId, @RequestParam("paintingId") Integer paintingId) {

        Painting painting = paintingService.getById(paintingId);
        User user = userService.getById(userId);
        painting.setOwner(user.getUsername());

        return new R(true, paintingService.updateById(painting));
    }





}
