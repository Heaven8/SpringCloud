package com.zhanghf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * HystrixDashboard监控，在监控的服务中记得添加actuator的pom配置
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }

}
