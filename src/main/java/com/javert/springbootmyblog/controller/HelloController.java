package com.javert.springbootmyblog.controller;

import com.javert.springbootmyblog.domain.ConfigDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ConfigDomain configDomain;

    @RequestMapping("/hello")
    public String Hello() {
        return configDomain.toString();
    }
}
