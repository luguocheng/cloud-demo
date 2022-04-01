package com.lugc.order.service.impl;


import com.lugc.feign.clients.UserClient;
import com.lugc.feign.entity.User;
import com.lugc.order.entity.Order;
import com.lugc.order.mapper.OrderMapper;
import com.lugc.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 15:31
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;


    @Override
    public Order getOrderById(Long id) {
        Order order = orderMapper.findById(id);
//        User user = restTemplate.getForObject("http://userservice/userManager/" + order.getUserId(), User.class);
        User user = userClient.getUserById(order.getUserId());
        order.setUser(user);
        return order;
    }
}