package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class RoleVo {
	private String bianhao;
	/**
	 * 用户id类型 
	 * 1.网络门店 
	 * 3.经纪公司
	 */
	private String userIdType;
	/**
	 * 录入人账号id
	 */
	private String inputPerson;
	/**
	 * 维护人账号id
	 */
	private String guardian;
	/**
	 * 实勘人账号id
	 */
	private String survey;
	/**
	 * 委托人账号id
	 */
	private String promotion;
	/**
	 * 钥匙人账号id
	 */
	private String key;
}
