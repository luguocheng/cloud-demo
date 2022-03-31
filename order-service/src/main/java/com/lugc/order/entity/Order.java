package com.lugc.order.entity;

import lombok.Data;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 15:30
 */
@Data
public class Order {
    private Long id;
    private Long price;
    private Long num;
    private String name;
    private Long UserId;
    private User user;
}