
package com.shanyuan.platform.ms.base.common.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;




public class ImageUtil {
	/**
	 *图形
	 */
	public static final  String  cdn_end_point = "https://cdn.17shanyuan.com";
	/**
	 * 图片的拼接名
	 */
	public static final  String  OSS_DIRK_ARTICLE_SHAREICON = "article/share_icon";
	/**
	 * 评价晒图
	 */
	public static final  String  cdnres_point = "https://cdnres.17shanyuan.com";
	
	/**
	 * 测试cdn
	 */
	public static final String cdn_test_point = "https://cdnt.17shanyuan.com";
	
	/**
	 * PHP项目域名
	 */
	public static final  String  php_point = "https://www.17shanyuan.com";
	
	/**
	 * cndres
	 */
	public static final  String  cnd_res_point = "https://cdnres.17shanyuan.com";
	
	/**
	 * 图片路径
	 * @author 钟颖 
	 * @param file
	 * @param storeId
	 * @param type
	 * @param goodsProjectType
	 * @return
	 */
	public static String getGoodsImgFullUrl(String file,Integer storeId,String type,Integer goodsProjectType) {
		String  imageUrl="";
			List<String> types=	new ArrayList<String>();
			types.add("240");
			types.add("480");
			types.add("960");
			//获取oss上图片缩略图的图片名称
			file =types.contains(type)?file+"?x-oss-process=style/thumb_"+type:file;
			imageUrl=cdn_end_point+"/goods"+"/"+storeId+"/"+file;
		return imageUrl;
	}

	/**
	 * @auther zhongying
	 * @param file
	 * @param type
	 * @return
	 */
	public static String getTopicUrl(String file,String type) {
		String  imageUrl="";
		if(!ObjectUtils.isEmpty(file)&&file.contains("oss_")){
			if("240".equals(type)||"480".equals(type)||"960".equals(type)){
				file=file+"?x-oss-process=style/thumb_"+type;
			}
			imageUrl=cdn_end_point+"/"+OSS_DIRK_ARTICLE_SHAREICON+"/"+file;
		}else if(!ObjectUtils.isEmpty(file)){
			imageUrl = file;
		}
		return imageUrl;
	}
	/**
	 * 获取用户头像
	 * @param memberAvatar 用户头像图片名
	 * @param memberSex 用户性别
	 * @author zhangwd
	 */
	public static String getUserHeadImgUrl(String memberAvatar, Byte memberSex, String type) {
		
		if(!ObjectUtils.isEmpty(type)&&!ObjectUtils.isEmpty(memberAvatar)) {
			memberAvatar=memberAvatar.replace(".", "_"+type+".");
		}
		String url = null;
		if (!ObjectUtils.isEmpty(memberAvatar)) {
			url  = cnd_res_point + "/data/upload/syrs/avatar/" +  memberAvatar;
		}else {
			
			if ( (byte)2 == memberSex) {
				url  = php_point + "/boc/templates/default/assets/images/woman_1710.png";
			}else {
				url = php_point + "/boc/templates/default/assets/images/man_1710.png";
			}
		}
		
		return url;
	}
	/**
	 * 获取结对贫困户的的头像图片
	 * @param memberAvatar
	 * @param memberSex
	 * @param type
	 * @return
	 */
	public static String getPoorHeadImgUrl(String memberAvatar, Byte memberSex) {
		
		String url = null;
		if (!ObjectUtils.isEmpty(memberAvatar)) {
			url  = cnd_res_point + "/data/upload/syrs/avatar/" +  memberAvatar;
		}else {
			
			if ( (byte)2 == memberSex) {
				url  = php_point + "/boc/templates/default/assets/images/poor_face_default_1710.png";
			}else {
				url = php_point + "/boc/templates/default/assets/images/poor_face_default_1710.png";
			}
		}
		
		return url;
	}
	/***
	 * 评头像图片
	 * @param memberAvatar
	 * @param memberSex
	 * @param type
	 * @return
	 */
public static String getEvaluateMemberAvatar(String memberAvatar, Byte memberSex, String type) {
	
		if(!ObjectUtils.isEmpty(type)) {
			memberAvatar=memberAvatar.replace(".", "_"+type+".");
		}
		String url = "";
		if (!ObjectUtils.isEmpty(memberAvatar)) {
			url  = "/data/upload/syrs/avatar" +  memberAvatar;
		}else {
			String str="/boc/templates/default/assets/images/default_avatar.png";
			url= str;
		}
		
		return cdnres_point+url;
	}
	/**
	 * 获取贫困户头像点击时的url
	 * @param memberId
	 * @author zhangwd
	 */
	public static String getHeadImgClickedUrl(Integer memberId) {
		
		String str = "/bocm/index.php?act=goods&op=support_poor_member_goods_list&member_id=";
		
		return str + memberId;
	}
	/**
	 * 评价图片
	 * @param memberId
	 * @author 钟颖
	 */
	public static String getImageUrlByUpDir(String image,String saveDir, String type) {
		
		String str = "/data/upload/syrs/common/default_goods_image.png";
		if(!ObjectUtils.isEmpty(image)) {
			if(!ObjectUtils.isEmpty(type)) {
				 String image2 = image.replace(".", "_"+type+".");
				 image = image2;
			}
			str="/data/upload/"+saveDir+"/"+image;
		}
		
		return cdnres_point+str;
	}
	
	/**
	 * 获取图片完整路径
	 * @param host 当前cdn域名
	 * @param imgPre 图片所属项目，如recommend，index
	 * @param imgUrl 图片路径
	 * @return
	 */
	public static String getImageFullUrlForOss(String host, String imgPre, String imgUrl){
		if(imgUrl.startsWith("http") || imgUrl.startsWith("https")){
			return imgUrl;
		}else{
			imgUrl = host + imgPre + imgUrl;
			return imgUrl;
		}
	}
}
	
	
	


