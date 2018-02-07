/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/9 11:22:00                           */
/*==============================================================*/


drop table if exists om_goods_eval_reply;

drop table if exists om_goods_evaluate;

drop table if exists om_order;

drop table if exists om_order_coupon;

drop table if exists om_order_evaluate;

drop table if exists om_order_goods;

drop table if exists om_order_logist;

drop table if exists om_order_payment;

drop table if exists om_order_settlement;

drop table if exists om_order_voucher;

/*==============================================================*/
/* User: sy                                                     */
/*==============================================================*/
create user sy;

/*==============================================================*/
/* Table: om_goods_eval_reply                                   */
/*==============================================================*/
create table om_goods_eval_reply
(
   rec_id               int not null comment '记录id',
   eval_id              int not null comment '评论id',
   reply_member_id      int not null comment '回复人id',
   reply_member_name    varchar(50) comment '回复人名称',
   reply_member_image   varchar(50) comment '回复人头像',
   reply_time           datetime not null default CURRENT_TIMESTAMP comment '回复时间',
   reply_content        varchar(500) not null comment '回复内容',
   reply_range          int comment '回复内容
            
            制定memberid 可以查看
            空代表所有人都可以查看',
   eval_member_id       int not null comment '被回复人id',
   eval_member_name     varchar(50) comment '被回复人名称',
   eval_member_image    varchar(50) comment '被回复人头像',
   is_delete            tinyint(1) not null default 0 comment '是否删除',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间',
   primary key (rec_id)
);

alter table om_goods_eval_reply comment '商品评价回复表';

/*==============================================================*/
/* Table: om_goods_evaluate                                     */
/*==============================================================*/
create table om_goods_evaluate
(
   rec_id               int not null comment '评价id',
   order_id             varchar(32) not null comment '评价id',
   main_id              varchar(32) not null comment '订单主ID',
   eval_time            datetime not null default CURRENT_TIMESTAMP comment '评价时间',
   goods_common_id      int(11) not null comment '商品id',
   goods_id             national varchar(100) not null comment 'skuid',
   ins_id               int(11) not null comment '买家编号',
   goods_score          national varchar(100) not null comment '买家名称',
   member_id            int not null comment '评价者id',
   member_image         varchar(50) comment '评价者头像',
   member_name          varchar(50) comment '评价者名称',
   is_anonymous         tinyint(1) not null default 5 comment '是否匿名
            0不匿名
            1 匿名',
   eval_conent          varchar(500) not null default '5' comment '商品评价内容',
   eval_status          tinyint(1) not null default 5 comment '是否显示评价
            0：不显示
            1：显示
            ',
   publisher_id         int(11) not null default 0 comment '发布者id',
   eval_image1          varchar(100) comment '晒单图片1',
   eval_image2          varchar(100) comment '晒单图片2',
   eval_image3          varchar(100) comment '晒单图片1',
   eval_reply_status    tinyint(1) comment '回复状态
            0 未回复
            1 已经回复',
   eval_type            tinyint(1) not null default 0 comment '评价类型0:系统自动评价1:手动评价',
   update_time          datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间',
   primary key (rec_id)
);

alter table om_goods_evaluate comment '订单商品评价';

/*==============================================================*/
/* Table: om_order                                              */
/*==============================================================*/
create table om_order
(
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) not null comment '主订单id',
   order_code           bigint(20) not null comment '订单code',
   member_id            int not null comment '会员id',
   store_id             int not null comment '店铺id',
   seller_id            int not null comment '销售者id',
   agent_id             int comment '助理人id',
   poor_id              int comment '贫苦户id',
   ope_center_id        int comment '集采运营中心id',
   order_type           tinyint(2) not null default 10 comment '订单类型
            10：大爱超市；
            20，善源商场；
            31：个人集采；
            32：单位集采',
   order_channel         varchar(10) not null default 'app' comment '订单渠道信息
            app:公益中国；
            wechar:微信公众号',
   goods_project_type   tinyint(10) not null default 17 comment '商品种类
            17：大爱超市
            24：善源商场
            ',
   order_status         tinyint(2) not null default 10 comment '订单状态
            10:订单提交成功；
            20:订单待处理；
            30:订单处理完成
          
  40:订单成功完成
            50:订单取消
            ',
   order_cancle_reason  varchar(40) comment '订单取消原因',
   pay_type             tinyint(1) not null default 20 comment '支付类型
            10:offline
            20:online
            ',
   pay_center           varchar(10) comment '支付网关
            boc：中银支付
            alipayna:支付宝原生支付
            alipayh5:支付宝wap支付
            wechatna：微信app支付
            wechatmp：微信公众号
            ',
   pay_status           tinyint(1) not null default 10 comment '支付状态
            10:待付款
            19:付款成功
            20:待退款
            29:退款成功
            ',
   order_message        varchar(200) comment '订单留言',
   cust_service_status  tinyint(1) not null default 0 comment '售后单状态
            0:未提交售后信息
            10:提交售后请求
            20:待售后发货
            29:待卖家确认
            30:退货完成
            40:退货拒绝',
   order_all_price      int not null default 0 comment '订单全部费用',
   order_goods_price    int not null default 0 comment '订单商品费用',
   order_logist_price   int not null default 0 comment '订单物流费用',
   order_voucher_price  int not null default 0 comment '订单优惠券费用',
   order_coupon_price   int not null default 0 comment '订单使用扶贫码费用',
   order_used_point     int not null default 0 comment '订单使用积分数',
   order_pay_fee        int not null default 0 comment '订单支付费用',
   order_create_time    datetime not null default CURRENT_TIMESTAMP comment '订单创建时间',
   order_pay_time       datetime comment '订单支付时间',
   order_send_time      datetime comment '订单发货时间',
   order_check_time     datetime comment '订单签收时间',
   order_eva_status     tinyint(1) not null default 0 comment '订单评价状态
            0:未评价
            10:已经评价
            12:超时，默认好评',
   is_delete            tinyint(1) not null default 0 comment '订单删除标志位',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '最近更新时间',
   other_info1          varchar(20) comment '订单冗余字段1',
   other_info2          varchar(100) comment '订单冗余字段2',
   primary key (order_id)
);

alter table om_order comment '订单信息表';

/*==============================================================*/
/* Table: om_order_coupon                                       */
/*==============================================================*/
create table om_order_coupon
(
   rec_id               int not null auto_increment comment '记录id',
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) not null comment '主订单id',
   coupon_id            int not null comment '扶贫码id',
   coupon_code          varchar(20) not null comment '扶贫码code',
   member_id            int not null comment '扶贫码用户id',
   coupon_price         int not null comment '扶贫码使用金额',
   coupon_batch_sn      varchar(20) comment '扶贫码批次号',
   use_time             datetime not null default CURRENT_TIMESTAMP comment '使用时间',
   remark               varchar(50) comment '备注',
   is_delete            tinyint(1) not null default 0 comment '是否删除 0 未删除
            1 删除',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (rec_id)
);

alter table om_order_coupon comment '订单使用扶贫码';

/*==============================================================*/
/* Table: om_order_evaluate                                     */
/*==============================================================*/
create table om_order_evaluate
(
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) not null comment '订单主ID',
   eval_time           datetime not null default CURRENT_TIMESTAMP comment '评价时间',
   store_id             int(11) unsigned not null comment '店铺编号',
   store_name           varchar(100) not null comment '店铺名称',
   member_id            int(11) unsigned not null comment '买家编号',
   member_name          varchar(100) not null comment '买家名称',
   desccredit           tinyint(1) unsigned not null default 5 comment '描述相符评分',
   servicecredit        tinyint(1) unsigned not null default 5 comment '服务态度评分',
   deliverycredit       tinyint(1) unsigned not null default 5 comment '发货速度评分',
   publisher_id         int(11) unsigned not null default 0 comment '发布者id',
   eval_type            tinyint(1) not null default 0 comment '评价类型0:系统自动评价1:手动评价',
   is_delete            tinyint(1) comment '是否删除',
   update_time          datetime comment '修改时间',
   primary key (order_id)
);


/*==============================================================*/
/* Table: om_order_goods                                        */
/*==============================================================*/
create table om_order_goods
(
   ins_id               int not null auto_increment comment '实例id',
   order_id             varchar(32) not null comment '订单id',
   buyer_id             int(11) not null comment '买家id',
   main_id              varchar(32) not null comment '主订单id',
   goods_common_id      int not null comment '商品id',
   goods_id             int not null default 0 comment 'skuid',
   goods_name           varchar(50) not null comment '商品名称',
   goods_point          int default 0 comment '商品需要积分数量',
   goods_price          int not null comment '商品单价',
   goods_num            int not null comment '商品数量',
   goods_image          varchar(100) not null comment '商品图片',
   goods_amount_price   int not null comment '商品总价',
   goods_amount_point   int default 0 comment '商品总需积分数量',
   goods_help_rate      int not null comment '商品捐助比率 除以1000',
   share_id             int comment '分享人id',
   goods_spec           varchar(20) not null comment '商品规格',
   goods_unit           varchar(20) not null comment '商品单位',
   store_discount_fee   int comment '店铺折减金额',
   plat_discount_fee    int comment '平台折减金额',
   purchase_price       int comment '商品采购价',
   remark               varchar(200) comment '商品描述',
   create_time          datetime not null  default CURRENT_TIMESTAMP comment '创建时间',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间',
   primary key (ins_id)
);

alter table om_order_goods comment '订单商品实例';

/*==============================================================*/
/* Table: om_order_logist                                       */
/*==============================================================*/
create table om_order_logist
(
   rec_id               int not null auto_increment comment '记录id',
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) not null comment '主订单id',
   reciver_addr_id      int not null comment '地址id',
   reciver_name         varchar(20) not null comment '收货人姓名',
   reciver_phone        varchar(12) not null comment '收货人手机号',
   reciver_prov_id      int not null comment '收货省份',
   reciver_city_id      int not null comment '收货城市',
   reciver_area_id      int not null comment '收货区县',
   reciver_addr_info    varchar(200) not null comment '收获地址明细',
   deliver_addr_id      int comment '发货地址id',
   deliver_msg          varchar(200) comment '发货备注',
   deliver_time         datetime comment '发货时间',
   shipping_id          varchar(16) comment '配送公司',
   shipping_sn          varchar(32) comment '物流单号',
   remark               varchar(200) comment '备注',
   create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间',
   primary key (rec_id)
);

alter table om_order_logist comment '订单物流信息';

/*==============================================================*/
/* Table: om_order_payment                                      */
/*==============================================================*/
create table om_order_payment
(
   pay_id               varchar(32) not null comment '支付单id',
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) not null comment '主订单id',
   pay_center           varchar(10) not null comment '支付网关
            boc：中银支付
            alipayna:支付宝原生支付
            alipayh5:支付宝wap支付
            wechatna：微信app支付
            wechatmp：微信公众号
            ',
   pay_status           tinyint not null default 10 comment '支付状态
            10:待付款
            19:付款成功
            20:待退款
            29:退款成功
            ',
   pay_fee              int not null comment '支付金额',
   outtrade_id          varchar(32) comment '统一下单id',
   pay_serial           varchar(32) comment '支付流水号',
   pay_req_time         datetime not null comment '支付创建时间',
   pay_req_msg          varchar(500) not null comment '支付请求报文',
   pay_notify_time      datetime comment '支付通知时间',
   pay_notify_msg       varchar(500) comment '支付通知报文',
   pay_check            tinyint comment '支付对账状态
            0:未对账
            1:对账成功',
   refund_serial        varchar(32) comment '退款流水号',
   refund_req_time      datetime comment '退款发起时间',
   refund_req_msg       varchar(500) comment '退款请求报文',
   refund_resp_time     datetime comment '退款应答时间',
   refund_resp_msg      varchar(500) comment '退款应答报文',
   refund_check         tinyint comment '退款对账状态
            0:未对账
            1:对账成功',
   create_time          datetime not null comment '记录创建时间',
   update_time          datetime not null comment '记录更新时间',
   primary key (pay_id)
);

alter table om_order_payment comment '订单支付信息表';

/*==============================================================*/
/* Table: om_order_settlement                                   */
/*==============================================================*/
create table om_order_settlement
(
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) comment '主订单id',
   handing_rate         int comment '支付网关费率 千分位',
   handing_fee          int comment '支付手续费',
   base_fee             int comment '捐赠基数 分',
   send_point_rate      int comment '赠送积分比率',
   send_point           int comment '赠送分数量',
   help_rate            int comment '贫困户帮扶费率 千分位',
   help_fee             int comment '贫困户帮扶金额',
   fund_rate           int comment '公益基金会费率 千分位',
   fund_fee            int comment '公益基金会捐献金额',
   seller_income        int comment '卖家获得费用 f分',
   primary key (order_id)
);

alter table om_order_settlement comment '订单费用结算信息';

/*==============================================================*/
/* Table: om_order_voucher                                      */
/*==============================================================*/
create table om_order_voucher
(
   rec_id               int not null auto_increment comment '记录id',
   order_id             varchar(32) not null comment '订单id',
   main_id              varchar(32) not null comment '主订单id',
   voucher_id           int not null comment '优惠券id',
   voucher_code         varchar(32) not null comment '优惠券编码',
   use_time             datetime not null comment '使用时间',
   voucher_price        int not null default 0 comment '使用金额',
   member_id            int not null comment '拥有者id',
   voucher_tpl_id       int not null comment '代金券模板id',
   remark               varchar(50) comment '备注',
   is_delete            tinyint not null default 0 comment '是否删除',
   update_time          datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (rec_id)
);

alter table om_order_voucher comment '订单优惠券';

