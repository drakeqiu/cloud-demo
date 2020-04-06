package com.jarvis.consumer.client;

import com.jarvis.consumer.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 10:13 AM 2020/4/5
 * @Modified By:
 */
@FeignClient(value = "user-service", fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Long id);
}
