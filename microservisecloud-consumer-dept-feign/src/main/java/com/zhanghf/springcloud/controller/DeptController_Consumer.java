package com.zhanghf.springcloud.controller;

import com.zhanghf.springcloud.entities.Dept;
import com.zhanghf.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by YQ11053 on 2018/9/26 0026.
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return deptClientService.list();
    }

}
