package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_guide_show_state表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-28
 */
public class SyGuideShowState {
    /**
     * 主键id
     */
    private Integer recId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 代理人去帮扶  0未显示     1已显示
     */
    private Byte bocSupport;

    /**
     * 代理人去首页查看贫困户  0未显示     1已显示
     */
    private Byte bocSupportIndex;

    /**
     * 首页引导进入贫困户产品列表  0未显示     1已显示
     */
    private Byte bocIndex;

    /**
     * 中行排行榜   0未显示     1已显示
     */
    private Byte bocRank;

    /**
     * 贫困户发布的商品列表   0未显示     1已显示
     */
    private Byte bocPoorGoods;

    /**
     * 其他用户发布的商品列表   0未显示     1已显示
     */
    private Byte bocOtherGoods;

    /**
     * 查看购物车产品   0未显示     1已显示
     */
    private Byte bocCart;

    /**
     * 提交订单物品积分提示   0未显示     1已显示
     */
    private Byte bocBuy;

    /**
     * 代理人我的  0未显示     1已显示
     */
    private Byte agentHome;

    /**
     * 代理人代理的贫困户列表  0未显示     1已显示
     */
    private Byte agentPoorList;

    /**
     * 代理人替贫困户上新产品   0未显示     1已显示
     */
    private Byte agentPoorAddGoods;

    /**
     * 贫困户我的  0未显示     1已显示
     */
    private Byte poorHome;

    /**
     * 贫困户产品上新  0未显示     1已显示
     */
    private Byte poorGoodsAdd;

    /**
     * 管理员管理页面   0未显示     1已显示
     */
    private Byte managerAdd;

    /**
     * 用户证书显示, 0不显示, 1显示
     */
    private Byte memberCert;

    /**
     * 是否同意用户协议 0 不同意, 1同意了
     */
    private Byte userAgreement;

    /**
     * 主键id
     * @return rec_id 主键id
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键id
     * @param recId 主键id
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
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
     * 代理人去帮扶  0未显示     1已显示
     * @return boc_support 代理人去帮扶  0未显示     1已显示
     */
    public Byte getBocSupport() {
        return bocSupport;
    }

    /**
     * 代理人去帮扶  0未显示     1已显示
     * @param bocSupport 代理人去帮扶  0未显示     1已显示
     */
    public void setBocSupport(Byte bocSupport) {
        this.bocSupport = bocSupport;
    }

    /**
     * 代理人去首页查看贫困户  0未显示     1已显示
     * @return boc_support_index 代理人去首页查看贫困户  0未显示     1已显示
     */
    public Byte getBocSupportIndex() {
        return bocSupportIndex;
    }

    /**
     * 代理人去首页查看贫困户  0未显示     1已显示
     * @param bocSupportIndex 代理人去首页查看贫困户  0未显示     1已显示
     */
    public void setBocSupportIndex(Byte bocSupportIndex) {
        this.bocSupportIndex = bocSupportIndex;
    }

    /**
     * 首页引导进入贫困户产品列表  0未显示     1已显示
     * @return boc_index 首页引导进入贫困户产品列表  0未显示     1已显示
     */
    public Byte getBocIndex() {
        return bocIndex;
    }

    /**
     * 首页引导进入贫困户产品列表  0未显示     1已显示
     * @param bocIndex 首页引导进入贫困户产品列表  0未显示     1已显示
     */
    public void setBocIndex(Byte bocIndex) {
        this.bocIndex = bocIndex;
    }

    /**
     * 中行排行榜   0未显示     1已显示
     * @return boc_rank 中行排行榜   0未显示     1已显示
     */
    public Byte getBocRank() {
        return bocRank;
    }

    /**
     * 中行排行榜   0未显示     1已显示
     * @param bocRank 中行排行榜   0未显示     1已显示
     */
    public void setBocRank(Byte bocRank) {
        this.bocRank = bocRank;
    }

    /**
     * 贫困户发布的商品列表   0未显示     1已显示
     * @return boc_poor_goods 贫困户发布的商品列表   0未显示     1已显示
     */
    public Byte getBocPoorGoods() {
        return bocPoorGoods;
    }

    /**
     * 贫困户发布的商品列表   0未显示     1已显示
     * @param bocPoorGoods 贫困户发布的商品列表   0未显示     1已显示
     */
    public void setBocPoorGoods(Byte bocPoorGoods) {
        this.bocPoorGoods = bocPoorGoods;
    }

    /**
     * 其他用户发布的商品列表   0未显示     1已显示
     * @return boc_other_goods 其他用户发布的商品列表   0未显示     1已显示
     */
    public Byte getBocOtherGoods() {
        return bocOtherGoods;
    }

    /**
     * 其他用户发布的商品列表   0未显示     1已显示
     * @param bocOtherGoods 其他用户发布的商品列表   0未显示     1已显示
     */
    public void setBocOtherGoods(Byte bocOtherGoods) {
        this.bocOtherGoods = bocOtherGoods;
    }

    /**
     * 查看购物车产品   0未显示     1已显示
     * @return boc_cart 查看购物车产品   0未显示     1已显示
     */
    public Byte getBocCart() {
        return bocCart;
    }

    /**
     * 查看购物车产品   0未显示     1已显示
     * @param bocCart 查看购物车产品   0未显示     1已显示
     */
    public void setBocCart(Byte bocCart) {
        this.bocCart = bocCart;
    }

    /**
     * 提交订单物品积分提示   0未显示     1已显示
     * @return boc_buy 提交订单物品积分提示   0未显示     1已显示
     */
    public Byte getBocBuy() {
        return bocBuy;
    }

    /**
     * 提交订单物品积分提示   0未显示     1已显示
     * @param bocBuy 提交订单物品积分提示   0未显示     1已显示
     */
    public void setBocBuy(Byte bocBuy) {
        this.bocBuy = bocBuy;
    }

    /**
     * 代理人我的  0未显示     1已显示
     * @return agent_home 代理人我的  0未显示     1已显示
     */
    public Byte getAgentHome() {
        return agentHome;
    }

    /**
     * 代理人我的  0未显示     1已显示
     * @param agentHome 代理人我的  0未显示     1已显示
     */
    public void setAgentHome(Byte agentHome) {
        this.agentHome = agentHome;
    }

    /**
     * 代理人代理的贫困户列表  0未显示     1已显示
     * @return agent_poor_list 代理人代理的贫困户列表  0未显示     1已显示
     */
    public Byte getAgentPoorList() {
        return agentPoorList;
    }

    /**
     * 代理人代理的贫困户列表  0未显示     1已显示
     * @param agentPoorList 代理人代理的贫困户列表  0未显示     1已显示
     */
    public void setAgentPoorList(Byte agentPoorList) {
        this.agentPoorList = agentPoorList;
    }

    /**
     * 代理人替贫困户上新产品   0未显示     1已显示
     * @return agent_poor_add_goods 代理人替贫困户上新产品   0未显示     1已显示
     */
    public Byte getAgentPoorAddGoods() {
        return agentPoorAddGoods;
    }

    /**
     * 代理人替贫困户上新产品   0未显示     1已显示
     * @param agentPoorAddGoods 代理人替贫困户上新产品   0未显示     1已显示
     */
    public void setAgentPoorAddGoods(Byte agentPoorAddGoods) {
        this.agentPoorAddGoods = agentPoorAddGoods;
    }

    /**
     * 贫困户我的  0未显示     1已显示
     * @return poor_home 贫困户我的  0未显示     1已显示
     */
    public Byte getPoorHome() {
        return poorHome;
    }

    /**
     * 贫困户我的  0未显示     1已显示
     * @param poorHome 贫困户我的  0未显示     1已显示
     */
    public void setPoorHome(Byte poorHome) {
        this.poorHome = poorHome;
    }

    /**
     * 贫困户产品上新  0未显示     1已显示
     * @return poor_goods_add 贫困户产品上新  0未显示     1已显示
     */
    public Byte getPoorGoodsAdd() {
        return poorGoodsAdd;
    }

    /**
     * 贫困户产品上新  0未显示     1已显示
     * @param poorGoodsAdd 贫困户产品上新  0未显示     1已显示
     */
    public void setPoorGoodsAdd(Byte poorGoodsAdd) {
        this.poorGoodsAdd = poorGoodsAdd;
    }

    /**
     * 管理员管理页面   0未显示     1已显示
     * @return manager_add 管理员管理页面   0未显示     1已显示
     */
    public Byte getManagerAdd() {
        return managerAdd;
    }

    /**
     * 管理员管理页面   0未显示     1已显示
     * @param managerAdd 管理员管理页面   0未显示     1已显示
     */
    public void setManagerAdd(Byte managerAdd) {
        this.managerAdd = managerAdd;
    }

    /**
     * 用户证书显示, 0不显示, 1显示
     * @return member_cert 用户证书显示, 0不显示, 1显示
     */
    public Byte getMemberCert() {
        return memberCert;
    }

    /**
     * 用户证书显示, 0不显示, 1显示
     * @param memberCert 用户证书显示, 0不显示, 1显示
     */
    public void setMemberCert(Byte memberCert) {
        this.memberCert = memberCert;
    }

    /**
     * 是否同意用户协议 0 不同意, 1同意了
     * @return user_agreement 是否同意用户协议 0 不同意, 1同意了
     */
    public Byte getUserAgreement() {
        return userAgreement;
    }

    /**
     * 是否同意用户协议 0 不同意, 1同意了
     * @param userAgreement 是否同意用户协议 0 不同意, 1同意了
     */
    public void setUserAgreement(Byte userAgreement) {
        this.userAgreement = userAgreement;
    }
}