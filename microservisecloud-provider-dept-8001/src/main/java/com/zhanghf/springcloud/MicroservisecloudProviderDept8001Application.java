package com.zhanghf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现,（作为了解）Euraka的服务注册于发现
public class MicroservisecloudProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservisecloudProviderDept8001Application.class, args);
	}
}
