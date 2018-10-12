package com.zhanghf;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 1、创建和dept80类似的项目，类似的项目目录，排除自定义负载规则，去除启动类中的@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)，其余一样
 * 2、pom配置文件下的dependencies除了dept80项目的以外还需要
 * <dependency>
 *<groupId>org.springframework.cloud</groupId>
 *<artifactId>spring-cloud-starter-feign</artifactId>
 *</dependency>
 *3、更改api公共服务，新增DeptClientService服务接口（在api中新增的原因是，除了deptfeign项目会调用到服务以外可能其他客户端也会调用，因此接口创建在公共模块）
 * 3.1:接口用FeignClient注解，value为微服务名称
 * 3.2:接口中的方法根据微服务提供者的方法进行编写
 *4、在deptfeign项目的controller中注入DeptClientService对象，然后执行相应的方法
 * 5、在deptfeign启动类添加注解：@EnableFeignClients和ComponentScan
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.zhanghf.springcloud"})
@ComponentScan("com.zhanghf.springcloud")
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_Feign
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsumer80_Feign.class,args);
    }
}
