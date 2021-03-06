package com.cjp;

import org.springframework.beans.factory.annotation.Value;

import java.util.Properties;

public class Config {

    private Properties systemEnvironment;
    private Properties systemProperties;
    @Value("#{systemEnvironment['Path']}")
    private String path;

    public Properties getSystemEnvironment() {
        return systemEnvironment;
    }

    public void setSystemEnvironment(Properties systemEnvironment) {
        this.systemEnvironment = systemEnvironment;
    }

    public Properties getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(Properties systemProperties) {
        this.systemProperties = systemProperties;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
