package com.swx.superartwork.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.superartwork.dao.PaintingDao;
import com.swx.superartwork.domain.Painting;
import com.swx.superartwork.service.PaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaintingServiceImpl extends ServiceImpl<PaintingDao, Painting> implements PaintingService {

    @Autowired
    PaintingDao paintingDao;
    @Override
    public List getByStyle(String style) {
        return paintingDao.getByStyle(style);
    }


}
