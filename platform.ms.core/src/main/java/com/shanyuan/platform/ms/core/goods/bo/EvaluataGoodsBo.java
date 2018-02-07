package com.shanyuan.platform.ms.core.goods.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.common.util.SerializeUtil;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsDetail;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;

public class EvaluataGoodsBo {

	private Integer gevalId;
	private Integer gevalOrderId;
	private Integer gevalFromId;
	private Integer editTime;

	private BigDecimal gevalScores;
	private String gevalOrderno;
	private Integer gevalGoodsid;
	private Integer publisherId;
	private Integer gevalStoreid;
	private String gevalContent;
	private String gevalImage;
	private String gevalImage2;
	private String gevalImage3;
	private String goodsSpec;
	private String goodsImage;
	private String goodsName;
	private String showName;
	private boolean isOutTime;
	private String face;
	private String gevalAddtime;
	List<Map<String,Object>> replyList = new ArrayList<Map<String,Object>> ();
	

	public EvaluataGoodsBo() {
	}
	public EvaluataGoodsBo(SyEvaluateGoodsBo eo,SyMember member,SyOrder or,SyOrderGoods og) {
		this.publisherId= eo.getPublisherId();
		this.editTime = eo.getEdittime();
		this.gevalScores = new BigDecimal(eo.getGevalScores());
		this.gevalOrderno = eo.getGevalOrderno().toString();
		 
		this.gevalStoreid = eo.getGevalStoreid();
		this.gevalGoodsid = eo.getGevalGoodsid();
		this.gevalOrderId= eo.getGevalOrderid();
		this.gevalId = eo.getGevalId();
		this.gevalFromId = eo.getGevalFrommemberid();
		String goodsImage2="";
		String goodsName2="";
		String goodsSpec2="";
		if(!ObjectUtils.isEmpty(og)) {
			goodsImage2= og.getGoodsImage();
			//1
			goodsName2= og.getGoodsName();
			String goodsSpec3 = og.getGoodsSpec();
			goodsSpec2= SerializeUtil.getSpecUnSerialize(goodsSpec3);
			
		}
		
		this.goodsName = goodsName2;
		this.goodsSpec = goodsSpec2;
		boolean isOutTime=false;
		if(!ObjectUtils.isEmpty(or)) {
			Integer finnshedTime = or.getFinnshedTime();
			//3
			isOutTime = DateUtil.checkIsOutTime(finnshedTime, 0, 30);
			Integer storeId = or.getStoreId();
			Integer goodsProjectType = or.getGoodsProjectType();
			//4
			goodsImage2 = ImageUtil.getGoodsImgFullUrl(goodsImage2, storeId, "240", goodsProjectType);
		}
		this.goodsImage =goodsImage2;
		this.isOutTime=isOutTime;
		
		String gevalImage = eo.getGevalImage();
		
		String gevalImage2 = eo.getGevalImage2();
		String gevalImage3 = eo.getGevalImage3();
		//晒图
		this.gevalImage = ObjectUtils.isEmpty(gevalImage)?"":ImageUtil.getImageUrlByUpDir(gevalImage, "syrs/evaluate", "240");
		this.gevalImage2 = ObjectUtils.isEmpty(gevalImage2)?"":ImageUtil.getImageUrlByUpDir(gevalImage2, "syrs/evaluate", "240");
		this.gevalImage3 = ObjectUtils.isEmpty(gevalImage3)?"":ImageUtil.getImageUrlByUpDir(gevalImage3, "syrs/evaluate", "240");
		String gevalContent2 = eo.getGevalContent();
		this.gevalContent = ObjectUtils.isEmpty(gevalContent2)?"评价方未填写":gevalContent2;
	/*	//showName
	    String showName = userService.getUserTrueName(syMember);
		Byte gevalIsanonymous = eo.getGevalIsanonymous();
		if(!ObjectUtils.isEmpty(gevalIsanonymous)&&gevalIsanonymous==1) {
			//匿名评价不显示全名
			if(!ObjectUtils.isEmpty(showName)&&!ValidUtil.validPhone(showName)&&!showName.contains("*")) {
				showName =showName.substring(0, 1)+"**";
			}
		}*/
		//头像
		
		String face1="";
		if(!ObjectUtils.isEmpty(member)) {
			face1 = ImageUtil.getEvaluateMemberAvatar(member.getMemberAvatar(), member.getMemberSex(), null);
		}
		this.face= face1;
	   Integer gevalAddtime2 = eo.getGevalAddtime();
	   Long addtime = ObjectUtils.isEmpty(gevalAddtime2)?0L:gevalAddtime2;
	   String addtime2 = DateUtil.getIntegerToNyr(addtime);
	   this.gevalAddtime=addtime2;
	   List<SyEvaluateGoodsDetail> replyList2 = eo.getReplyList();
	   for(SyEvaluateGoodsDetail rep:replyList2) {
		   Map<String ,Object> map=  new HashMap<String ,Object>();
		   String replayTime = rep.getReplayTime();
		   Integer replyerId = rep.getReplyerId();
		   String replyerName = rep.getReplyerName();
		   String content = rep.getContent();
		   map.put("replayTime", replayTime);
		   map.put("replyerId", replyerId);
		   map.put("replyerName", replyerName);
		   map.put("content", content);
		   replyList.add(map);
		   
	   }
		
	}
	
	
	public Integer getGevalFromId() {
		return gevalFromId;
	}
	public void setGevalFromId(Integer gevalFromId) {
		this.gevalFromId = gevalFromId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getGevalId() {
		return gevalId;
	}
	public void setGevalId(Integer gevalId) {
		this.gevalId = gevalId;
	}
	public Integer getGevalOrderId() {
		return gevalOrderId;
	}
	public void setGevalOrderId(Integer gevalOrderId) {
		this.gevalOrderId = gevalOrderId;
	}
	public Integer getEditTime() {
		return editTime;
	}
	public void setEditTime(Integer edittime) {
		this.editTime = edittime;
	}
	public BigDecimal getGevalScores() {
		return gevalScores;
	}
	public void setGevalScores(BigDecimal gevalScores) {
		this.gevalScores = gevalScores;
	}
	public String getGevalOrderno() {
		return gevalOrderno;
	}
	public void setGevalOrderno(String gevalOrderno) {
		this.gevalOrderno = gevalOrderno;
	}
	public Integer getGevalGoodsid() {
		return gevalGoodsid;
	}
	public void setGevalGoodsid(Integer gevalGoodsid) {
		this.gevalGoodsid = gevalGoodsid;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public Integer getGevalStoreid() {
		return gevalStoreid;
	}
	public void setGevalStoreid(Integer gevalStoreid) {
		this.gevalStoreid = gevalStoreid;
	}
	public String getGevalContent() {
		return gevalContent;
	}
	public void setGevalContent(String gevalContent) {
		this.gevalContent = gevalContent;
	}
	public String getGevalImage() {
		return gevalImage;
	}
	public void setGevalImage(String gevalImage) {
		this.gevalImage = gevalImage;
	}
	public String getGevalImage2() {
		return gevalImage2;
	}
	public void setGevalImage2(String gevalImage2) {
		this.gevalImage2 = gevalImage2;
	}
	public String getGevalImage3() {
		return gevalImage3;
	}
	public void setGevalImage3(String gevalImage3) {
		this.gevalImage3 = gevalImage3;
	}
	public String getGoodsSpec() {
		return goodsSpec;
	}
	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public boolean isOutTime() {
		return isOutTime;
	}
	public void setOutTime(boolean isOutTime) {
		this.isOutTime = isOutTime;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getGevalAddtime() {
		return gevalAddtime;
	}
	public void setGevalAddtime(String gevalAddtime) {
		this.gevalAddtime = gevalAddtime;
	}
	public List<Map<String, Object>> getReplyList() {
		return replyList;
	}
	public void setReplyList(List<Map<String, Object>> replyList) {
		this.replyList = replyList;
	}
	
	@Override
	public String toString() {
		return "EvaluataGoodsBo [gevalId=" + gevalId + ", gevalOrderId=" + gevalOrderId + ", gevalFromId=" + gevalFromId
				+ ", edittime=" + editTime + ", gevalScores=" + gevalScores + ", gevalOrderno=" + gevalOrderno
				+ ", gevalGoodsid=" + gevalGoodsid + ", publisherId=" + publisherId + ", gevalStoreid=" + gevalStoreid
				+ ", gevalContent=" + gevalContent + ", gevalImage=" + gevalImage + ", gevalImage2=" + gevalImage2
				+ ", gevalImage3=" + gevalImage3 + ", goodsSpec=" + goodsSpec + ", goodsImage=" + goodsImage
				+ ", goodsName=" + goodsName + ", showName=" + showName + ", isOutTime=" + isOutTime + ", face=" + face
				+ ", gevalAddtime=" + gevalAddtime + ", replyList=" + replyList + "]";
	}
}
