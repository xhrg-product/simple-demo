package com.github.xhrg.demo;


import com.github.xhrg.demo.basic.mapper.MapperPackage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot的DemoApplication所在包路径，必须是所有子项目包路径的父路径,否则扫描不到注解
@SpringBootApplication
//使用basePackageClasses，会扫描该类所在的包路径，可以明显规避因为粗心拼写错误的路径
@MapperScan(basePackageClasses = MapperPackage.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


