package com.zhanghf.springcloud.service;

import com.zhanghf.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
 * Created by YQ11053 on 2018/10/5 0005.
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = FallbackDeptClientService.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
