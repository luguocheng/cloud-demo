package com.lugc.order;



import com.lugc.feign.clients.UserClient;
import com.lugc.order.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 12:21
 */
@SpringBootApplication
@MapperScan("com.lugc.order.mapper")
@EnableFeignClients(clients = UserClient.class,defaultConfiguration = DefaultFeignConfiguration.class)
//@EnableEurekaClient
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}