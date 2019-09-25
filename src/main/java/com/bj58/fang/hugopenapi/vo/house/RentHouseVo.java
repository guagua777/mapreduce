package com.bj58.fang.hugopenapi.vo.house;

import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

/**
 * 租房实体定义
 * @author liaoxingjie
 * @date 2018年6月26日
 */
@Setter
@Getter
public class RentHouseVo extends HouseVo implements Serializable {
	private static final long serialVersionUID = -930032001259447262L;
	/**
	 * 出租类型
	 * {1：整租， 2:合租}
	 */
	private Integer rentType;

	/**
	 * 最早入住时间 yy-mm-dd
	 */
	private String earliestMoveInTime;
	
	/**
	 * 付款方式
	 */
	private Integer paymentTerms;
	
	/**
	 * 公共使用配套
	 */
	private String supportFacilities;
	
	/**
	 * 出租间使用配套
	 */

	private String independFacilities;
	
	/**
	 * 合租户数
	 */
	private Integer jointTenantNum;
	
	/**
	 * 房间(类型)
	 */
	private Integer roomType;
	
	
	/**
	 * 合租的建筑面积
	 */
	private Double buildingArea;
	
	/**
	 * 限制室友类型
	 */
	private Integer jtTenRestrict;
	
	/**
	 * 已出租户数
	 */
	private Integer rentedHouseNum;
	
	/**
	 * 已出租室友类型
	 */
	private String rentedDetails;
}
