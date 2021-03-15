package com.iotmars.mcook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: CJ
 * @Data: 2021/3/15 16:59
 */
@SpringBootApplication
@MapperScan(value = "com.iotmars.mcook.mapper")
public class ShardingSphereApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereApplication.class, args);
    }
}
