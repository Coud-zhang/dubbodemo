package com.zkq.orderserviceconsumer.controller;

import com.zkq.dubbointerface.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zhangkaiqiang
 * @Date 2019/7/18  15:33
 * @Description TODO
 */
@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("/createOrder/{userId}")
     public void  createOrder(@PathVariable("userId") String userId){
		 orderService.createOrder(userId);
	 }
}
