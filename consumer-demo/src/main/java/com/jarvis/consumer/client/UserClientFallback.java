package com.jarvis.consumer.client;

import com.jarvis.consumer.domain.User;
import org.springframework.stereotype.Component;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 10:38 AM 2020/4/5
 * @Modified By:
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setName("unknown");
        return user;
    }
}
