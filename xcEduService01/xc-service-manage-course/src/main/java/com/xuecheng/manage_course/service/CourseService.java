package com.xuecheng.manage_course.service;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.manage_course.dao.TeachplanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 李新宇
 * 2019-08-31 10:41
 */
@Service
public class CourseService {

    @Autowired
    TeachplanMapper teachplanMapper;

    //课程计划查询
    public TeachplanNode findTeachplanList(String courseId) {
        return teachplanMapper.selectList(courseId);
    }
}
