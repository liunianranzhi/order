package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_goods_cert表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyGoodsCert {
    /**
     * 商品认证id
     */
    private Integer goodsCertId;

    /**
     * 商品公共内容id
     */
    private Integer goodsCommonid;

    /**
     * 产品认证类型,有机/绿色/欧盟/无公害
     */
    private String goodsCertType;

    /**
     * 商品认证图片
     */
    private String goodsCertImage;

    /**
     * 证书编号
     */
    private String goodsCertNo;

    /**
     * 商品认证id
     * @return goods_cert_id 商品认证id
     */
    public Integer getGoodsCertId() {
        return goodsCertId;
    }

    /**
     * 商品认证id
     * @param goodsCertId 商品认证id
     */
    public void setGoodsCertId(Integer goodsCertId) {
        this.goodsCertId = goodsCertId;
    }

    /**
     * 商品公共内容id
     * @return goods_commonid 商品公共内容id
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * 商品公共内容id
     * @param goodsCommonid 商品公共内容id
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    /**
     * 产品认证类型,有机/绿色/欧盟/无公害
     * @return goods_cert_type 产品认证类型,有机/绿色/欧盟/无公害
     */
    public String getGoodsCertType() {
        return goodsCertType;
    }

    /**
     * 产品认证类型,有机/绿色/欧盟/无公害
     * @param goodsCertType 产品认证类型,有机/绿色/欧盟/无公害
     */
    public void setGoodsCertType(String goodsCertType) {
        this.goodsCertType = goodsCertType == null ? null : goodsCertType.trim();
    }

    /**
     * 商品认证图片
     * @return goods_cert_image 商品认证图片
     */
    public String getGoodsCertImage() {
        return goodsCertImage;
    }

    /**
     * 商品认证图片
     * @param goodsCertImage 商品认证图片
     */
    public void setGoodsCertImage(String goodsCertImage) {
        this.goodsCertImage = goodsCertImage == null ? null : goodsCertImage.trim();
    }

    /**
     * 证书编号
     * @return goods_cert_no 证书编号
     */
    public String getGoodsCertNo() {
        return goodsCertNo;
    }

    /**
     * 证书编号
     * @param goodsCertNo 证书编号
     */
    public void setGoodsCertNo(String goodsCertNo) {
        this.goodsCertNo = goodsCertNo == null ? null : goodsCertNo.trim();
    }
}