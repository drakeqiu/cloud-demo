package com.jarvis.user.service;

import com.jarvis.user.domain.User;
import com.jarvis.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jarvis
 * @Description
 * @Date: Create in 12:34 PM 2020/4/4
 * @Modified By:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
