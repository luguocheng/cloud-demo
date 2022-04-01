package com.lugc.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: lugc
 * @time: 2022/4/1 16:55
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}