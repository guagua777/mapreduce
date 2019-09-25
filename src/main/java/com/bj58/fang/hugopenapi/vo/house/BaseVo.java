package com.bj58.fang.hugopenapi.vo.house;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 接口发布基础实体
 * @author liaoxingjie
 * @date 2018年5月4日
 */
@Setter
@Getter
public class BaseVo implements Serializable{

	private static final long serialVersionUID = 3746446995903202057L;
	/**
	 * 是否是经纪人相关接口
	 */
	private boolean isBroker;
	
	/**
	 * 是否是更新房源
	 */
	private boolean isUpdate;
	
	/**
	 * 分发平台   可多选，如 1|3   
	 * 1 58 
	 * 2 安居客 
	 * 3 赶集
	 */
	private String plats;
	/**
	 * 标准房源Id
	 */
	private Long houseid;
	/**
	 * 合作伙伴Id
	 */
	private String clientId;
	/**
	 * 经纪人Id
	 */
	private Long brokerid;
	/**
	 * 网络门店Id
	 */
	@Deprecated
	private Integer mendianid;
	/**
	 * 网络门店Id
	 */
	private Long deptId;

	/**
	 * 磐石房号
	 */
	private Long panShiHouseId;


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public boolean isBroker() {
		return isBroker;
	}

	public void setBroker(boolean broker) {
		isBroker = broker;
	}

	public boolean isUpdate() {
		return isUpdate;
	}

	public void setUpdate(boolean update) {
		isUpdate = update;
	}

	public String getPlats() {
		return plats;
	}

	public void setPlats(String plats) {
		this.plats = plats;
	}

	public Long getHouseid() {
		return houseid;
	}

	public void setHouseid(Long houseid) {
		this.houseid = houseid;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Long getBrokerid() {
		return brokerid;
	}

	public void setBrokerid(Long brokerid) {
		this.brokerid = brokerid;
	}

	public Integer getMendianid() {
		return mendianid;
	}

	public void setMendianid(Integer mendianid) {
		this.mendianid = mendianid;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getPanShiHouseId() {
		return panShiHouseId;
	}

	public void setPanShiHouseId(Long panShiHouseId) {
		this.panShiHouseId = panShiHouseId;
	}
}