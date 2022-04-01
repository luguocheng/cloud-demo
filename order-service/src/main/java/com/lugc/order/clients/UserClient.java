package com.lugc.order.clients;

import com.lugc.order.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: lugc
 * @time: 2022/4/1 16:35
 */
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/userManager/{id}")
    User getUserById(@PathVariable("id") Long id);
}