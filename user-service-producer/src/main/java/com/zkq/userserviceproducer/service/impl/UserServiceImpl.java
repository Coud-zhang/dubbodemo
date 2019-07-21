package com.zkq.userserviceproducer.service.impl;


import com.zkq.dubbointerface.pojo.UserAddress;
import com.zkq.dubbointerface.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author zhangkaiqiang
 * @Date 2019/7/18  14:54
 * @Description TODO
 */

//用与暴露服务的注解
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
	@Override
	public List<UserAddress> getUserAddress(String userId) {

		UserAddress user1=new UserAddress();
		user1.setUserAddress("山东东营市东营区");

		UserAddress user2=new UserAddress();
		user1.setUserAddress("山东济南市长清区");
		return Arrays.asList(user1,user2);
	}
}
