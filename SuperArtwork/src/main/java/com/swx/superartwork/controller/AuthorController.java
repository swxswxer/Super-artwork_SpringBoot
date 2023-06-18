package com.swx.superartwork.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.superartwork.controller.utils.R;
import com.swx.superartwork.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/author")
public class AuthorController {
@Autowired
private AuthorService authorService;

    @GetMapping
    public R getAll() {
        return new R(true, authorService.list());
    }

    @GetMapping("/{id}")
    public R getAuthorById(@PathVariable int id) {
        return new R(true, authorService.getById(id));
    }

    @PostMapping("/searchByName")
    public R searchByName(@RequestParam("name") String name) {
        QueryWrapper qw = new QueryWrapper();
        qw.like("name", name);
        return new R(true, authorService.list(qw));
    }


}
