package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class VerifyInfoVo {
	private long houseId;
	private long brokerId;
	private int districtCode;
	private String agencyName;
	private String verificationCode;
	private String entrustAgreementNo;
	private String remark;
	private int cityId;
	private double buildingArea;
}
