package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 李新宇
 * 2019-08-31 11:10
 */
public interface TeachplanRepository extends JpaRepository<Teachplan,String> {

    //根据课程id和parentid查询teanchplan
    public List<Teachplan> findByCourseidAndParentid(String courseId, String parentId);
}
