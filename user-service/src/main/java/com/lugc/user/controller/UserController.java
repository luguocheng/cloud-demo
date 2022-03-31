package com.lugc.user.controller;

import com.lugc.user.entity.User;
import com.lugc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 16:49
 */
@RestController
@RequestMapping("userManager")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getUserByOrderId(@PathVariable("id") Long id){
           return userService.getUserById(id);
    }
}