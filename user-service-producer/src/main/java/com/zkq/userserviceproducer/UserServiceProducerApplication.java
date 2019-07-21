package com.zkq.userserviceproducer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author zhangkaiqiang
 */

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.zkq.userserviceproducer.service.impl")
public class UserServiceProducerApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(UserServiceProducerApplication.class, args);
	}

}
