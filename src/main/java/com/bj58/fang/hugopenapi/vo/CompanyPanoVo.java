package com.bj58.fang.hugopenapi.vo;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CompanyPanoVo {

    //====================
    //经纪公司必填参数
    private String sourceUrl;

    private String sourceHash;

    /**
     * 经纪公司内网房源编号
     */
    private String bianHao;

//    @Pattern(regexp = "0|1", message = "必须从指定值{0,1}中选取")
    private Integer flag3D;

    /**
     * 一期只做二手房
     */
//    @NotNull
//    @Pattern(regexp = "13|11|12", message = "必须从指定值{13,11,12}中选取")
    private Integer cateId;

    //===============================
    //传递全景业务参数
//    private int companyId; //":"1",        //三网公司ID
//    private long commId; //":100026839,     //磐石小区ID
//    private int commType = 1; //":1,           //小区类型,写死1即可
//    private String addressInComm; //":"test"  //小区地址
//    private int hallNum; //":1,            //几厅
//    private int roomNum; //":1,            //几室
//    private int toiletNum; //":1,          //几卫
//    private int audioToggle = 2; //":2,        //写死2即可,表示不需要AI讲房
//    private String zipLocals; //":"http://testv1.wos.58dns.org/WYxtSrQpOnWY.zip",  //zip包地址


}
