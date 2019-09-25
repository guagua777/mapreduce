package com.bj58.fang.hugopenapi;

import com.alibaba.fastjson.JSON;
import com.bj58.fang.hugopenapi.vo.house.SaleHouseVo;
import org.apache.commons.lang3.StringUtils;


public class SaleHouseFilter {



    public static boolean isXiaoquName(String str){
        SaleHouseVo saleHouseVo = JSON.parseObject(str, SaleHouseVo.class);
        if (StringUtils.isNotEmpty(saleHouseVo.getXiaoqu()) /*&& (saleHouseVo.getXiaoquId() == null || saleHouseVo.getXiaoquId() == 0)*/){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String str = "{\"beianbianhao\":\"11407\",\"jianzhuniandai\":1980,\"chanquanleixing\":1,\"weiyizhufang\":2,\"bianhao\":\"11407\",\"title\":\"印象剑桥6室-3厅2000.00万\",\"xiaoqu\":\"印象剑桥\",\"quyu\":\"滨湖区\",\"dizhi\":\"常乐路8号(十里明珠堤西侧)\",\"shi\":6,\"ting\":3,\"wei\":3,\"zonglouceng\":3,\"suozailouceng\":1,\"mianji\":642.0,\"chaoxiang\":9,\"zhuangxiuqingkuang\":1,\"fangwuleixing\":2,\"loudong\":\"37\",\"danyuan\":\"0\",\"menpaihao\":\"0\",\"loudongdanwei\":\"1\",\"danyuandanwei\":\"3\",\"dianti\":0,\"jiage\":20000000,\"pic\":\"[\\r\\n  {\\r\\n    \\\"category\\\": 2,\\r\\n    \\\"url\\\": \\\"http://img6.efw.cn/newerp/images/family/201706/fam2017521131542744221.jpg\\\",\\r\\n    \\\"iscover\\\": 0\\r\\n  },\\r\\n  {\\r\\n    \\\"category\\\": 3,\\r\\n    \\\"url\\\": \\\"http://img6.efw.cn/newerp/images/house/201706/pic201752113123596992.jpg\\\",\\r\\n    \\\"iscover\\\": 0\\r\\n  },\\r\\n  {\\r\\n    \\\"category\\\": 1,\\r\\n    \\\"url\\\": \\\"http://img6.efw.cn/newerp/images/house/201706/pic201752113122492958.jpg\\\",\\r\\n    \\\"iscover\\\": 0\\r\\n  },\\r\\n  {\\r\\n    \\\"category\\\": 1,\\r\\n    \\\"url\\\": \\\"http://img6.efw.cn/newerp/images/house/201706/pic2017521131213346307.jpg\\\",\\r\\n    \\\"iscover\\\": 0\\r\\n  },\\r\\n  {\\r\\n    \\\"category\\\": 1,\\r\\n    \\\"url\\\": \\\"http://img6.efw.cn/newerp/images/house/201706/pic201752113122278462.jpg\\\",\\r\\n    \\\"iscover\\\": 1\\r\\n  },\\r\\n  {\\r\\n    \\\"category\\\": 1,\\r\\n    \\\"url\\\": \\\"http://img6.efw.cn/newerp/images/house/201706/pic2017521131148193279.jpg\\\",\\r\\n    \\\"iscover\\\": 0\\r\\n  }\\r\\n]\",\"xiaoquId\":100499056,\"picList\":[],\"isBroker\":false,\"isUpdate\":false,\"clientId\":\"8cb0a7a402cd89039308dc7394088f7c\"}";
        SaleHouseVo saleHouseVo = JSON.parseObject(str, SaleHouseVo.class);
        System.out.println(saleHouseVo);
    }
}
