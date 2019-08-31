package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 李新宇
 * 2019-08-31 10:17
 */
@Mapper
public interface TeachplanMapper {

    //课程计划查询
    public TeachplanNode selectList(String courseId);
}
