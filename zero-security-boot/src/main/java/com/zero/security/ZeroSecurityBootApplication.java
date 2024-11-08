package com.zero.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zero.security.mapper")
public class ZeroSecurityBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroSecurityBootApplication.class, args);
    }

}
