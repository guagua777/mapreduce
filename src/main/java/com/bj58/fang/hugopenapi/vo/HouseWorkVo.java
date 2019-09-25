package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class HouseWorkVo {
	/**
	 * 资源类型 
	 * 1.二手房 2.租房
	 */
	private String bizType;
	/**
	 * 经纪公司带看id
	 */
	private String brokerageWorkId;
	/**
	 * 房源编号
	 */
	private String bianhao;
	/**
	 * 客源id
	 */
	private String customerId;
	/**
	 * 客源id类型 
	 * 1.网络门店 3.经纪公司客源id
	 */
	private Integer customerIdType;
	/**
	 * 客源姓名
	 */
	private String customerName;
	/**
	 * 带看经纪人id
	 */
	private String userId;
	/**
	 * 带看经纪人id类型 1.网络门店 3.经纪公司
	 */
	private String userIdType;
	/**
	 * 带看时间（10位时间戳）
	 */
	private String followTime;
	private String workContent;
}
