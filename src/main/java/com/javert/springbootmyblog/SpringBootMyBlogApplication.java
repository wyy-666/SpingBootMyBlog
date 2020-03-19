package com.javert.springbootmyblog;

import com.javert.springbootmyblog.domain.ConfigDomain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigDomain.class)
public class SpringBootMyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBlogApplication.class, args);
    }

}
