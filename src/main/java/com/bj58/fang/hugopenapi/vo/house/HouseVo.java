package com.bj58.fang.hugopenapi.vo.house;

import com.bj58.fang.united.hug.entity.Picture;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class HouseVo extends BaseVo implements Serializable {
	private static final long serialVersionUID = 5565762936245103988L;
	/**
	 * 房源编号
	 */
	private String bianhao;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 小区名称
	 */
	private String xiaoqu;
	/**
	 * 磐石区域名称
	 */
	private String quyu;
	/**
	 * 磐石区域id
	 */
	private Integer areaId;
	/**
	 * 磐石板块名称
	 */
	private String bankuai;
	/**
	 * 磐石板块id
	 */
	private Integer plateId; 
	/**
	 * 地址
	 */
	private String dizhi;
	/**
	 * 扩展字段
	 */
	private String extendMap;
	/**
	 * 室
	 */
	private Integer shi;
	/**
	 * 厅
	 */
	private Integer ting;
	/**
	 * 卫
	 */
	private Integer wei;
	/**
	 * 总楼层
	 */
	private Integer zonglouceng;
	/**
	 * 所在楼层
	 */
	private Integer suozailouceng;
	/**
	 * 建筑面积
	 */
	private Double mianji;
	/**
	 * 朝向
	 */
	private Integer chaoxiang;
	/**
	 * 装修情况
	 */
	private Integer zhuangxiuqingkuang;
	/**
	 * 房屋类型
	 */
	private Integer fangwuleixing;
	/**
	 * 楼栋
	 */
	private String loudong;
	/**
	 * 单元
	 */
	private String danyuan;
	/**
	 * 门牌号
	 */
	private String menpaihao;
	/**
	 * 楼栋单位
	 */
	private String loudongdanwei;
	/**
	 * 单元单位
	 */
	private String danyuandanwei;
	/**
	 * 楼栋门牌号是否来源于企业，值：{1：是， 2：否} 选填
	 */
	private String houseNumFromCo;
	/**
	 * 电梯
	 */
	private Integer dianti;
	/**
	 * 价格
	 */
	private Long jiage;
	/**
	 * 房源详情
	 */
	protected String fangyuanxiangqing;
	/**
	 * 房源标签
	 */
	private String fangyuantag;
	/**
	 * 房源图片
	 */
	private String pic;

	/**
	 * 小区id
	 */
	private Integer xiaoquId;
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
	
	/**
	 * 供暖方式
	 */
	private Integer heating;
	
	/**
	 * 门牌号详细信息（栋座传这个字段）
	 */
	private String roomNumberInfo;
	
	/*****商业地产字段补充start********/
	/**
	 * 价格
	 */
	private String jiage_bus;
	/**
	 * 租售方式
	 */
	private Integer zushoufangshi;
	/** 
     * 性质
     * 1.新房
     * 2.二手房
     */
	private Integer nature;
	/**
	 * 井冈山商圈id
	 */
	private Integer shangquanId;
	/**
	 * 经度
	 */
	private String lon;
	/**
	 * 纬度
	 */
	private String lat;
	/**
	 * 楼层分区
	 */
	private Integer loucengfenqu;
	/**
	 * 至几层
	 */
	private Integer zhijiceng;
	/**
	 * 价格单位
	 */
	private Integer jiagedanwei;
	
	/**
	 * 磐石楼盘id
	 */
	private Integer loupanid;
	
	/**
	 * 名称
	 */
	private String loupan;
	
	/*****商业地产字段补充end********/
	
	public static void main(String[]args) {
		HouseVo houseVo = new HouseVo();
		houseVo.setBankuai("123132132");
		System.out.println(houseVo);
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
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

	public String getXiaoqu() {
		return xiaoqu;
	}

	public void setXiaoqu(String xiaoqu) {
		this.xiaoqu = xiaoqu;
	}

	public String getQuyu() {
		return quyu;
	}

	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getBankuai() {
		return bankuai;
	}

	public void setBankuai(String bankuai) {
		this.bankuai = bankuai;
	}

	public Integer getPlateId() {
		return plateId;
	}

	public void setPlateId(Integer plateId) {
		this.plateId = plateId;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public String getExtendMap() {
		return extendMap;
	}

	public void setExtendMap(String extendMap) {
		this.extendMap = extendMap;
	}

	public Integer getShi() {
		return shi;
	}

	public void setShi(Integer shi) {
		this.shi = shi;
	}

	public Integer getTing() {
		return ting;
	}

	public void setTing(Integer ting) {
		this.ting = ting;
	}

	public Integer getWei() {
		return wei;
	}

	public void setWei(Integer wei) {
		this.wei = wei;
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

	public Double getMianji() {
		return mianji;
	}

	public void setMianji(Double mianji) {
		this.mianji = mianji;
	}

	public Integer getChaoxiang() {
		return chaoxiang;
	}

	public void setChaoxiang(Integer chaoxiang) {
		this.chaoxiang = chaoxiang;
	}

	public Integer getZhuangxiuqingkuang() {
		return zhuangxiuqingkuang;
	}

	public void setZhuangxiuqingkuang(Integer zhuangxiuqingkuang) {
		this.zhuangxiuqingkuang = zhuangxiuqingkuang;
	}

	public Integer getFangwuleixing() {
		return fangwuleixing;
	}

	public void setFangwuleixing(Integer fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}

	public String getLoudong() {
		return loudong;
	}

	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}

	public String getDanyuan() {
		return danyuan;
	}

	public void setDanyuan(String danyuan) {
		this.danyuan = danyuan;
	}

	public String getMenpaihao() {
		return menpaihao;
	}

	public void setMenpaihao(String menpaihao) {
		this.menpaihao = menpaihao;
	}

	public String getLoudongdanwei() {
		return loudongdanwei;
	}

	public void setLoudongdanwei(String loudongdanwei) {
		this.loudongdanwei = loudongdanwei;
	}

	public String getDanyuandanwei() {
		return danyuandanwei;
	}

	public void setDanyuandanwei(String danyuandanwei) {
		this.danyuandanwei = danyuandanwei;
	}

	public String getHouseNumFromCo() {
		return houseNumFromCo;
	}

	public void setHouseNumFromCo(String houseNumFromCo) {
		this.houseNumFromCo = houseNumFromCo;
	}

	public Integer getDianti() {
		return dianti;
	}

	public void setDianti(Integer dianti) {
		this.dianti = dianti;
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

	public String getFangyuantag() {
		return fangyuantag;
	}

	public void setFangyuantag(String fangyuantag) {
		this.fangyuantag = fangyuantag;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getXiaoquId() {
		return xiaoquId;
	}

	public void setXiaoquId(Integer xiaoquId) {
		this.xiaoquId = xiaoquId;
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

	public Integer getHeating() {
		return heating;
	}

	public void setHeating(Integer heating) {
		this.heating = heating;
	}

	public String getRoomNumberInfo() {
		return roomNumberInfo;
	}

	public void setRoomNumberInfo(String roomNumberInfo) {
		this.roomNumberInfo = roomNumberInfo;
	}

	public String getJiage_bus() {
		return jiage_bus;
	}

	public void setJiage_bus(String jiage_bus) {
		this.jiage_bus = jiage_bus;
	}

	public Integer getZushoufangshi() {
		return zushoufangshi;
	}

	public void setZushoufangshi(Integer zushoufangshi) {
		this.zushoufangshi = zushoufangshi;
	}

	public Integer getNature() {
		return nature;
	}

	public void setNature(Integer nature) {
		this.nature = nature;
	}

	public Integer getShangquanId() {
		return shangquanId;
	}

	public void setShangquanId(Integer shangquanId) {
		this.shangquanId = shangquanId;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public Integer getLoucengfenqu() {
		return loucengfenqu;
	}

	public void setLoucengfenqu(Integer loucengfenqu) {
		this.loucengfenqu = loucengfenqu;
	}

	public Integer getZhijiceng() {
		return zhijiceng;
	}

	public void setZhijiceng(Integer zhijiceng) {
		this.zhijiceng = zhijiceng;
	}

	public Integer getJiagedanwei() {
		return jiagedanwei;
	}

	public void setJiagedanwei(Integer jiagedanwei) {
		this.jiagedanwei = jiagedanwei;
	}

	public Integer getLoupanid() {
		return loupanid;
	}

	public void setLoupanid(Integer loupanid) {
		this.loupanid = loupanid;
	}

	public String getLoupan() {
		return loupan;
	}

	public void setLoupan(String loupan) {
		this.loupan = loupan;
	}
}