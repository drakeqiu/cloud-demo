package com.jarvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 12:16 PM 2020/4/4
 * @Modified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.jarvis.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
