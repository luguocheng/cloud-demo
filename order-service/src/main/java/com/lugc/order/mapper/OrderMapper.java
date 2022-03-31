package com.lugc.order.mapper;

import com.lugc.order.entity.Order;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 15:34
 */
public interface OrderMapper {

    @Select("select * from cloud_order.order where id = #{id};")
    Order findById(Long id);
}