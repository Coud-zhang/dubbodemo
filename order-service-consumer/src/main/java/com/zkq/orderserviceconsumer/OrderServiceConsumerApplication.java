package com.zkq.orderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangkaiqiang
 */

@EnableDubbo(scanBasePackages = "com.zkq.orderserviceconsumer.service.impl")
@SpringBootApplication
public class OrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceConsumerApplication.class, args);
	}

}
