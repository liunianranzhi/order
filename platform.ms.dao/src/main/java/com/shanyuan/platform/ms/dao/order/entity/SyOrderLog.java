package com.shanyuan.platform.ms.dao.order.entity;

/**
 * 描述:sy_order_log表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-18
 */
public class SyOrderLog {
    /**
     * 主键
     */
    private Integer logId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 文字描述
     */
    private String logMsg;

    /**
     * 处理时间
     */
    private Integer logTime;

    /**
     * 操作角色
     */
    private String logRole;

    /**
     * 操作人
     */
    private String logUser;

    /**
     * 订单状态：0(默认)1:未付款;10:过期失败;15:已付款;30:已发货;40:已收货;50:退款
     */
    private String logOrderstate;

    /**
     * 主键
     * @return log_id 主键
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * 主键
     * @param logId 主键
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 订单id
     * @return order_id 订单id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 文字描述
     * @return log_msg 文字描述
     */
    public String getLogMsg() {
        return logMsg;
    }

    /**
     * 文字描述
     * @param logMsg 文字描述
     */
    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg == null ? null : logMsg.trim();
    }

    /**
     * 处理时间
     * @return log_time 处理时间
     */
    public Integer getLogTime() {
        return logTime;
    }

    /**
     * 处理时间
     * @param logTime 处理时间
     */
    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    /**
     * 操作角色
     * @return log_role 操作角色
     */
    public String getLogRole() {
        return logRole;
    }

    /**
     * 操作角色
     * @param logRole 操作角色
     */
    public void setLogRole(String logRole) {
        this.logRole = logRole == null ? null : logRole.trim();
    }

    /**
     * 操作人
     * @return log_user 操作人
     */
    public String getLogUser() {
        return logUser;
    }

    /**
     * 操作人
     * @param logUser 操作人
     */
    public void setLogUser(String logUser) {
        this.logUser = logUser == null ? null : logUser.trim();
    }

    /**
     * 订单状态：0(默认)1:未付款;10:过期失败;15:已付款;30:已发货;40:已收货;50:退款
     * @return log_orderstate 订单状态：0(默认)1:未付款;10:过期失败;15:已付款;30:已发货;40:已收货;50:退款
     */
    public String getLogOrderstate() {
        return logOrderstate;
    }

    /**
     * 订单状态：0(默认)1:未付款;10:过期失败;15:已付款;30:已发货;40:已收货;50:退款
     * @param logOrderstate 订单状态：0(默认)1:未付款;10:过期失败;15:已付款;30:已发货;40:已收货;50:退款
     */
    public void setLogOrderstate(String logOrderstate) {
        this.logOrderstate = logOrderstate == null ? null : logOrderstate.trim();
    }
}