package com.bj58.fang.hugopenapi.vo.house;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 写字楼开放实体
 * @author xuxiangmei
 *
 */
@Setter
@Getter
public class OfficeHouseVo extends HouseVo implements Serializable {
	private static final long serialVersionUID = 4638789738932735311L;
	/*
         * 写字楼类型
         * 1.纯写字楼
         * 2.商业综合体
         * 3.商务公寓
         * 4.商务酒店
         */
	private Integer xiezilouleixing;
	/*
	 * 写字楼等级
	 * 1.甲级 2. 乙级 3.丙级
	 */
	private Integer officelevel;

	/*
	 * 可注册公司
	 * 1.是 2. 否
	 */
	private Integer kezhuce;

	//得房率
	private String defanglv;
	/*
	 * 装修情况
	 *1.毛坯 2. 简单装修 3. 精装修 4. 豪华装修
	 */
	/*private Integer zhuangxiuqingkuang;*/

	/*
	 * 可分割
	 * 1.是 0.否
	 */
	private String kefenge;

	/*	配套设施
	 *  1宽带 2有线电视 3水 4电 5电话 6中央空调 7电梯 8集中供暖 9办公家具 10免费车位 11员工餐厅 12安全监控
	  */
	private String peitao;

	//起租期
	private Integer qizuqi;

	//免租期
	private Integer mianzuqi;

	//押金月数
	private Integer yajinyueshu;

	//付款月数
	private Integer fukuanyueshu;

	//物业费
	private String xiezilouwuyefei;
	
	//出售预期收益
	private String chushouyuqishouyi;
	
	//详细介绍
	private String xiangxijieshao;

}
