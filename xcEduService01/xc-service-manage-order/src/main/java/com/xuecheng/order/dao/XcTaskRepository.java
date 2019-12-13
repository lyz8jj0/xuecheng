package com.xuecheng.order.dao;

import com.xuecheng.framework.domain.task.XcTask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * @author by 李新宇
 * @date 2019-12-12 10:06
 */
public interface XcTaskRepository extends JpaRepository<XcTask,String> {
    //查询某个时间之前的n条任务
    Page<XcTask> findByUpdateTimeBefore(Pageable pageable, Date updateTime);
}
