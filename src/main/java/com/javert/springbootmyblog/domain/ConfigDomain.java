package com.javert.springbootmyblog.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "domain")
public class ConfigDomain {
    private String admin;
    private Map<String,Object> map;
    private List<String> ips;

    @Override
    public String toString() {
        return "ConfigDomain{" +
                "admin='" + admin + '\'' +
                ", map=" + map +
                ", ips=" + ips +
                '}';
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }
}
