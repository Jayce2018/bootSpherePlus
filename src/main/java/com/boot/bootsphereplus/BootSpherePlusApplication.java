package com.boot.bootsphereplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.boot.bootsphereplus.business.mapper")
public class BootSpherePlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSpherePlusApplication.class, args);
    }

}
