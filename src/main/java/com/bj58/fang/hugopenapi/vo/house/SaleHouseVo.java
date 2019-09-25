package com.bj58.fang.hugopenapi.vo.house;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 二手房开放实体
 * @author liaoxingjie
 *
 */
@Setter
@Getter
public class SaleHouseVo extends HouseVo implements Serializable {
	private static final long serialVersionUID = 8739480212602202030L;
	//备案编号
	private String beianbianhao;

	//套内面积
	private Double taoneimianji;

	//建筑年代
	private Integer jianzhuniandai;

	/* 建筑形式
	 * 1  板式建筑
	 * 2  点式建筑
	 * 3  平房建筑
	 * */
	private Integer jianzhuxingshi;

	//是否一手房
	private Integer isyishoufang;

	//附属信息
	private String fushuxinxi;

	/*	产权年限
	 *  1 70年
	 *  2 50年
	 *  3 40年
	 * */
	private Integer chanquannianxian;

	/*	产权类型
	 * 1 商品房住宅
	 * 2 经济适用（含福利房、限价房）
	 * 3 动迁配套房
	 * 4 小产权房
	 * 5 单位集体自建房
	 * ...
	 * */
	private Integer chanquanleixing;

	//唯一住房
	private Integer weiyizhufang;

	/* 房本年限
	 * 1 满五年
	 * 2 满二年
	 * 3 不满二年
	 * */
	private Integer fangbennianxian;

	//首付要求 单位：元
	private Long shoufu;

	//佣金 单位：百分比
	private Double yongjin;

	//业主心态
	private String yezhuxintai;

	//小区配套
	private String xiaoqupeitao;

	//服务介绍
	private String fuwujieshao;

	//服务类型
	private String fuwuleixing;

	/**
	 * 阳台
	 */
	private Integer balcony;
	
	/**
	 * 厨房
	 */
	private Integer kitchen;
	
	/**
	 * 户
	 */
	private Integer households;
	
	/**
	 * 梯
	 */
	private Integer ladder;
	
	/**
	 * 房产证登记日期(12或者13位时间戳)
	 */
	private String certificateRegisterTime;
	
	/**
	 * 房产证编号
	 */
	private String certificateNo;
	
	/**
	 * 有无车位 0.无 1.有
	 */
	private Integer parkingSpace;
	
	/**
	 * 看房方式 1.任意时间 2.白天 3.晚上 4.周末 5.其他
	 */
	private Integer showingTime;
	
	/**
	 * 挂牌时间(13位时间戳)
	 */
	private String onSaleTime;
	
	/**
	 * 笋盘标记 0.否 1.是
	 */
	private Integer depreciateMark;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getBeianbianhao() {
		return beianbianhao;
	}

	public void setBeianbianhao(String beianbianhao) {
		this.beianbianhao = beianbianhao;
	}

	public Double getTaoneimianji() {
		return taoneimianji;
	}

	public void setTaoneimianji(Double taoneimianji) {
		this.taoneimianji = taoneimianji;
	}

	public Integer getJianzhuniandai() {
		return jianzhuniandai;
	}

	public void setJianzhuniandai(Integer jianzhuniandai) {
		this.jianzhuniandai = jianzhuniandai;
	}

	public Integer getJianzhuxingshi() {
		return jianzhuxingshi;
	}

	public void setJianzhuxingshi(Integer jianzhuxingshi) {
		this.jianzhuxingshi = jianzhuxingshi;
	}

	public Integer getIsyishoufang() {
		return isyishoufang;
	}

	public void setIsyishoufang(Integer isyishoufang) {
		this.isyishoufang = isyishoufang;
	}

	public String getFushuxinxi() {
		return fushuxinxi;
	}

	public void setFushuxinxi(String fushuxinxi) {
		this.fushuxinxi = fushuxinxi;
	}

	public Integer getChanquannianxian() {
		return chanquannianxian;
	}

	public void setChanquannianxian(Integer chanquannianxian) {
		this.chanquannianxian = chanquannianxian;
	}

	public Integer getChanquanleixing() {
		return chanquanleixing;
	}

	public void setChanquanleixing(Integer chanquanleixing) {
		this.chanquanleixing = chanquanleixing;
	}

	public Integer getWeiyizhufang() {
		return weiyizhufang;
	}

	public void setWeiyizhufang(Integer weiyizhufang) {
		this.weiyizhufang = weiyizhufang;
	}

	public Integer getFangbennianxian() {
		return fangbennianxian;
	}

	public void setFangbennianxian(Integer fangbennianxian) {
		this.fangbennianxian = fangbennianxian;
	}

	public Long getShoufu() {
		return shoufu;
	}

	public void setShoufu(Long shoufu) {
		this.shoufu = shoufu;
	}

	public Double getYongjin() {
		return yongjin;
	}

	public void setYongjin(Double yongjin) {
		this.yongjin = yongjin;
	}

	public String getYezhuxintai() {
		return yezhuxintai;
	}

	public void setYezhuxintai(String yezhuxintai) {
		this.yezhuxintai = yezhuxintai;
	}

	public String getXiaoqupeitao() {
		return xiaoqupeitao;
	}

	public void setXiaoqupeitao(String xiaoqupeitao) {
		this.xiaoqupeitao = xiaoqupeitao;
	}

	public String getFuwujieshao() {
		return fuwujieshao;
	}

	public void setFuwujieshao(String fuwujieshao) {
		this.fuwujieshao = fuwujieshao;
	}

	public String getFuwuleixing() {
		return fuwuleixing;
	}

	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}

	public Integer getBalcony() {
		return balcony;
	}

	public void setBalcony(Integer balcony) {
		this.balcony = balcony;
	}

	public Integer getKitchen() {
		return kitchen;
	}

	public void setKitchen(Integer kitchen) {
		this.kitchen = kitchen;
	}

	public Integer getHouseholds() {
		return households;
	}

	public void setHouseholds(Integer households) {
		this.households = households;
	}

	public Integer getLadder() {
		return ladder;
	}

	public void setLadder(Integer ladder) {
		this.ladder = ladder;
	}

	public String getCertificateRegisterTime() {
		return certificateRegisterTime;
	}

	public void setCertificateRegisterTime(String certificateRegisterTime) {
		this.certificateRegisterTime = certificateRegisterTime;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public Integer getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(Integer parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	public Integer getShowingTime() {
		return showingTime;
	}

	public void setShowingTime(Integer showingTime) {
		this.showingTime = showingTime;
	}

	public String getOnSaleTime() {
		return onSaleTime;
	}

	public void setOnSaleTime(String onSaleTime) {
		this.onSaleTime = onSaleTime;
	}

	public Integer getDepreciateMark() {
		return depreciateMark;
	}

	public void setDepreciateMark(Integer depreciateMark) {
		this.depreciateMark = depreciateMark;
	}
}
