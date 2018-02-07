package com.shanyuan.platform.ms.dao.store.entity;

import java.math.BigDecimal;

/**
 * 描述:sy_store表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyStore {
    /**
     * 店铺索引id
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺认证
     */
    private Byte storeAuth;

    /**
     * 店主认证
     */
    private Byte nameAuth;

    /**
     * 店铺等级
     */
    private Integer gradeId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 店主卖家用户名
     */
    private String sellerName;

    /**
     * 身份证
     */
    private String storeOwnerCard;

    /**
     * 店铺分类
     */
    private Integer scId;

    /**
     * 店铺公司名称
     */
    private String storeCompanyName;

    /**
     * 地区id
     */
    private Integer areaId;

    /**
     * 地区内容，冗余数据
     */
    private String areaInfo;

    /**
     * 详细地区
     */
    private String storeAddress;

    /**
     * 邮政编码
     */
    private String storeZip;

    /**
     * 电话号码
     */
    private String storeTel;

    /**
     * 证件上传
     */
    private String storeImage;

    /**
     * 执照上传
     */
    private String storeImage1;

    /**
     * 店铺状态，0关闭，1开启，2审核中
     */
    private Byte storeState;

    /**
     * 店铺关闭原因
     */
    private String storeCloseInfo;

    /**
     * 店铺排序
     */
    private Integer storeSort;

    /**
     * 店铺时间
     */
    private String storeTime;

    /**
     * 店铺关闭时间
     */
    private String storeEndTime;

    /**
     * 店铺logo
     */
    private String storeLabel;

    /**
     * 店铺横幅
     */
    private String storeBanner;

    /**
     * 店铺seo关键字
     */
    private String storeKeywords;

    /**
     * 店铺seo描述
     */
    private String storeDescription;

    /**
     * QQ
     */
    private String storeQq;

    /**
     * 阿里旺旺
     */
    private String storeWw;

    /**
     * 店铺二级域名
     */
    private String storeDomain;

    /**
     * 二级域名修改次数
     */
    private Byte storeDomainTimes;

    /**
     * 推荐，0为否，1为是，默认为0
     */
    private Byte storeRecommend;

    /**
     * 店铺当前主题
     */
    private String storeTheme;

    /**
     * 店铺信用
     */
    private Integer storeCredit;

    /**
     * 店铺好评率
     */
    private Float praiseRate;

    /**
     * 描述相符度分数
     */
    private Float storeDesccredit;

    /**
     * 服务态度分数
     */
    private Float storeServicecredit;

    /**
     * 发货速度分数
     */
    private Float storeDeliverycredit;

    /**
     * 店铺收藏数量
     */
    private Integer storeCollect;

    /**
     * 店铺印章
     */
    private String storeStamp;

    /**
     * 打印订单页面下方说明文字
     */
    private String storePrintdesc;

    /**
     * 店铺销量
     */
    private Integer storeSales;

    /**
     * 工作时间
     */
    private String storeWorkingtime;

    /**
     * 超出该金额免运费，大于0才表示该值有效
     */
    private BigDecimal storeFreePrice;

    /**
     * 库存警报
     */
    private Byte storeStorageAlarm;

    /**
     * 店铺索引id
     * @return store_id 店铺索引id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺索引id
     * @param storeId 店铺索引id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 店铺名称
     * @return store_name 店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 店铺名称
     * @param storeName 店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 店铺认证
     * @return store_auth 店铺认证
     */
    public Byte getStoreAuth() {
        return storeAuth;
    }

    /**
     * 店铺认证
     * @param storeAuth 店铺认证
     */
    public void setStoreAuth(Byte storeAuth) {
        this.storeAuth = storeAuth;
    }

    /**
     * 店主认证
     * @return name_auth 店主认证
     */
    public Byte getNameAuth() {
        return nameAuth;
    }

    /**
     * 店主认证
     * @param nameAuth 店主认证
     */
    public void setNameAuth(Byte nameAuth) {
        this.nameAuth = nameAuth;
    }

    /**
     * 店铺等级
     * @return grade_id 店铺等级
     */
    public Integer getGradeId() {
        return gradeId;
    }

    /**
     * 店铺等级
     * @param gradeId 店铺等级
     */
    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * 会员id
     * @return member_id 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 会员名称
     * @return member_name 会员名称
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 会员名称
     * @param memberName 会员名称
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 店主卖家用户名
     * @return seller_name 店主卖家用户名
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * 店主卖家用户名
     * @param sellerName 店主卖家用户名
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * 身份证
     * @return store_owner_card 身份证
     */
    public String getStoreOwnerCard() {
        return storeOwnerCard;
    }

    /**
     * 身份证
     * @param storeOwnerCard 身份证
     */
    public void setStoreOwnerCard(String storeOwnerCard) {
        this.storeOwnerCard = storeOwnerCard == null ? null : storeOwnerCard.trim();
    }

    /**
     * 店铺分类
     * @return sc_id 店铺分类
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * 店铺分类
     * @param scId 店铺分类
     */
    public void setScId(Integer scId) {
        this.scId = scId;
    }

    /**
     * 店铺公司名称
     * @return store_company_name 店铺公司名称
     */
    public String getStoreCompanyName() {
        return storeCompanyName;
    }

    /**
     * 店铺公司名称
     * @param storeCompanyName 店铺公司名称
     */
    public void setStoreCompanyName(String storeCompanyName) {
        this.storeCompanyName = storeCompanyName == null ? null : storeCompanyName.trim();
    }

    /**
     * 地区id
     * @return area_id 地区id
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 地区id
     * @param areaId 地区id
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 地区内容，冗余数据
     * @return area_info 地区内容，冗余数据
     */
    public String getAreaInfo() {
        return areaInfo;
    }

    /**
     * 地区内容，冗余数据
     * @param areaInfo 地区内容，冗余数据
     */
    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    /**
     * 详细地区
     * @return store_address 详细地区
     */
    public String getStoreAddress() {
        return storeAddress;
    }

    /**
     * 详细地区
     * @param storeAddress 详细地区
     */
    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    /**
     * 邮政编码
     * @return store_zip 邮政编码
     */
    public String getStoreZip() {
        return storeZip;
    }

    /**
     * 邮政编码
     * @param storeZip 邮政编码
     */
    public void setStoreZip(String storeZip) {
        this.storeZip = storeZip == null ? null : storeZip.trim();
    }

    /**
     * 电话号码
     * @return store_tel 电话号码
     */
    public String getStoreTel() {
        return storeTel;
    }

    /**
     * 电话号码
     * @param storeTel 电话号码
     */
    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel == null ? null : storeTel.trim();
    }

    /**
     * 证件上传
     * @return store_image 证件上传
     */
    public String getStoreImage() {
        return storeImage;
    }

    /**
     * 证件上传
     * @param storeImage 证件上传
     */
    public void setStoreImage(String storeImage) {
        this.storeImage = storeImage == null ? null : storeImage.trim();
    }

    /**
     * 执照上传
     * @return store_image1 执照上传
     */
    public String getStoreImage1() {
        return storeImage1;
    }

    /**
     * 执照上传
     * @param storeImage1 执照上传
     */
    public void setStoreImage1(String storeImage1) {
        this.storeImage1 = storeImage1 == null ? null : storeImage1.trim();
    }

    /**
     * 店铺状态，0关闭，1开启，2审核中
     * @return store_state 店铺状态，0关闭，1开启，2审核中
     */
    public Byte getStoreState() {
        return storeState;
    }

    /**
     * 店铺状态，0关闭，1开启，2审核中
     * @param storeState 店铺状态，0关闭，1开启，2审核中
     */
    public void setStoreState(Byte storeState) {
        this.storeState = storeState;
    }

    /**
     * 店铺关闭原因
     * @return store_close_info 店铺关闭原因
     */
    public String getStoreCloseInfo() {
        return storeCloseInfo;
    }

    /**
     * 店铺关闭原因
     * @param storeCloseInfo 店铺关闭原因
     */
    public void setStoreCloseInfo(String storeCloseInfo) {
        this.storeCloseInfo = storeCloseInfo == null ? null : storeCloseInfo.trim();
    }

    /**
     * 店铺排序
     * @return store_sort 店铺排序
     */
    public Integer getStoreSort() {
        return storeSort;
    }

    /**
     * 店铺排序
     * @param storeSort 店铺排序
     */
    public void setStoreSort(Integer storeSort) {
        this.storeSort = storeSort;
    }

    /**
     * 店铺时间
     * @return store_time 店铺时间
     */
    public String getStoreTime() {
        return storeTime;
    }

    /**
     * 店铺时间
     * @param storeTime 店铺时间
     */
    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime == null ? null : storeTime.trim();
    }

    /**
     * 店铺关闭时间
     * @return store_end_time 店铺关闭时间
     */
    public String getStoreEndTime() {
        return storeEndTime;
    }

    /**
     * 店铺关闭时间
     * @param storeEndTime 店铺关闭时间
     */
    public void setStoreEndTime(String storeEndTime) {
        this.storeEndTime = storeEndTime == null ? null : storeEndTime.trim();
    }

    /**
     * 店铺logo
     * @return store_label 店铺logo
     */
    public String getStoreLabel() {
        return storeLabel;
    }

    /**
     * 店铺logo
     * @param storeLabel 店铺logo
     */
    public void setStoreLabel(String storeLabel) {
        this.storeLabel = storeLabel == null ? null : storeLabel.trim();
    }

    /**
     * 店铺横幅
     * @return store_banner 店铺横幅
     */
    public String getStoreBanner() {
        return storeBanner;
    }

    /**
     * 店铺横幅
     * @param storeBanner 店铺横幅
     */
    public void setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner == null ? null : storeBanner.trim();
    }

    /**
     * 店铺seo关键字
     * @return store_keywords 店铺seo关键字
     */
    public String getStoreKeywords() {
        return storeKeywords;
    }

    /**
     * 店铺seo关键字
     * @param storeKeywords 店铺seo关键字
     */
    public void setStoreKeywords(String storeKeywords) {
        this.storeKeywords = storeKeywords == null ? null : storeKeywords.trim();
    }

    /**
     * 店铺seo描述
     * @return store_description 店铺seo描述
     */
    public String getStoreDescription() {
        return storeDescription;
    }

    /**
     * 店铺seo描述
     * @param storeDescription 店铺seo描述
     */
    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription == null ? null : storeDescription.trim();
    }

    /**
     * QQ
     * @return store_qq QQ
     */
    public String getStoreQq() {
        return storeQq;
    }

    /**
     * QQ
     * @param storeQq QQ
     */
    public void setStoreQq(String storeQq) {
        this.storeQq = storeQq == null ? null : storeQq.trim();
    }

    /**
     * 阿里旺旺
     * @return store_ww 阿里旺旺
     */
    public String getStoreWw() {
        return storeWw;
    }

    /**
     * 阿里旺旺
     * @param storeWw 阿里旺旺
     */
    public void setStoreWw(String storeWw) {
        this.storeWw = storeWw == null ? null : storeWw.trim();
    }

    /**
     * 店铺二级域名
     * @return store_domain 店铺二级域名
     */
    public String getStoreDomain() {
        return storeDomain;
    }

    /**
     * 店铺二级域名
     * @param storeDomain 店铺二级域名
     */
    public void setStoreDomain(String storeDomain) {
        this.storeDomain = storeDomain == null ? null : storeDomain.trim();
    }

    /**
     * 二级域名修改次数
     * @return store_domain_times 二级域名修改次数
     */
    public Byte getStoreDomainTimes() {
        return storeDomainTimes;
    }

    /**
     * 二级域名修改次数
     * @param storeDomainTimes 二级域名修改次数
     */
    public void setStoreDomainTimes(Byte storeDomainTimes) {
        this.storeDomainTimes = storeDomainTimes;
    }

    /**
     * 推荐，0为否，1为是，默认为0
     * @return store_recommend 推荐，0为否，1为是，默认为0
     */
    public Byte getStoreRecommend() {
        return storeRecommend;
    }

    /**
     * 推荐，0为否，1为是，默认为0
     * @param storeRecommend 推荐，0为否，1为是，默认为0
     */
    public void setStoreRecommend(Byte storeRecommend) {
        this.storeRecommend = storeRecommend;
    }

    /**
     * 店铺当前主题
     * @return store_theme 店铺当前主题
     */
    public String getStoreTheme() {
        return storeTheme;
    }

    /**
     * 店铺当前主题
     * @param storeTheme 店铺当前主题
     */
    public void setStoreTheme(String storeTheme) {
        this.storeTheme = storeTheme == null ? null : storeTheme.trim();
    }

    /**
     * 店铺信用
     * @return store_credit 店铺信用
     */
    public Integer getStoreCredit() {
        return storeCredit;
    }

    /**
     * 店铺信用
     * @param storeCredit 店铺信用
     */
    public void setStoreCredit(Integer storeCredit) {
        this.storeCredit = storeCredit;
    }

    /**
     * 店铺好评率
     * @return praise_rate 店铺好评率
     */
    public Float getPraiseRate() {
        return praiseRate;
    }

    /**
     * 店铺好评率
     * @param praiseRate 店铺好评率
     */
    public void setPraiseRate(Float praiseRate) {
        this.praiseRate = praiseRate;
    }

    /**
     * 描述相符度分数
     * @return store_desccredit 描述相符度分数
     */
    public Float getStoreDesccredit() {
        return storeDesccredit;
    }

    /**
     * 描述相符度分数
     * @param storeDesccredit 描述相符度分数
     */
    public void setStoreDesccredit(Float storeDesccredit) {
        this.storeDesccredit = storeDesccredit;
    }

    /**
     * 服务态度分数
     * @return store_servicecredit 服务态度分数
     */
    public Float getStoreServicecredit() {
        return storeServicecredit;
    }

    /**
     * 服务态度分数
     * @param storeServicecredit 服务态度分数
     */
    public void setStoreServicecredit(Float storeServicecredit) {
        this.storeServicecredit = storeServicecredit;
    }

    /**
     * 发货速度分数
     * @return store_deliverycredit 发货速度分数
     */
    public Float getStoreDeliverycredit() {
        return storeDeliverycredit;
    }

    /**
     * 发货速度分数
     * @param storeDeliverycredit 发货速度分数
     */
    public void setStoreDeliverycredit(Float storeDeliverycredit) {
        this.storeDeliverycredit = storeDeliverycredit;
    }

    /**
     * 店铺收藏数量
     * @return store_collect 店铺收藏数量
     */
    public Integer getStoreCollect() {
        return storeCollect;
    }

    /**
     * 店铺收藏数量
     * @param storeCollect 店铺收藏数量
     */
    public void setStoreCollect(Integer storeCollect) {
        this.storeCollect = storeCollect;
    }

    /**
     * 店铺印章
     * @return store_stamp 店铺印章
     */
    public String getStoreStamp() {
        return storeStamp;
    }

    /**
     * 店铺印章
     * @param storeStamp 店铺印章
     */
    public void setStoreStamp(String storeStamp) {
        this.storeStamp = storeStamp == null ? null : storeStamp.trim();
    }

    /**
     * 打印订单页面下方说明文字
     * @return store_printdesc 打印订单页面下方说明文字
     */
    public String getStorePrintdesc() {
        return storePrintdesc;
    }

    /**
     * 打印订单页面下方说明文字
     * @param storePrintdesc 打印订单页面下方说明文字
     */
    public void setStorePrintdesc(String storePrintdesc) {
        this.storePrintdesc = storePrintdesc == null ? null : storePrintdesc.trim();
    }

    /**
     * 店铺销量
     * @return store_sales 店铺销量
     */
    public Integer getStoreSales() {
        return storeSales;
    }

    /**
     * 店铺销量
     * @param storeSales 店铺销量
     */
    public void setStoreSales(Integer storeSales) {
        this.storeSales = storeSales;
    }

    /**
     * 工作时间
     * @return store_workingtime 工作时间
     */
    public String getStoreWorkingtime() {
        return storeWorkingtime;
    }

    /**
     * 工作时间
     * @param storeWorkingtime 工作时间
     */
    public void setStoreWorkingtime(String storeWorkingtime) {
        this.storeWorkingtime = storeWorkingtime == null ? null : storeWorkingtime.trim();
    }

    /**
     * 超出该金额免运费，大于0才表示该值有效
     * @return store_free_price 超出该金额免运费，大于0才表示该值有效
     */
    public BigDecimal getStoreFreePrice() {
        return storeFreePrice;
    }

    /**
     * 超出该金额免运费，大于0才表示该值有效
     * @param storeFreePrice 超出该金额免运费，大于0才表示该值有效
     */
    public void setStoreFreePrice(BigDecimal storeFreePrice) {
        this.storeFreePrice = storeFreePrice;
    }

    /**
     * 库存警报
     * @return store_storage_alarm 库存警报
     */
    public Byte getStoreStorageAlarm() {
        return storeStorageAlarm;
    }

    /**
     * 库存警报
     * @param storeStorageAlarm 库存警报
     */
    public void setStoreStorageAlarm(Byte storeStorageAlarm) {
        this.storeStorageAlarm = storeStorageAlarm;
    }
}