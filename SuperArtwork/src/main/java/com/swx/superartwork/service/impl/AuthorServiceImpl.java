package com.swx.superartwork.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.superartwork.dao.AuthorDao;
import com.swx.superartwork.domain.Author;
import com.swx.superartwork.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorDao, Author>  implements AuthorService{
}
