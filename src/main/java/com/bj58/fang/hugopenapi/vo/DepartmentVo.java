package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class DepartmentVo {

	private String brokerageDeptId;

	private String deptName;
	/**
	 * 部门层级 
	 * 0.未知 
	 * 1.公司 
	 * 2.大区 
	 * 3.商圈 
	 * 4.门店 
	 * 5.组
	 */

	private String deptLevel;

	private String parentDeptId;

	private String parentDeptIdType;

	private String parentDeptLevel;
	private String deptAddress;
	private String userId;
	/**
	 * 负责人ID类型 
	 * 1.网络门店用户id 
	 * 3.经纪公司用户id
	 */
	private String userIdType;
}
