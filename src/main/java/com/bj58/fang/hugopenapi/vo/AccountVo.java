package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class AccountVo {
	
	/**
	 * 经济公司用户ID
	 */
	private String accountId;
	
	/**
	 * 三网经纪人id
	 */
//	@Pattern(regexp = "^$|[0-9]+", message = "brokerId必须是正整数")
	private String brokerId;
	
	/**
	 * 三网公司id
	 */
	private Integer companyId;
	
	/**
	 * 账号名
	 */
	private String accountName;
	
	/**
	 * 密码（不填写密码系统将自动生成）
	 */
	private String password;
	
	/**
	 * 用户真实姓名
	 */
	private String trueName;
	
	/**
	 * 部门ID
	 */
	private String deptId;
	
	/**
	 * 部门ID类型 1.集客家 3.经纪公司部门id
	 */
//	@Pattern(regexp = "^$|[0-9]+", message = "deptIdType必须是正整数")
	private String deptIdType;
	
	/**
	 * 经纪公司部门层级
	 */
//	@Pattern(regexp = "^$|[0-9]+", message = "brokerageDeptLevel必须是正整数")
	private String brokerageDeptLevel;
	
	/**
	 * 职位ID(职位id 1.管理员 2.大区经理 3.区域经理 4.店长 5.组长 6.店秘书 7.经纪人 8.实习经纪人 10.店东)
	 */

	private String positionId;
	
	/**
	 * 联系方式(手机号，不支持座机号)
	 */

	private String phone;
	
	/**
	 * 入职时间(10位时间戳)
	 */
	private String entryTime;
}
