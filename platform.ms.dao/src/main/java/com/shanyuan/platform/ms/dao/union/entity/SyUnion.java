package com.shanyuan.platform.ms.dao.union.entity;

/**
 * 描述:sy_union表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-31
 */
public class SyUnion {
    /**
     * 主键
     */
    private Integer unionId;

    /**
     * 联盟名称
     */
    private String unionName;

    /**
     * 产品来源
     */
    private String unionChannel;

    /**
     * 联盟可用状态图片
     */
    private String unionImage;

    /**
     * 联盟不可用状态图片
     */
    private String unionDisImage;

    /**
     * 联盟类别 1 企业联盟 2 政府联盟
     */
    private Byte unionType;

    /**
     * 显示状态 1 显示 2 不显示
     */
    private Byte unionHidden;

    /**
     * 可用状态 1 可用 2 不可用
     */
    private Byte unionFree;

    /**
     * 排序
     */
    private Integer unionSort;

    /**
     * 是否删除：1正常，2删除
     */
    private Byte unionDel;

    /**
     * 试运营状态:1试运营,2正式运营
     */
    private Byte unionOperation;

    /**
     * 大爱超市banner
     */
    private String bannerUrl;

    /**
     * 是否可注册：1可注册,2即将开发,3隐藏注册入口
     */
    private Byte registable;

    /**
     * 联盟描述
     */
    private String unionDesc;

    /**
     * 联盟部门统计层级（默认显示2层）
     */
    private Byte unionCircleLevel;

    /**
     * 联盟详情页banner
     */
    private String unionBanner;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 是否参与排行榜(1、参与 2、不参与)
     */
    private Byte unionTopListFlag;

    /**
     * 联盟介绍
     */
    private String unionIntroduction;

    /**
     * 主键
     * @return union_id 主键
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 主键
     * @param unionId 主键
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 联盟名称
     * @return union_name 联盟名称
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 联盟名称
     * @param unionName 联盟名称
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 产品来源
     * @return union_channel 产品来源
     */
    public String getUnionChannel() {
        return unionChannel;
    }

    /**
     * 产品来源
     * @param unionChannel 产品来源
     */
    public void setUnionChannel(String unionChannel) {
        this.unionChannel = unionChannel == null ? null : unionChannel.trim();
    }

    /**
     * 联盟可用状态图片
     * @return union_image 联盟可用状态图片
     */
    public String getUnionImage() {
        return unionImage;
    }

    /**
     * 联盟可用状态图片
     * @param unionImage 联盟可用状态图片
     */
    public void setUnionImage(String unionImage) {
        this.unionImage = unionImage == null ? null : unionImage.trim();
    }

    /**
     * 联盟不可用状态图片
     * @return union_dis_image 联盟不可用状态图片
     */
    public String getUnionDisImage() {
        return unionDisImage;
    }

    /**
     * 联盟不可用状态图片
     * @param unionDisImage 联盟不可用状态图片
     */
    public void setUnionDisImage(String unionDisImage) {
        this.unionDisImage = unionDisImage == null ? null : unionDisImage.trim();
    }

    /**
     * 联盟类别 1 企业联盟 2 政府联盟
     * @return union_type 联盟类别 1 企业联盟 2 政府联盟
     */
    public Byte getUnionType() {
        return unionType;
    }

    /**
     * 联盟类别 1 企业联盟 2 政府联盟
     * @param unionType 联盟类别 1 企业联盟 2 政府联盟
     */
    public void setUnionType(Byte unionType) {
        this.unionType = unionType;
    }

    /**
     * 显示状态 1 显示 2 不显示
     * @return union_hidden 显示状态 1 显示 2 不显示
     */
    public Byte getUnionHidden() {
        return unionHidden;
    }

    /**
     * 显示状态 1 显示 2 不显示
     * @param unionHidden 显示状态 1 显示 2 不显示
     */
    public void setUnionHidden(Byte unionHidden) {
        this.unionHidden = unionHidden;
    }

    /**
     * 可用状态 1 可用 2 不可用
     * @return union_free 可用状态 1 可用 2 不可用
     */
    public Byte getUnionFree() {
        return unionFree;
    }

    /**
     * 可用状态 1 可用 2 不可用
     * @param unionFree 可用状态 1 可用 2 不可用
     */
    public void setUnionFree(Byte unionFree) {
        this.unionFree = unionFree;
    }

    /**
     * 排序
     * @return union_sort 排序
     */
    public Integer getUnionSort() {
        return unionSort;
    }

    /**
     * 排序
     * @param unionSort 排序
     */
    public void setUnionSort(Integer unionSort) {
        this.unionSort = unionSort;
    }

    /**
     * 是否删除：1正常，2删除
     * @return union_del 是否删除：1正常，2删除
     */
    public Byte getUnionDel() {
        return unionDel;
    }

    /**
     * 是否删除：1正常，2删除
     * @param unionDel 是否删除：1正常，2删除
     */
    public void setUnionDel(Byte unionDel) {
        this.unionDel = unionDel;
    }

    /**
     * 试运营状态:1试运营,2正式运营
     * @return union_operation 试运营状态:1试运营,2正式运营
     */
    public Byte getUnionOperation() {
        return unionOperation;
    }

    /**
     * 试运营状态:1试运营,2正式运营
     * @param unionOperation 试运营状态:1试运营,2正式运营
     */
    public void setUnionOperation(Byte unionOperation) {
        this.unionOperation = unionOperation;
    }

    /**
     * 大爱超市banner
     * @return banner_url 大爱超市banner
     */
    public String getBannerUrl() {
        return bannerUrl;
    }

    /**
     * 大爱超市banner
     * @param bannerUrl 大爱超市banner
     */
    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    /**
     * 是否可注册：1可注册,2即将开发,3隐藏注册入口
     * @return registable 是否可注册：1可注册,2即将开发,3隐藏注册入口
     */
    public Byte getRegistable() {
        return registable;
    }

    /**
     * 是否可注册：1可注册,2即将开发,3隐藏注册入口
     * @param registable 是否可注册：1可注册,2即将开发,3隐藏注册入口
     */
    public void setRegistable(Byte registable) {
        this.registable = registable;
    }

    /**
     * 联盟描述
     * @return union_desc 联盟描述
     */
    public String getUnionDesc() {
        return unionDesc;
    }

    /**
     * 联盟描述
     * @param unionDesc 联盟描述
     */
    public void setUnionDesc(String unionDesc) {
        this.unionDesc = unionDesc == null ? null : unionDesc.trim();
    }

    /**
     * 联盟部门统计层级（默认显示2层）
     * @return union_circle_level 联盟部门统计层级（默认显示2层）
     */
    public Byte getUnionCircleLevel() {
        return unionCircleLevel;
    }

    /**
     * 联盟部门统计层级（默认显示2层）
     * @param unionCircleLevel 联盟部门统计层级（默认显示2层）
     */
    public void setUnionCircleLevel(Byte unionCircleLevel) {
        this.unionCircleLevel = unionCircleLevel;
    }

    /**
     * 联盟详情页banner
     * @return union_banner 联盟详情页banner
     */
    public String getUnionBanner() {
        return unionBanner;
    }

    /**
     * 联盟详情页banner
     * @param unionBanner 联盟详情页banner
     */
    public void setUnionBanner(String unionBanner) {
        this.unionBanner = unionBanner == null ? null : unionBanner.trim();
    }

    /**
     * 添加时间
     * @return add_time 添加时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * 是否参与排行榜(1、参与 2、不参与)
     * @return union_top_list_flag 是否参与排行榜(1、参与 2、不参与)
     */
    public Byte getUnionTopListFlag() {
        return unionTopListFlag;
    }

    /**
     * 是否参与排行榜(1、参与 2、不参与)
     * @param unionTopListFlag 是否参与排行榜(1、参与 2、不参与)
     */
    public void setUnionTopListFlag(Byte unionTopListFlag) {
        this.unionTopListFlag = unionTopListFlag;
    }

    /**
     * 联盟介绍
     * @return union_introduction 联盟介绍
     */
    public String getUnionIntroduction() {
        return unionIntroduction;
    }

    /**
     * 联盟介绍
     * @param unionIntroduction 联盟介绍
     */
    public void setUnionIntroduction(String unionIntroduction) {
        this.unionIntroduction = unionIntroduction == null ? null : unionIntroduction.trim();
    }
}