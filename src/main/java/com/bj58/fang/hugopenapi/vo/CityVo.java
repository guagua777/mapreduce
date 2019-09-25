package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 标准城市信息实体
 * @author liaoxingjie
 *
 */
@Setter
@Getter
public class CityVo {
	private int localId;
	private String localName;
	/**
	 * 标准区域列表，英文逗号分隔
	 */
	private String areas;
}
