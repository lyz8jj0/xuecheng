package com.xuecheng.api.course;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by 李新宇
 * 2019-08-30 17:59
 */
@Api(value = "课程管理接口",description = "课程管理接口, 提供课程的增, 删, 改, 查")
public interface CourseControllerApi {

    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String courseId);
}
