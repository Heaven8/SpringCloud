package com.zhanghf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * SpringCloudConfig
 */
@SpringBootApplication
@EnableConfigServer
public class Config_4433_StartSpringCloudApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(Config_4433_StartSpringCloudApp.class,args);
    }
}
