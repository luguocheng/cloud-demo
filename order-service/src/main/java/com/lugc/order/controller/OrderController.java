package com.lugc.order.controller;

import com.lugc.order.entity.Order;
import com.lugc.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 15:14
 */
@RestController
@RequestMapping("/orderManager")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    private Order getOrderById(@PathVariable("id") Long id){
      return orderService.getOrderById(id);
    }
}