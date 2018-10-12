package com.zhanghf;

import com.zhanghf.springcloud.entities.Dept;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Dept dept = new Dept();
        dept.setDeptno(11L);
        dept.setDname("dp");
        System.out.println(dept);
    }
}
