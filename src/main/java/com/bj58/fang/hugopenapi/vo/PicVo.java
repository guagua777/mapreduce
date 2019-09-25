package com.bj58.fang.hugopenapi.vo;

/**
 * 图片Json实体
 *
 * @author liaoxingjie
 */
public class PicVo {
    /**
     * 图片类型
     * 1：室内图
     * 2：户型图
     * 3：室外图
     */
    private Integer category;
    /**
     * 图片链接url
     */
    private String url;
    /**
     * 是否封面
     */
    private Integer iscover;

    @Override
    public int hashCode() {
        return url.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PicVo) {
            PicVo picVo = (PicVo) obj;
            if (picVo.category.intValue() == this.category.intValue() && picVo.url.equals(this.url) && picVo.iscover.intValue() == this.iscover.intValue()) {
                return true;
            }
        }
        return false;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIscover() {
        return iscover;
    }

    public void setIscover(Integer iscover) {
        this.iscover = iscover;
    }
}
