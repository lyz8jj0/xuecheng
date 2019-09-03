package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CoursePic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 李新宇
 * 2019-09-03 11:27
 */
public interface CoursePicRepository extends JpaRepository<CoursePic, String> {

    //当返回值大于0, 表示删除成功的记录数
    @Modifying
    @Transactional
    long deleteByCourseid(String courseId);
}
