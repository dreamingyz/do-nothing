package com.dre.nothing.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dre.nothing.service.dao.mapper")
public class NothingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NothingServiceApplication.class, args);
    }

}
