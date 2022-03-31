package com.lugc.user.service;

import com.lugc.user.entity.User;

/**
 * @author lugc
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2022年03月31日 16:52:00
 */
public interface UserService {
    User getUserById(Long id);
}
