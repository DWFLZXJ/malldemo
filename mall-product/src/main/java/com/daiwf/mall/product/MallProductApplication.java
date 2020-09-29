package com.daiwf.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
   整合mybatis-plus
 1)导入依赖
 <!--mybatis-plus -->
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.3.2</version>
    </dependency>
    2)配置
    1、配置数据源
       1)导入数据库的驱动
       2)在application.yml中配置数据源相关信息
    2、配置mybatisplus
    1)使用@MapperScan
    2)告诉mybatisplus 我们的sql映射文件的位置
    */

@MapperScan("com.daiwf.mall.product.dao")
@SpringBootApplication
public class MallProductApplication
{

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
