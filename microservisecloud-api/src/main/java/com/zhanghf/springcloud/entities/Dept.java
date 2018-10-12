package com.zhanghf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by YQ11053 on 2018/9/12 0012.
 */
@NoArgsConstructor //提供一个无参的构造函数
@AllArgsConstructor //提供一个全参的构造方法
@Data  //会生成getter、setter、equals、canEqual、hashCode、toString方法
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

}
