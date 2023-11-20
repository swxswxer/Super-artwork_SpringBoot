package com.swx.superartwork.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.superartwork.dao.CommentDao;
import com.swx.superartwork.dao.RecordingDao;
import com.swx.superartwork.domain.Comment;
import com.swx.superartwork.domain.Recording;
import com.swx.superartwork.service.CommentService;
import com.swx.superartwork.service.RecordingService;
import org.springframework.stereotype.Service;

@Service
public class RecordingServiceImpl extends ServiceImpl<RecordingDao, Recording> implements RecordingService {
}
