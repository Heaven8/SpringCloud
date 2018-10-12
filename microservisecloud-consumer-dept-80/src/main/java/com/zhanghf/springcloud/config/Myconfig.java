package com.zhanghf.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by YQ11053 on 2018/9/26 0026.
 */
@Configuration
public class Myconfig {

    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //设置轮训策略，总共默认有7中
    /*
    RoundRobinRule 轮询
    RandomRule 随机
    AvaliabilityFilteringRule 会先过滤由于多次访问故障而处于断路器跳闸的状态的服务和并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略
    WeightedResponseTimeRule  根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大
    RetryRule  先按照RoundRobinRule策略获取服务，如果获取服务失败会在指定时间内重试
    BestAvailableRule 会先过滤掉由于多次访问故障二处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
    ZoneAvoidanceRule 默认规则，复合判断server所在的区域的性能和server的可用性选择服务器*/
    //用法：直接返回IRule对象，里面直接返回7中相应的轮训对象即可
    @Bean
    public IRule myRule(){
        return new RandomRule();// 随机
    }
}
