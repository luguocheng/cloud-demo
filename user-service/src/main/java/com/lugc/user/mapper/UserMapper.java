package com.lugc.user.mapper;

import com.lugc.user.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author lugc
 * @version 1.0.0
 * @ClassName UserMapper.java
 * @Description TODO
 * @createTime 2022年03月31日 16:54:00
 */
public interface UserMapper {
    @Select("select * from cloud_user.user where id = #{id};")
    User getUserById(Long id);
}
