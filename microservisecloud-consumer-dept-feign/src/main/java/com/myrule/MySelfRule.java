package com.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by YQ11053 on 2018/10/5 0005.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RetryRule(); //定义为RetryRule
        return new RoundRobinRule_ZHF();//自定义负载均衡方式
    }
}
