package com.xuecheng.order.service;

import com.xuecheng.framework.domain.task.XcTask;
import com.xuecheng.order.dao.XcTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author by 李新宇
 * @date 2019-12-12 17:33
 */
@Service
public class TaskService {

    @Autowired
    XcTaskRepository xcTaskRepository;

    //查询前n条任务
    public List<XcTask> findXcTaskList(Date updateTime, int size) {
        //设置分页参数
        Pageable pageable = new PageRequest(0, size);
        //查询前n条记录
        Page<XcTask> all = xcTaskRepository.findByUpdateTimeBefore(pageable, updateTime);
        List<XcTask> list = all.getContent();
        return list;
    }

}
