package com.li.day08_springboot_emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.li.day08_springboot_emp.dao")
public class Day08SpringbootEmpApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Day08SpringbootEmpApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Day08SpringbootEmpApplication.class, args);
    }

}
