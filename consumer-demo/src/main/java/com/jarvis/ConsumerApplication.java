package com.jarvis;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 1:46 PM 2020/4/4
 * @Modified By:
 */
//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication

@EnableFeignClients
@SpringCloudApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
