package com.zkq.orderserviceconsumer.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zkq.dubbointerface.pojo.UserAddress;
import com.zkq.dubbointerface.service.OrderService;
import com.zkq.dubbointerface.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangkaiqiang
 * @Date 2019/7/18  14:58
 * @Description TODO
 */

@Service
public class OrderServiceImpl implements OrderService {


	/**
	 * 注意这里的是哪个包下的注解
	 */

	@Reference
     UserService userService;

	@Override
	public void createOrder(String userId) {
		//调用用户服务，得到该用户的收货地址
		List<UserAddress> userAddresses=userService.getUserAddress(userId);
		System.out.println(userAddresses);
	}
}
