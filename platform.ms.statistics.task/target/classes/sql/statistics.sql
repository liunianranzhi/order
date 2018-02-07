/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.212
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 192.168.1.212
 Source Database       : sy

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 01/17/2018 16:07:11 PM
*/


-- ----------------------------
--  Table structure for `statistics_assist_base_data`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_assist_base_data`;
CREATE TABLE `statistics_assist_base_data` (
  `rec_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `c_time` int(11) NOT NULL COMMENT '统计时间',
  `union_id` int(11) NOT NULL COMMENT '联盟id',
  `union_name` varchar(20) NOT NULL COMMENT '联盟名称',
  `channel` varchar(20) NOT NULL COMMENT '联盟标识',
  `employee_deal_amount` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '员工成交金额',
  `yk_deal_amount` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '益客消费金额',
  `user_added_num` bigint(12) NOT NULL DEFAULT '0' COMMENT '新增用户数',
  `user_total_num` bigint(12) NOT NULL DEFAULT '0' COMMENT '公益人士总数',
  `invite_yk_num` bigint(12) NOT NULL DEFAULT '0' COMMENT '邀请益客数',
  `reg_employee_num` bigint(12) NOT NULL DEFAULT '0' COMMENT '注册员工数',
  PRIMARY KEY (`rec_id`),
  KEY `c_time` (`c_time`),
  KEY `union_id` (`union_id`),
  KEY `channel` (`channel`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='帮扶侧统计表';

-- ----------------------------
--  Table structure for `statistics_order_base_data`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_order_base_data`;
CREATE TABLE `statistics_order_base_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` int(11) NOT NULL COMMENT '订单id',
  `finished_time` int(10) NOT NULL COMMENT '完成时间',
  `order_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '订单总金额',
  `goods_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '商品总金额',
  `pd_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '预存款支付金额',
  `order_from` enum('1','2') NOT NULL DEFAULT '1' COMMENT '订单来源1 WEB 2 mobile',
  `circle_id_deep_1` int(10) NOT NULL DEFAULT '0' COMMENT '买家部门id',
  `circle_id_deep_2` int(10) NOT NULL DEFAULT '0',
  `circle_id_deep_3` int(10) NOT NULL DEFAULT '0',
  `circle_id_deep_4` int(10) NOT NULL DEFAULT '0',
  `circle_id_deep_5` int(10) NOT NULL DEFAULT '0',
  `circle_id_deep_6` int(10) NOT NULL DEFAULT '0',
  `circle_id_deep_7` int(10) NOT NULL DEFAULT '0',
  `circle_name` varchar(100) NOT NULL DEFAULT '' COMMENT '买家部门名称，拼接方式为circle1,circle2,circle3...',
  `s_union_id` int(10) NOT NULL DEFAULT '0' COMMENT '卖家联盟id',
  `s_union_name` varchar(20) NOT NULL DEFAULT '' COMMENT '卖家联盟名称',
  `s_channel` varchar(20) NOT NULL DEFAULT '' COMMENT '卖家联盟',
  `s_circle_id_deep_1` int(10) NOT NULL DEFAULT '0' COMMENT '卖家部门id',
  `s_circle_id_deep_2` int(10) NOT NULL DEFAULT '0',
  `s_circle_id_deep_3` int(10) NOT NULL DEFAULT '0',
  `s_circle_id_deep_4` int(10) NOT NULL DEFAULT '0',
  `s_circle_id_deep_5` int(10) NOT NULL DEFAULT '0',
  `s_circle_id_deep_6` int(10) NOT NULL DEFAULT '0',
  `s_circle_id_deep_7` int(10) NOT NULL DEFAULT '0',
  `s_circle_name` varchar(100) NOT NULL DEFAULT '' COMMENT '卖家部门名称，拼接方式为circle1,circle2,circle3...',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省id',
  `province_name` varchar(20) DEFAULT NULL COMMENT '省名称',
  `city_id` bigint(20) DEFAULT NULL COMMENT '市id',
  `city_name` varchar(20) DEFAULT NULL COMMENT '市名称',
  `country_id` bigint(20) DEFAULT NULL COMMENT '县id',
  `country_name` varchar(20) DEFAULT NULL COMMENT '县名称',
  `township_id` bigint(20) DEFAULT NULL COMMENT '乡镇id',
  `township_name` varchar(20) DEFAULT NULL COMMENT '乡名称',
  `village_id` bigint(20) DEFAULT NULL COMMENT '村id',
  `village_name` varchar(20) DEFAULT NULL COMMENT '村名称',
  `p_province_id` bigint(20) DEFAULT NULL COMMENT '产地省id',
  `p_province_name` varchar(20) DEFAULT NULL COMMENT '产地省名称',
  `p_city_id` bigint(20) DEFAULT NULL COMMENT '产地市id',
  `p_city_name` varchar(20) DEFAULT NULL COMMENT '产地市名称',
  `p_country_id` bigint(20) DEFAULT NULL COMMENT '产地县id',
  `p_country_name` varchar(20) DEFAULT NULL COMMENT '产地县名称',
  `p_township_id` bigint(20) DEFAULT NULL COMMENT '产地乡id',
  `p_township_name` varchar(20) DEFAULT NULL,
  `p_village_id` bigint(20) DEFAULT NULL COMMENT '产地村id',
  `p_village_name` varchar(20) DEFAULT NULL COMMENT '产地村名称',
  `help_price` decimal(15,2) NOT NULL COMMENT '帮扶金额',
  `seller_id` int(10) NOT NULL COMMENT '卖家id',
  `seller_name` varchar(20) NOT NULL COMMENT '卖家名称',
  `seller_type` tinyint(1) NOT NULL COMMENT '卖家类型 1：贫困户 2：助理人 3：线上集采 4：线下集采 5：善源商场 6：大爱超市',
  `store_id` int(11) NOT NULL COMMENT '店铺id',
  `buyer_id` int(11) NOT NULL COMMENT '买家id',
  `buyer_name` varchar(50) NOT NULL COMMENT '买家名称',
  `goods_num` int(10) NOT NULL COMMENT '商品num',
  `goods_project_type` int(10) NOT NULL DEFAULT '0' COMMENT '项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)',
  `sy_points` decimal(12,0) DEFAULT '0' COMMENT '该订单获取到的公益币',
  `union_id` int(20) NOT NULL DEFAULT '0' COMMENT '买家联盟id',
  `union_name` varchar(20) NOT NULL DEFAULT '' COMMENT '买家联盟名称',
  `channel` varchar(20) NOT NULL DEFAULT '' COMMENT '买家联盟',
  `coupon_pay` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '购物劵支付金额单位分',
  `money_pay` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '实际支付金额单位分',
  `assist_id` int(11) NOT NULL DEFAULT '0' COMMENT '助理人id',
  `app_variant` varchar(20) NOT NULL DEFAULT '' COMMENT 'app渠道标识,默认空',
  `support_county_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '定点扶贫县的id',
  `discount_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '满减总金额单位分',
  `biz_operation_mid` int(11) NOT NULL DEFAULT '0' COMMENT '集采运营中心id',
  `platform_pay` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '满减总金额单位分(平台承担)',
  `service_fee_rate` smallint(6) NOT NULL DEFAULT '0' COMMENT '总汇率，实际比例为该值除以1000',
  `service_fee` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '平台管理费',
  `agent_fee` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '代理人代理费',
  `fund_fee_rate` smallint(6) NOT NULL DEFAULT '0' COMMENT '基金会费用的比例，实际比例为该值除以1000',
  `fund_fee` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '基金会收取的费用',
  `c_time` int(10) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `circle_id_deep_1` (`circle_id_deep_1`) USING BTREE,
  KEY `circle_id_deep_2` (`circle_id_deep_2`) USING BTREE,
  KEY `circle_id_deep_3` (`circle_id_deep_3`) USING BTREE,
  KEY `circle_id_deep_4` (`circle_id_deep_4`) USING BTREE,
  KEY `circle_id_deep_5` (`circle_id_deep_5`) USING BTREE,
  KEY `circle_id_deep_6` (`circle_id_deep_6`) USING BTREE,
  KEY `circle_id_deep_7` (`circle_id_deep_7`) USING BTREE,
  KEY `province_id` (`province_id`) USING BTREE,
  KEY `city_id` (`city_id`) USING BTREE,
  KEY `country_id` (`country_id`) USING BTREE,
  KEY `township_id` (`township_id`) USING BTREE,
  KEY `village_id` (`village_id`) USING BTREE,
  KEY `p_province_id` (`p_province_id`) USING BTREE,
  KEY `p_city_id` (`p_city_id`) USING BTREE,
  KEY `p_country_id` (`p_country_id`) USING BTREE,
  KEY `p_village_id` (`p_village_id`) USING BTREE,
  KEY `seller_id` (`seller_id`) USING BTREE,
  KEY `seller_type` (`seller_type`) USING BTREE,
  KEY `buyer_id` (`buyer_id`) USING BTREE,
  KEY `order_from` (`order_from`) USING BTREE,
  KEY `store_id` (`store_id`) USING BTREE,
  KEY `goods_project_type` (`goods_project_type`) USING BTREE,
  KEY `channel` (`channel`) USING BTREE,
  KEY `assist_id` (`assist_id`) USING BTREE,
  KEY `support_county_id` (`support_county_id`) USING BTREE,
  KEY `biz_operation_mid` (`biz_operation_mid`) USING BTREE,
  KEY `order_id` (`order_id`) USING BTREE,
  KEY `s_circle_id_deep_1` (`s_circle_id_deep_1`),
  KEY `s_circle_id_deep_2` (`s_circle_id_deep_2`),
  KEY `s_circle_id_deep_3` (`s_circle_id_deep_3`),
  KEY `s_circle_id_deep_4` (`s_circle_id_deep_4`),
  KEY `s_circle_id_deep_5` (`s_circle_id_deep_5`),
  KEY `s_circle_id_deep_6` (`s_circle_id_deep_6`),
  KEY `s_circle_id_deep_7` (`s_circle_id_deep_7`),
  KEY `s_union_id` (`s_union_id`) USING BTREE,
  KEY `s_channel` (`s_channel`) USING BTREE,
  KEY `union_id` (`union_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `statistics_order_offline_biz_order`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_order_offline_biz_order`;
CREATE TABLE `statistics_order_offline_biz_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `main_order_id` int(11) NOT NULL COMMENT '集采订单索引',
  `buyer_id` int(11) NOT NULL,
  `buyer_name` varchar(50) NOT NULL COMMENT '买家姓名',
  `finished_time` int(10) NOT NULL DEFAULT '0' COMMENT '完成时间',
  `order_amount` decimal(15,2) unsigned NOT NULL COMMENT '订单总价 单位分',
  `circle_id_deep_1` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '买家部门id',
  `circle_id_deep_2` int(11) NOT NULL DEFAULT '0',
  `circle_id_deep_3` int(11) NOT NULL DEFAULT '0',
  `circle_id_deep_4` int(11) NOT NULL DEFAULT '0',
  `circle_id_deep_5` int(11) NOT NULL DEFAULT '0',
  `circle_id_deep_6` int(11) NOT NULL DEFAULT '0',
  `circle_id_deep_7` int(11) NOT NULL DEFAULT '0',
  `circle_name` varchar(100) NOT NULL DEFAULT '' COMMENT '买家部门名称，拼接方式circle1,circle2,circle3...',
  `channel` varchar(20) NOT NULL DEFAULT '' COMMENT '联盟渠道标识',
  `order_type` enum('biz_have_goods','biz_intention_goods') NOT NULL COMMENT '订单类型 biz_have_goods：购买集采已有产品  biz_intention_goods：集采意向产品',
  `pay_state` enum('10','20','30') DEFAULT '10' COMMENT '支付状态 10：未支付  20：买家确认支付  30：卖家确认支付',
  `c_time` int(10) NOT NULL DEFAULT '0' COMMENT '订单完成时间 格式yyyyMMdd',
  `help_price` decimal(10,2) NOT NULL COMMENT '帮扶金额',
  PRIMARY KEY (`id`),
  KEY `main_order_id` (`main_order_id`) USING BTREE,
  KEY `circle_id_deep1` (`circle_id_deep_1`) USING BTREE,
  KEY `circle_id_deep_2` (`circle_id_deep_2`) USING BTREE,
  KEY `circle_id_deep_3` (`circle_id_deep_3`) USING BTREE,
  KEY `circle_id_deep_4` (`circle_id_deep_4`) USING BTREE,
  KEY `circle_id_deep_5` (`circle_id_deep_5`) USING BTREE,
  KEY `circle_id_deep_6` (`circle_id_deep_6`) USING BTREE,
  KEY `circle_id_deep_7` (`circle_id_deep_7`) USING BTREE,
  KEY `channel` (`channel`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='集采订单统计表'

-- ----------------------------
--  Table structure for `statistics_order_offline_biz_order_goods`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_order_offline_biz_order_goods`;
CREATE TABLE `statistics_order_offline_biz_order_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `main_order_id` int(11) NOT NULL COMMENT '集采订单id',
  `goods_id` int(11) NOT NULL COMMENT '商品id',
  `goods_num` int(10) NOT NULL COMMENT '商品数量',
  `goods_price` decimal(10,2) unsigned NOT NULL,
  `assist_id` int(11) NOT NULL COMMENT '助理人id',
  `pubisher_id` int(11) unsigned NOT NULL COMMENT '集采监管人id',
  `s_circle_id_deep_1` int(11) NOT NULL DEFAULT '0' COMMENT '助理人部门id',
  `s_circle_id_deep_2` int(11) NOT NULL DEFAULT '0',
  `s_circle_id_deep_3` int(11) NOT NULL DEFAULT '0',
  `s_circle_id_deep_4` int(11) NOT NULL DEFAULT '0',
  `s_circle_id_deep_5` int(11) NOT NULL DEFAULT '0',
  `s_circle_id_deep_6` int(11) NOT NULL DEFAULT '0',
  `s_circle_id_deep_7` int(11) NOT NULL DEFAULT '0',
  `s_circle_name` varchar(100) NOT NULL DEFAULT '' COMMENT '卖家部门名称 拼接方式circle1,circle2,circle3...',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省id',
  `privince_name` varchar(20) DEFAULT NULL COMMENT '省名称',
  `city_id` bigint(20) DEFAULT NULL COMMENT '市id',
  `city_name` varchar(20) DEFAULT NULL COMMENT '市名称',
  `country_id` bigint(20) DEFAULT NULL COMMENT '县id',
  `country_name` varchar(20) DEFAULT NULL COMMENT '县名称',
  `township_id` bigint(20) DEFAULT NULL,
  `township_name` varchar(20) DEFAULT NULL COMMENT '乡名称',
  `village_id` bigint(20) DEFAULT NULL COMMENT '村id',
  `village_name` varchar(20) DEFAULT NULL COMMENT '村名称',
  PRIMARY KEY (`id`),
  KEY `main_order_id` (`main_order_id`) USING BTREE,
  KEY `goods_id` (`goods_id`) USING BTREE,
  KEY `assist_id` (`assist_id`) USING BTREE,
  KEY `s_circle_id_deep_1` (`s_circle_id_deep_1`) USING BTREE,
  KEY `s_circle_id_deep_2` (`s_circle_id_deep_2`) USING BTREE,
  KEY `s_circle_id_deep_3` (`s_circle_id_deep_3`) USING BTREE,
  KEY `s_circle_id_deep_4` (`s_circle_id_deep_4`) USING BTREE,
  KEY `s_circle_id_deep_5` (`s_circle_id_deep_5`) USING BTREE,
  KEY `s_circle_id_deep_6` (`s_circle_id_deep_6`) USING BTREE,
  KEY `s_circle_id_deep_7` (`s_circle_id_deep_7`) USING BTREE,
  KEY `province_id` (`province_id`) USING BTREE,
  KEY `city_id` (`city_id`) USING BTREE,
  KEY `country_id` (`country_id`) USING BTREE,
  KEY `township_id` (`township_id`) USING BTREE,
  KEY `village_id` (`village_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='线下集采统计详情';

-- ----------------------------
--  Table structure for `statistics_platform_seller_data`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_platform_seller_data`;
CREATE TABLE `statistics_platform_seller_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `assist_order_num` int(11) NOT NULL DEFAULT '0',
  `assist_goods_num` int(11) NOT NULL DEFAULT '0',
  `assist_order_amount` decimal(15,2) NOT NULL DEFAULT '0.00',
  `assit_help_price` decimal(15,2) NOT NULL DEFAULT '0.00',
  `poor_order_num` int(11) NOT NULL DEFAULT '0',
  `poor_goods_num` int(11) NOT NULL DEFAULT '0',
  `poor_order_amount` decimal(15,2) NOT NULL DEFAULT '0.00',
  `online_order_num` int(11) NOT NULL DEFAULT '0',
  `online_goods_num` int(11) NOT NULL DEFAULT '0',
  `online_order_amount` decimal(15,2) NOT NULL DEFAULT '0.00',
  `online_help_price` decimal(15,2) NOT NULL DEFAULT '0.00',
  `offline_order_num` int(11) NOT NULL DEFAULT '0',
  `offline_goods_num` int(11) NOT NULL DEFAULT '0',
  `offline_order_amount` decimal(15,2) NOT NULL DEFAULT '0.00',
  `offline_help_price` decimal(15,2) NOT NULL DEFAULT '0.00',
  `sy_order_num` int(11) NOT NULL DEFAULT '0',
  `sy_goods_num` int(11) NOT NULL DEFAULT '0',
  `sy_order_amount` decimal(15,2) NOT NULL DEFAULT '0.00',
  `sy_donation_amount` decimal(15,2) NOT NULL DEFAULT '0.00',
  `c_time` int(11) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `c_time` (`c_time`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `statistics_point_details_tag`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_point_details_tag`;
CREATE TABLE `statistics_point_details_tag` (
  `member_id` int(11) NOT NULL,
  `union_id` int(11) NOT NULL DEFAULT '0' COMMENT '联盟id',
  `union_name` varchar(20) NOT NULL DEFAULT '' COMMENT '联盟名称',
  `channel` varchar(20) NOT NULL DEFAULT '' COMMENT '联盟标识',
  `total_point_tag` bigint(20) NOT NULL DEFAULT '0' COMMENT '累计积分标签',
  `valid_point_tag` bigint(20) NOT NULL DEFAULT '0' COMMENT '可用积分标签',
  `total_point` decimal(12,0) NOT NULL DEFAULT '0' COMMENT '累计积分',
  `valid_point` decimal(12,0) NOT NULL DEFAULT '0' COMMENT '可用积分',
  `member_mobile` varchar(14) NOT NULL COMMENT '手机号',
  `member_truename` varchar(20) DEFAULT NULL COMMENT '用户真实姓名',
  `member_disp_name` varchar(50) DEFAULT NULL COMMENT '会员显示名称',
  `member_name` varchar(100) NOT NULL COMMENT '会员名称',
  PRIMARY KEY (`member_id`),
  KEY `member_id` (`member_id`) USING BTREE,
  KEY `union_id` (`union_id`) USING BTREE,
  KEY `channel` (`channel`) USING BTREE,
  KEY `total_point_tag` (`total_point_tag`) USING BTREE,
  KEY `valid_point_tag` (`valid_point_tag`) USING BTREE,
  KEY `member_mobile` (`member_mobile`) USING BTREE,
  KEY `member_name` (`member_name`) USING BTREE,
  KEY `member_truename` (`member_truename`) USING BTREE,
  KEY `member_disp_name` (`member_disp_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='积分标签表';


-- ----------------------------
--  Table structure for `statistics_poverty_alleviation_overview`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_poverty_alleviation_overview`;
CREATE TABLE `statistics_poverty_alleviation_overview` (
  `rec_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_time` int(11) NOT NULL COMMENT '统计时间',
  `union_id` int(11) NOT NULL COMMENT '联盟id',
  `union_name` varchar(50) NOT NULL COMMENT '联盟名称',
  `channel` varchar(20) NOT NULL COMMENT '联盟标识',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省id',
  `province_name` varchar(20) DEFAULT NULL COMMENT '省名称',
  `city_id` bigint(20) DEFAULT NULL COMMENT '市id',
  `city_name` varchar(20) DEFAULT NULL COMMENT '市名称',
  `country_id` bigint(20) DEFAULT NULL COMMENT '县id',
  `country_name` varchar(20) DEFAULT NULL COMMENT '县名称',
  `township_id` bigint(20) DEFAULT NULL COMMENT '乡id',
  `township_name` varchar(20) DEFAULT NULL COMMENT '乡名称',
  `village_id` bigint(20) DEFAULT NULL COMMENT '村id',
  `village_name` varchar(20) DEFAULT NULL COMMENT '村名称',
  `donate_amount` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '公益捐赠总额单位分',
  `help_amount` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '帮扶总额单位分',
  `fund_amount` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '公益基金单位分',
  PRIMARY KEY (`rec_id`),
  KEY `c_time` (`c_time`),
  KEY `union_id` (`union_id`),
  KEY `channel` (`channel`),
  KEY `province_id` (`province_id`),
  KEY `city_id` (`city_id`),
  KEY `country_id` (`country_id`),
  KEY `township_id` (`township_id`),
  KEY `village_id` (`village_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='扶贫成果统计表';

-- ----------------------------
--  Table structure for `statistics_provide_base_data`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_provide_base_data`;
CREATE TABLE `statistics_provide_base_data` (
  `rec_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_time` int(10) unsigned NOT NULL COMMENT '统计日期',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省id',
  `province_name` varchar(20) DEFAULT NULL COMMENT '省名称',
  `city_id` bigint(20) DEFAULT NULL COMMENT '市id',
  `city_name` varchar(20) DEFAULT NULL COMMENT '市名称',
  `country_id` bigint(20) DEFAULT NULL COMMENT '县id',
  `country_name` varchar(20) DEFAULT NULL COMMENT '县名称',
  `township_id` bigint(20) DEFAULT NULL COMMENT '乡id',
  `township_name` varchar(20) DEFAULT NULL COMMENT '乡名称',
  `village_id` bigint(20) DEFAULT NULL COMMENT '村名称',
  `village_name` varchar(20) DEFAULT NULL COMMENT '村名称',
  `assist_sell_da` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '助理人销售总额（大爱）',
  `assist_sell_zx` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '助理人销售总额（甄选）',
  `assist_buy_da` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '助理人帮扶总额（大爱）',
  `assist_buy_zx` decimal(20,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '助理人帮扶总额（甄选）',
  `assist_total_num` int(11) NOT NULL DEFAULT '0' COMMENT '助理人总数',
  `self_emp_poor_total_family` int(11) NOT NULL DEFAULT '0' COMMENT '自营贫困户在线户数',
  `poor_total_family` int(11) NOT NULL DEFAULT '0' COMMENT '贫困户户数',
  `poor_total_num` int(11) NOT NULL DEFAULT '0' COMMENT '贫困户人数',
  `assist_goods_total_num` bigint(20) NOT NULL DEFAULT '0' COMMENT '助理人总产品',
  `poor_goods_total_num` bigint(20) NOT NULL DEFAULT '0' COMMENT '贫困户自营总产品',
  PRIMARY KEY (`rec_id`),
  KEY `c_time` (`c_time`) USING BTREE,
  KEY `province_id` (`province_id`) USING BTREE,
  KEY `city_id` (`city_id`) USING BTREE,
  KEY `country_id` (`country_id`) USING BTREE,
  KEY `township_id` (`township_id`) USING BTREE,
  KEY `village_id` (`village_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='供给侧统计表';

-- ----------------------------
--  Table structure for `statistics_union_buyer`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_union_buyer`;
CREATE TABLE `statistics_union_buyer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dacs_order_num` int(11) NOT NULL COMMENT '大爱超市订单量',
  `dacs_goods_num` int(11) NOT NULL COMMENT '大爱超市商品量',
  `dacs_goods_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '大爱超市金额',
  `dacs_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '大爱超市帮扶金',
  `syzx_order_num` int(11) NOT NULL COMMENT '善源甄选订单量',
  `syzx_goods_num` int(11) NOT NULL COMMENT '善源甄选商品量',
  `syzx_goods_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选金额',
  `syzx_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选帮扶金',
  `sysc_order_num` int(11) NOT NULL COMMENT '善源商场订单量',
  `sysc_goods_num` int(11) NOT NULL COMMENT '善源商场商品量',
  `sysc_goods_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源商场金额',
  `sysc_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源商场帮扶金',
  `c_time` int(11) NOT NULL COMMENT '订单时间',
  `union_id` int(11) NOT NULL DEFAULT '0' COMMENT '联盟id',
  `union_name` varchar(50) NOT NULL DEFAULT '' COMMENT '联盟名称',
  `channel` varchar(50) NOT NULL DEFAULT '' COMMENT '渠道标识',
  PRIMARY KEY (`id`),
  KEY `union_id` (`union_id`),
  KEY `c_time` (`c_time`),
  KEY `channel` (`channel`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `statistics_union_sale`
-- ----------------------------
DROP TABLE IF EXISTS `statistics_union_sale`;
CREATE TABLE `statistics_union_sale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `union_id` int(11) NOT NULL DEFAULT '0' COMMENT '卖家联盟id',
  `union_name` varchar(50) NOT NULL DEFAULT '' COMMENT '卖家联盟名称',
  `channel` varchar(50) NOT NULL DEFAULT '' COMMENT '卖家渠道',
  `area_id` bigint(11) NOT NULL DEFAULT '0' COMMENT '卖家地区id',
  `area_name` varchar(50) NOT NULL DEFAULT '' COMMENT '卖家地区名称',
  `assist_order_num` int(11) NOT NULL DEFAULT '0' COMMENT '助理人订单量',
  `assist_sale_num` int(11) NOT NULL DEFAULT '0' COMMENT '助理人销售量',
  `assist_sale_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '助理人销售额',
  `assist_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '助理人帮扶金',
  `assist_self_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '助理人自帮扶',
  `poor_order_num` int(11) NOT NULL DEFAULT '0' COMMENT '贫困户订单量',
  `poor_sale_num` int(11) NOT NULL DEFAULT '0' COMMENT '贫困户销售量',
  `poor_sale_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '贫困户销售额',
  `poor_self_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '贫困户自帮扶',
  `syzx_online_order_num` int(11) NOT NULL DEFAULT '0' COMMENT '善源甄选线上订单量',
  `syzx_online_sale_num` int(11) NOT NULL DEFAULT '0' COMMENT '善源甄选线上销售量',
  `syzx_online_sale_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选线上销售额',
  `syzx_online_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选线上帮扶金',
  `syzx_online_self_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选线上自帮扶',
  `syzx_offline_order_num` int(11) NOT NULL DEFAULT '0' COMMENT '善源甄选线下订单量',
  `syzx_offline_sale_num` int(11) NOT NULL DEFAULT '0' COMMENT '善源甄选线下销售量',
  `syzx_offline_sale_amount` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选线下销售额',
  `syzx_offline_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选线下帮扶金',
  `syzx_offline_self_help_price` decimal(15,2) NOT NULL DEFAULT '0.00' COMMENT '善源甄选线下自帮扶',
  `c_time` int(11) NOT NULL COMMENT '订单时间',
  PRIMARY KEY (`id`),
  KEY `c_time` (`c_time`),
  KEY `union_id` (`union_id`),
  KEY `area_id` (`area_id`),
  KEY `channel` (`channel`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
