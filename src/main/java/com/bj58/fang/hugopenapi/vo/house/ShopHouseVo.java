package com.bj58.fang.hugopenapi.vo.house;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商铺房源参数实体
 * 
 * @author xuxiangmei
 *
 */
@Setter
@Getter
public class ShopHouseVo extends HouseVo implements Serializable {
	private static final long serialVersionUID = -8495773550552167106L;
	/*
         * 商铺类型
         */
	private Integer shangpuleixing;

	// 经营状态
	private Integer jingyingzhuangtai;

	// 行业类别
	private Integer hangyeleibie;

	// 经营行业
	private Integer jingyinghangye;

	// 面宽
	private String miankuan;

	// 层高
	private String cenggao;

	// 进深
	private String jinshen;

	// 商铺配套
	private String peitao;

	/*
	 * 客流人群 1. 办公人群 2.学生人群 3. 居民人群 4.旅游人群 5. 其他
	 */
	private String keliurenqun;

	// 客流人群其他
	private String keliurenqunqita;

	// 是否临街
	private Integer linjie;

	// 起租期
	private Integer qizuqi;

	// 免租期
	private Integer mianzuqi;

	// 押金月数
	private Integer yajinyueshu;

	// 付款月数
	private Integer fukuanyueshu;

	// 物业费
	private String wuyefei;

	// 电费
	private String dianfei;

	// 水费
	private String shuifei;

	// 转让费
	private String zhuanrangfei;
	
	//剩余租期（月）
	private String shengyuzuqi;

	// 出售预期收益
	private String chushouyuqishouyi;




}
