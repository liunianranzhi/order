
package com.shanyuan.platform.ms.core.goods.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsDetail;

public class SyEvaluateGoodsBo {
	 /**
     * 评价ID
     */
    private Integer gevalId;

    /**
     * 订单表自增ID
     */
    private Integer gevalOrderid;

    /**
     * 订单编号
     */
    private Long gevalOrderno;

    /**
     * 订单商品表编号
     */
    private Integer gevalOrdergoodsid;

    /**
     * 商品表编号
     */
    private Integer gevalGoodsid;

    /**
     * 商品名称
     */
    private String gevalGoodsname;

    /**
     * 商品价格
     */
    private BigDecimal gevalGoodsprice;

    /**
     * 1-5分
     */
    private Byte gevalScores;

    /**
     * 信誉评价内容
     */
    private String gevalContent;

    /**
     * 0表示不是 1表示是匿名评价
     */
    private Byte gevalIsanonymous;

    /**
     * 评价时间
     */
    private Integer gevalAddtime;

    /**
     * 店铺编号
     */
    private Integer gevalStoreid;

    /**
     * 店铺名称
     */
    private String gevalStorename;

    /**
     * 评价人编号
     */
    private Integer gevalFrommemberid;

    /**
     * 评价人名称
     */
    private String gevalFrommembername;

    /**
     * 评价信息的状态 0为正常 1为禁止显示
     */
    private Byte gevalState;

    /**
     * 管理员对评价的处理备注
     */
    private String gevalRemark;

    /**
     * 解释内容
     */
    private String gevalExplain;

    /**
     * 晒单图片
     */
    private String gevalImage;

    /**
     * 发布者id
     */
    private Integer publisherId;

    /**
     * 编辑时间
     */
    private Integer edittime;

    /**
     * 评价类型0:系统自动评价1:手动评价
     */
    private Byte gevalType;

    /**
     * 评价报警沟通状态
     */
    private Byte gevalCommunicationStatus;

    /**
     * 商品公共表id
     */
    private Integer goodsCommonid;

    /**
     * 评价图片2
     */
    private String gevalImage2;

    /**
     * 评价图片3
     */
    private String gevalImage3;
    
   
    
    
    
    
    
    //评价对应的回复
    List<SyEvaluateGoodsDetail> replyList = new ArrayList<SyEvaluateGoodsDetail>();
    
    
    

    
	public List<SyEvaluateGoodsDetail> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<SyEvaluateGoodsDetail> replyList) {
		this.replyList = replyList;
	}


	/**
     * 评价ID
     * @return geval_id 评价ID
     */
    public Integer getGevalId() {
        return gevalId;
    }

    /**
     * 评价ID
     * @param gevalId 评价ID
     */
    public void setGevalId(Integer gevalId) {
        this.gevalId = gevalId;
    }

    /**
     * 订单表自增ID
     * @return geval_orderid 订单表自增ID
     */
    public Integer getGevalOrderid() {
        return gevalOrderid;
    }

    /**
     * 订单表自增ID
     * @param gevalOrderid 订单表自增ID
     */
    public void setGevalOrderid(Integer gevalOrderid) {
        this.gevalOrderid = gevalOrderid;
    }

    /**
     * 订单编号
     * @return geval_orderno 订单编号
     */
    public Long getGevalOrderno() {
        return gevalOrderno;
    }

    /**
     * 订单编号
     * @param gevalOrderno 订单编号
     */
    public void setGevalOrderno(Long gevalOrderno) {
        this.gevalOrderno = gevalOrderno;
    }

    /**
     * 订单商品表编号
     * @return geval_ordergoodsid 订单商品表编号
     */
    public Integer getGevalOrdergoodsid() {
        return gevalOrdergoodsid;
    }

    /**
     * 订单商品表编号
     * @param gevalOrdergoodsid 订单商品表编号
     */
    public void setGevalOrdergoodsid(Integer gevalOrdergoodsid) {
        this.gevalOrdergoodsid = gevalOrdergoodsid;
    }

    /**
     * 商品表编号
     * @return geval_goodsid 商品表编号
     */
    public Integer getGevalGoodsid() {
        return gevalGoodsid;
    }

    /**
     * 商品表编号
     * @param gevalGoodsid 商品表编号
     */
    public void setGevalGoodsid(Integer gevalGoodsid) {
        this.gevalGoodsid = gevalGoodsid;
    }

    /**
     * 商品名称
     * @return geval_goodsname 商品名称
     */
    public String getGevalGoodsname() {
        return gevalGoodsname;
    }

    /**
     * 商品名称
     * @param gevalGoodsname 商品名称
     */
    public void setGevalGoodsname(String gevalGoodsname) {
        this.gevalGoodsname = gevalGoodsname == null ? null : gevalGoodsname.trim();
    }

    /**
     * 商品价格
     * @return geval_goodsprice 商品价格
     */
    public BigDecimal getGevalGoodsprice() {
        return gevalGoodsprice;
    }

    /**
     * 商品价格
     * @param gevalGoodsprice 商品价格
     */
    public void setGevalGoodsprice(BigDecimal gevalGoodsprice) {
        this.gevalGoodsprice = gevalGoodsprice;
    }

    /**
     * 1-5分
     * @return geval_scores 1-5分
     */
    public Byte getGevalScores() {
        return gevalScores;
    }

    /**
     * 1-5分
     * @param gevalScores 1-5分
     */
    public void setGevalScores(Byte gevalScores) {
        this.gevalScores = gevalScores;
    }

    /**
     * 信誉评价内容
     * @return geval_content 信誉评价内容
     */
    public String getGevalContent() {
        return gevalContent;
    }

    /**
     * 信誉评价内容
     * @param gevalContent 信誉评价内容
     */
    public void setGevalContent(String gevalContent) {
        this.gevalContent = gevalContent == null ? null : gevalContent.trim();
    }

    /**
     * 0表示不是 1表示是匿名评价
     * @return geval_isanonymous 0表示不是 1表示是匿名评价
     */
    public Byte getGevalIsanonymous() {
        return gevalIsanonymous;
    }

    /**
     * 0表示不是 1表示是匿名评价
     * @param gevalIsanonymous 0表示不是 1表示是匿名评价
     */
    public void setGevalIsanonymous(Byte gevalIsanonymous) {
        this.gevalIsanonymous = gevalIsanonymous;
    }

    /**
     * 评价时间
     * @return geval_addtime 评价时间
     */
    public Integer getGevalAddtime() {
        return gevalAddtime;
    }

    /**
     * 评价时间
     * @param gevalAddtime 评价时间
     */
    public void setGevalAddtime(Integer gevalAddtime) {
        this.gevalAddtime = gevalAddtime;
    }

    /**
     * 店铺编号
     * @return geval_storeid 店铺编号
     */
    public Integer getGevalStoreid() {
        return gevalStoreid;
    }

    /**
     * 店铺编号
     * @param gevalStoreid 店铺编号
     */
    public void setGevalStoreid(Integer gevalStoreid) {
        this.gevalStoreid = gevalStoreid;
    }

    /**
     * 店铺名称
     * @return geval_storename 店铺名称
     */
    public String getGevalStorename() {
        return gevalStorename;
    }

    /**
     * 店铺名称
     * @param gevalStorename 店铺名称
     */
    public void setGevalStorename(String gevalStorename) {
        this.gevalStorename = gevalStorename == null ? null : gevalStorename.trim();
    }

    /**
     * 评价人编号
     * @return geval_frommemberid 评价人编号
     */
    public Integer getGevalFrommemberid() {
        return gevalFrommemberid;
    }

    /**
     * 评价人编号
     * @param gevalFrommemberid 评价人编号
     */
    public void setGevalFrommemberid(Integer gevalFrommemberid) {
        this.gevalFrommemberid = gevalFrommemberid;
    }

    /**
     * 评价人名称
     * @return geval_frommembername 评价人名称
     */
    public String getGevalFrommembername() {
        return gevalFrommembername;
    }

    /**
     * 评价人名称
     * @param gevalFrommembername 评价人名称
     */
    public void setGevalFrommembername(String gevalFrommembername) {
        this.gevalFrommembername = gevalFrommembername == null ? null : gevalFrommembername.trim();
    }

    /**
     * 评价信息的状态 0为正常 1为禁止显示
     * @return geval_state 评价信息的状态 0为正常 1为禁止显示
     */
    public Byte getGevalState() {
        return gevalState;
    }

    /**
     * 评价信息的状态 0为正常 1为禁止显示
     * @param gevalState 评价信息的状态 0为正常 1为禁止显示
     */
    public void setGevalState(Byte gevalState) {
        this.gevalState = gevalState;
    }

    /**
     * 管理员对评价的处理备注
     * @return geval_remark 管理员对评价的处理备注
     */
    public String getGevalRemark() {
        return gevalRemark;
    }

    /**
     * 管理员对评价的处理备注
     * @param gevalRemark 管理员对评价的处理备注
     */
    public void setGevalRemark(String gevalRemark) {
        this.gevalRemark = gevalRemark == null ? null : gevalRemark.trim();
    }

    /**
     * 解释内容
     * @return geval_explain 解释内容
     */
    public String getGevalExplain() {
        return gevalExplain;
    }

    /**
     * 解释内容
     * @param gevalExplain 解释内容
     */
    public void setGevalExplain(String gevalExplain) {
        this.gevalExplain = gevalExplain == null ? null : gevalExplain.trim();
    }

    /**
     * 晒单图片
     * @return geval_image 晒单图片
     */
    public String getGevalImage() {
        return gevalImage;
    }

    /**
     * 晒单图片
     * @param gevalImage 晒单图片
     */
    public void setGevalImage(String gevalImage) {
        this.gevalImage = gevalImage == null ? null : gevalImage.trim();
    }

    /**
     * 发布者id
     * @return publisher_id 发布者id
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * 发布者id
     * @param publisherId 发布者id
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * 编辑时间
     * @return edittime 编辑时间
     */
    public Integer getEdittime() {
        return edittime;
    }

    /**
     * 编辑时间
     * @param edittime 编辑时间
     */
    public void setEdittime(Integer edittime) {
        this.edittime = edittime;
    }

    /**
     * 评价类型0:系统自动评价1:手动评价
     * @return geval_type 评价类型0:系统自动评价1:手动评价
     */
    public Byte getGevalType() {
        return gevalType;
    }

    /**
     * 评价类型0:系统自动评价1:手动评价
     * @param gevalType 评价类型0:系统自动评价1:手动评价
     */
    public void setGevalType(Byte gevalType) {
        this.gevalType = gevalType;
    }

    /**
     * 评价报警沟通状态
     * @return geval_communication_status 评价报警沟通状态
     */
    public Byte getGevalCommunicationStatus() {
        return gevalCommunicationStatus;
    }

    /**
     * 评价报警沟通状态
     * @param gevalCommunicationStatus 评价报警沟通状态
     */
    public void setGevalCommunicationStatus(Byte gevalCommunicationStatus) {
        this.gevalCommunicationStatus = gevalCommunicationStatus;
    }

    /**
     * 商品公共表id
     * @return goods_commonid 商品公共表id
     */
    public Integer getGoodsCommonid() {
        return goodsCommonid;
    }

    /**
     * 商品公共表id
     * @param goodsCommonid 商品公共表id
     */
    public void setGoodsCommonid(Integer goodsCommonid) {
        this.goodsCommonid = goodsCommonid;
    }

    /**
     * 评价图片2
     * @return geval_image2 评价图片2
     */
    public String getGevalImage2() {
        return gevalImage2;
    }

    /**
     * 评价图片2
     * @param gevalImage2 评价图片2
     */
    public void setGevalImage2(String gevalImage2) {
        this.gevalImage2 = gevalImage2 == null ? null : gevalImage2.trim();
    }

    /**
     * 评价图片3
     * @return geval_image3 评价图片3
     */
    public String getGevalImage3() {
        return gevalImage3;
    }

    /**
     * 评价图片3
     * @param gevalImage3 评价图片3
     */
    public void setGevalImage3(String gevalImage3) {
        this.gevalImage3 = gevalImage3 == null ? null : gevalImage3.trim();
    }

}
