package com.swx.superartwork.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.superartwork.controller.utils.R;
import com.swx.superartwork.domain.Comment;
import com.swx.superartwork.domain.Recording;
import com.swx.superartwork.service.RecordingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/Recording")
public class RecordingController {
    @Autowired
    private RecordingService recordingService;

    @PostMapping("/addRecording")
    public R save(@RequestParam("paintingId") Integer paintingId , @RequestParam("userId") Integer userId) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String Sdate = formatter.format(date);
        Recording recording = new Recording();
        recording.setPaintingId(paintingId);
        recording.setDate(Sdate);
        recording.setUserId(userId);
        return new R(recordingService.save(recording));
    }

    @PostMapping("/getCommentByUserId")
    public R getRecordingByPaintingId(@RequestParam("userId") Integer userId) {

        QueryWrapper qw = new QueryWrapper();
        qw.eq("user_id",userId);
        return new R(true, recordingService.list(qw));
    }
}
