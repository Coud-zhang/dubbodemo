package com.zkq.dubbointerface.service;

/**
 * @Author zhangkaiqiang
 * @Date 2019/7/18  14:57
 * @Description TODO
 */
public interface OrderService {


	/**
	 * 根据用户的id得到用户的收货地址
	 * @param userId
	 */
	void createOrder(String userId);
}
