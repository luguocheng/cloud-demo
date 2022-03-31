package com.lugc.order.service;

import com.lugc.order.entity.Order;

/**
 * @author lugc
 * @version 1.0.0
 * @ClassName OrderService.java
 * @Description TODO
 * @createTime 2022年03月31日 15:30:00
 */
public interface OrderService {
    Order getOrderById(Long id);
}
