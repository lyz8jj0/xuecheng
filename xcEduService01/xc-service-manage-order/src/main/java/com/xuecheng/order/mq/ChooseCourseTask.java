package com.xuecheng.order.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author by 李新宇
 * @date 2019-12-11 15:56
 */
@Component
public class ChooseCourseTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChooseCourseTask.class);

    //定义任务调试策略
    @Scheduled(cron = "0/3 * * * * *")//每隔3秒去执行
    public void task1() {
        LOGGER.info("=================测试定时任务1开始=================");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("=================测试定时任务1结束=================");

    }


}
