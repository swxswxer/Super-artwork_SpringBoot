package com.swx.superartwork.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.superartwork.domain.Painting;

import java.util.List;

public interface PaintingService extends IService<Painting> {
    List getByStyle(String style);


}
