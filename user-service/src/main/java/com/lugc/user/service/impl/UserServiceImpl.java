package com.lugc.user.service.impl;

import com.lugc.user.entity.User;
import com.lugc.user.mapper.UserMapper;
import com.lugc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 16:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}