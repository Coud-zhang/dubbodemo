package com.zkq.dubbointerface.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhangkaiqiang
 * @Date 2019/7/18  14:50
 * @Description TODO
 */

@Data
public class UserAddress implements Serializable{

	private Integer id;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 用户地址
	 */
	private String userAddress;

	/**
	 * 收件人
	 */
	private String consignee;

	/**
	 * 电话号码
	 */
	private String phoneNum;

	/**
	 * 是否为默认地址
	 */
	private String isDefault;

}
