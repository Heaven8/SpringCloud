package com.zhanghf.springcloud.dao;

import com.zhanghf.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by YQ11053 on 2018/9/17 0017.
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
