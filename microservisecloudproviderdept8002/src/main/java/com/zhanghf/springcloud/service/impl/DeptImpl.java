package com.zhanghf.springcloud.service.impl;

import com.zhanghf.springcloud.dao.DeptDao;
import com.zhanghf.springcloud.entities.Dept;
import com.zhanghf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YQ11053 on 2018/9/17 0017.
 */
@Service
public class DeptImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
