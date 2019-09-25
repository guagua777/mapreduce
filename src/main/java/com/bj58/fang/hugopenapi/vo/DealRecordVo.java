package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class DealRecordVo {
	private String bianhao;
	private String dealTime;
	private String dealPrice;
	private String deptId;
	private String deptIdType;
	private String deptLevel;
	private String userId;
	private String userIdType;
	/**
	 * 佣金收入（单位：元）
	 */
	private String commission;
	/**
	 * 交易合同编号(不超过100个字符)
	 */
	private String contractNo;
}
