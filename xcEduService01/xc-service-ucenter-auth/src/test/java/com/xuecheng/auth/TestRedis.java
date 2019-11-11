package com.xuecheng.auth;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by 李新宇
 * 2019-10-12 17:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRedis {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    //创建jwt令牌
    @Test
    public void testRedis() {
        //定义key
        String key = "user_token:fd99af61-c0cc-40d7-9203-824afdbd48dc";
        //定义value
        Map<String,String> value = new HashMap<>();
        value.put("jwt", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6Iml0Y2FzdCIsInNjb3BlIjpbImFwcCJdLCJuYW1lIjpudWxsLCJ1dHlwZSI6bnVsbCwiaWQiOm51bGwsImV4cCI6MTU3MTE0ODA5MywianRpIjoiZmQ5OWFmNjEtYzBjYy00MGQ3LTkyMDMtODI0YWZkYmQ0OGRjIiwiY2xpZW50X2lkIjoiWGNXZWJBcHAifQ.kI38atZFY7IiimEaoHZca2ECS3TB80a1EW8APKA3nzN6YYbPRTQ9JnEY5x7TJjwjB0xMo9yYJWjHABoJNlnYl3lxodu2jgy2-YUhdSLY4Z1Z6Qj65VUlqJhS_3v5bT-mwv9ACtQmPCA-mdhCxX-rqT7NbRlFM6n27fnClj_HIGKpihyvdI9IUyhYinAqEciIP5obSb7xKR54FSR8TqHFFaCQ4Zp8qvc1dzASFJA5z611Ay3Q-rjYqOQV91FH-BxadWPmqJEdAbw4EJNH0sNBpnpnIXUQzG4b40rcDS2TtFCV1iVdhmubVhuB01fzQd2V5zGdVNPjch0zi1XKY5PPiw");
        value.put("refresh_token", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6Iml0Y2FzdCIsInNjb3BlIjpbImFwcCJdLCJhdGkiOiJmZDk5YWY2MS1jMGNjLTQwZDctOTIwMy04MjRhZmRiZDQ4ZGMiLCJuYW1lIjpudWxsLCJ1dHlwZSI6bnVsbCwiaWQiOm51bGwsImV4cCI6MTU3MTE0ODA5MywianRpIjoiNzhlODlkM2YtYWRiMC00YjI4LWFjYjctNDFlY2I3NWRiNzljIiwiY2xpZW50X2lkIjoiWGNXZWJBcHAifQ.RI08Dpb4JLVw3kT2w3uJAGpcyuK8L0VbppzI-TBn16dC1nhOK6Gij5_qsWRckUNF848gL9oameKHzG3VA0VTeXcHYp-_lcDFdfGVYmeIDT-mglsNBAlI7xl_vp0OOOQie_Eef0Uy-zNWWo5ZM1yJGMbEzh8VhnTD0gAWf2_2iZRZ655Db-QYDwOggM5XEmZKeLltpbZ-kT7f18ZIbvrBmhOJ4EmujJySxIxtvm_COQcITy3CoPWyGSYuVx43HOxVoCNVsT99twR3Kit_5uakmxxxX9ed9__CnkHTtbhJzilIzLRaz_zWqr4gNme14Xs403yzn0g6Daj-uwvzaGmZQQ");
        String jsonString = JSON.toJSONString(value);

        //存钱数据
        stringRedisTemplate.boundValueOps(key).set(jsonString,30, TimeUnit.SECONDS);
        //获取数据
        String string = stringRedisTemplate.opsForValue().get(key);
        System.out.println(string);


    }
}
