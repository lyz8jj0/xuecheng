package com.xuecheng.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 李新宇
 * 2019-10-12 17:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class  TestJwt {


    //创建jwt令牌
    @Test
    public void testCreateJwt(){
        //密钥库文件
        String keystore = "xc.keystore";
        //密钥库的密码
        String keystore_password = "xuechengkeystore";
    }

    //校验jwt令牌
    @Test
    public void testVerify(){
        //公钥
        String publickey = "-----BEGIN PUBLIC KEY-----MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnASXh9oSvLRLxk901HANYM6KcYMzX8vFPnH/To2R+SrUVw1O9rEX6m1+rIaMzrEKPm12qPjVq3HMXDbRdUaJEXsB7NgGrAhepYAdJnYMizdltLdGsbfyjITUCOvzZ/QgM1M4INPMD+Ce859xse06jnOkCUzinZmasxrmgNV3Db1GtpyHIiGVUY0lSO1Frr9m5dpemylaT0BV3UwTQWVW9ljm6yR3dBncOdDENumT5tGbaDVyClV0FEB1XdSKd7VjiDCDbUAUbDTG1fm3K9sx7kO1uMGElbXLgMfboJ963HEJcU01km7BmFntqI5liyKheX+HBUCD4zbYNPw236U+7QIDAQAB-----END PUBLIC KEY-----";
        //jwt令牌
        String jwtString = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOiIxIiwidXNlcnBpYyI6bnVsbCwidXNlcl9uYW1lIjoiaXRjYXN0Iiwic2NvcGUiOlsiYXBwIl0sIm5hbWUiOiJ0ZXN0MDIiLCJ1dHlwZSI6IjEwMTAwMiIsImlkIjoiNDkiLCJleHAiOjE1NzM1MDY0MjIsImF1dGhvcml0aWVzIjpbImNvdXJzZV9nZXRfYmFzZWluZm8iLCJjb3Vyc2VfcGljX2xpc3QiXSwianRpIjoiZDFiMTU1NjktODg2NC00NTQzLTgwMzItZWY0MDFmYjgyN2M3IiwiY2xpZW50X2lkIjoiWGNXZWJBcHAifQ.OqwzJO349c-V8o3xI9pSpr6UloFa39ztNjyUH_TPa-M598Z5p2xSIyg_BRitnIdJEWExQTmQ5zH5LdgR-Q8SlV1uQrXh3ZgHf_1KwieXI41eqNrvj84-SZ-lMKMGINl7ngq1t_AzSQFp49sIC99Gfzl6d_MoftdoiliZUosZGYqsNVV3YBv9BJl-LP_2GSYI5yE_1uQOEncVDwpXVjjuuSYiHZYACw1ubpwkI8s1AIBXsr0wRYX4reaVHA6w6Gme0kMPYL0RzkLHi4IdyP7hBCkoxvEupLhxW_ie77NXMtMgsSmZijsBWutb75zXA7_62aEJsbDzV4jbyDc1m2LTkQ";
        //校验jwt令牌
        Jwt jwt = JwtHelper.decodeAndVerify(jwtString, new RsaVerifier(publickey));
        //拿到jwt令牌中自定义的内容
        String claims = jwt.getClaims();
        System.out.println(claims);
    }
}
