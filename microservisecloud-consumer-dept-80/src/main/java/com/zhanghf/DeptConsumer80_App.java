package com.zhanghf;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
//自定义Ribbon的轮训策略：在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//非常重要：MySelfRule这个类不能创建在和启动类同一个包，即com.zhanghf;下
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
//@RibbonClient(name="MICROSERVICECLOUD-DEPT")
public class DeptConsumer80_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
