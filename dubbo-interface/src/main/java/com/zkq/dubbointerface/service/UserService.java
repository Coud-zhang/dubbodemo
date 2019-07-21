package com.zkq.dubbointerface.service;


import com.zkq.dubbointerface.pojo.UserAddress;

import java.util.List;

/**
 * @Author zhangkaiqiang
 * @Date 2019/7/18  14:52
 * @Description TODO
 */
public interface UserService {


	/**
	 * 根据用户id得到用户端收货地址
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddress(String userId);
}
