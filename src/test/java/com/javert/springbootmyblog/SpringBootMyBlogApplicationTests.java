package com.javert.springbootmyblog;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.javert.springbootmyblog.domain.ConfigDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/*
* SpringBoot单元测试
*
* 可在测试期间进行自动注入
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMyBlogApplicationTests {
    @Autowired
    ConfigDomain configDomain;
    @Test
    public void contextLoads() {
        System.out.println(configDomain.toString());
    }

}
