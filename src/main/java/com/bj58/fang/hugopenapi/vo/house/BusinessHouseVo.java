package com.bj58.fang.hugopenapi.vo.house;

import com.bj58.fang.united.hug.entity.Picture;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 商业地产公共实体
 * @author xuxiangmei
 *
 */
@Setter
@Getter
public class BusinessHouseVo extends BaseVo implements Serializable {
	private static final long serialVersionUID = 5864644094160477018L;
	/**
	 * 租售方式
	 */
	private String zushoufangshi;
	/**
	 * 房源编号
	 */
	private String bianhao;
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 磐石区域id
	 */
	private Integer areaId;
	/**
	 * 磐石商圈id
	 */
	private Integer shangquanId;
	/**
	 * 地址
	 */
	private String dizhi;
	/**
	 * 经度
	 */
	private double lon;
	/**
	 * 纬度
	 */
	private double lat;
	/**
	 * 楼层分区
	 */
	private Integer loucengfenqu;
	/**
	 * 总楼层
	 */
	private Integer zonglouceng;
	/**
	 * 所在楼层
	 */
	private Integer suozailouceng;
	/**
	 * 所在楼层
	 */
	private Integer zhijiceng;
	/**
	 * 建筑面积
	 */
	private Double mianji;
	/**
	 * 价格单位
	 */
	private String jiagedanwei;
	/**
	 * 价格
	 */
	private Long jiage;
	/**
	 * 房源详情
	 */
	protected String fangyuanxiangqing;
	/**
	 * 房源图片
	 */
	private String pic;
	/**
	 * 城市id
	 */
	private Integer cityId;
	/**
	 * 类型id
	 */
	private Integer cateId;
	/**
	 * 公司id
	 */
	private Integer companyId;
	/**
	 * 房源图片列表
	 */
	private List<Picture> picList = new ArrayList<Picture>();

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getZushoufangshi() {
		return zushoufangshi;
	}

	public void setZushoufangshi(String zushoufangshi) {
		this.zushoufangshi = zushoufangshi;
	}

	public String getBianhao() {
		return bianhao;
	}

	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getShangquanId() {
		return shangquanId;
	}

	public void setShangquanId(Integer shangquanId) {
		this.shangquanId = shangquanId;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public Integer getLoucengfenqu() {
		return loucengfenqu;
	}

	public void setLoucengfenqu(Integer loucengfenqu) {
		this.loucengfenqu = loucengfenqu;
	}

	public Integer getZonglouceng() {
		return zonglouceng;
	}

	public void setZonglouceng(Integer zonglouceng) {
		this.zonglouceng = zonglouceng;
	}

	public Integer getSuozailouceng() {
		return suozailouceng;
	}

	public void setSuozailouceng(Integer suozailouceng) {
		this.suozailouceng = suozailouceng;
	}

	public Integer getZhijiceng() {
		return zhijiceng;
	}

	public void setZhijiceng(Integer zhijiceng) {
		this.zhijiceng = zhijiceng;
	}

	public Double getMianji() {
		return mianji;
	}

	public void setMianji(Double mianji) {
		this.mianji = mianji;
	}

	public String getJiagedanwei() {
		return jiagedanwei;
	}

	public void setJiagedanwei(String jiagedanwei) {
		this.jiagedanwei = jiagedanwei;
	}

	public Long getJiage() {
		return jiage;
	}

	public void setJiage(Long jiage) {
		this.jiage = jiage;
	}

	public String getFangyuanxiangqing() {
		return fangyuanxiangqing;
	}

	public void setFangyuanxiangqing(String fangyuanxiangqing) {
		this.fangyuanxiangqing = fangyuanxiangqing;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCateId() {
		return cateId;
	}

	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public List<Picture> getPicList() {
		return picList;
	}

	public void setPicList(List<Picture> picList) {
		this.picList = picList;
	}
}