package com.shanyuan.platform.ms.dao.user.entity;


/**
 * 描述:sy_message表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyMessage {
    /**
     * Áü≠ś∂ąśĀĮÁīĘŚľēid
     */
    private Integer messageId;

    /**
     * ŚõěŚ§ćÁü≠ś∂ąśĀĮmessage_id
     */
    private Integer messageParentId;

    /**
     * Áü≠ś∂ąśĀĮŚŹĎťÄĀšļļ
     */
    private Integer fromMemberId;

    /**
     * Áü≠ś∂ąśĀĮśé•śĒ∂šļļ
     */
    private String toMemberId;

    /**
     * Áü≠ś∂ąśĀĮś†áťĘė
     */
    private String messageTitle;

    /**
     * Áü≠ś∂ąśĀĮŚÜÖŚģĻ
     */
    private String messageBody;

    /**
     * Áü≠ś∂ąśĀĮŚŹĎťÄĀśó∂ťóī
     */
    private String messageTime;

    /**
     * Áü≠ś∂ąśĀĮŚõěŚ§ćśõīśĖįśó∂ťóī
     */
    private String messageUpdateTime;

    /**
     * Áü≠ś∂ąśĀĮśČďŚľÄÁä∂śÄĀ
     */
    private Byte messageOpen;

    /**
     * Áü≠ś∂ąśĀĮÁä∂śÄĀÔľĆ0šłļś≠£ŚłłÁä∂śÄĀÔľĆ1šłļŚŹĎťÄĀšļļŚą†ťô§Áä∂śÄĀÔľĆ2šłļśé•śĒ∂šļļŚą†ťô§Áä∂śÄĀ
     */
    private Byte messageState;

    /**
     * 0šłļÁßĀšŅ°„ÄĀ1šłļÁ≥ĽÁĽüś∂ąśĀĮ„ÄĀ2šłļÁēôŤ®Ä„ÄĀ3šłļŤģĘŚćēÁēôŤ®Ä
     */
    private Byte messageType;

    /**
     * Ś∑≤ÁĽŹŤĮĽŤŅáŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     */
    private String readMemberId;

    /**
     * Ś∑≤ÁĽŹŚą†ťô§ŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     */
    private String delMemberId;

    /**
     * ÁęôŚÜÖšŅ°śėĮŚź¶šłļšłÄśĚ°ŚŹĎÁĽôŚ§öšł™ÁĒ®śą∑ 0šłļŚź¶ 1šłļŚ§öśĚ° 
     */
    private Byte messageIsmore;

    /**
     * ŚŹĎšŅ°śĀĮšļļÁĒ®śą∑Śźć
     */
    private String fromMemberName;

    /**
     * śé•śĒ∂šļļÁĒ®śą∑Śźć
     */
    private String toMemberName;

    /**
     * ś∂ąśĀĮťďĺśé•ŚźćÁßį
     */
    private String linkName;

    /**
     * ś∂ąśĀĮťďĺśé•
     */
    private String messageLink;

    /**
     * ŤģĘŚćēid
     */
    private Integer orderId;

    /**
     * 
     */
    private Long count;

    /**
     * Áü≠ś∂ąśĀĮÁīĘŚľēid
     * @return message_id Áü≠ś∂ąśĀĮÁīĘŚľēid
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * Áü≠ś∂ąśĀĮÁīĘŚľēid
     * @param messageId Áü≠ś∂ąśĀĮÁīĘŚľēid
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * ŚõěŚ§ćÁü≠ś∂ąśĀĮmessage_id
     * @return message_parent_id ŚõěŚ§ćÁü≠ś∂ąśĀĮmessage_id
     */
    public Integer getMessageParentId() {
        return messageParentId;
    }

    /**
     * ŚõěŚ§ćÁü≠ś∂ąśĀĮmessage_id
     * @param messageParentId ŚõěŚ§ćÁü≠ś∂ąśĀĮmessage_id
     */
    public void setMessageParentId(Integer messageParentId) {
        this.messageParentId = messageParentId;
    }

    /**
     * Áü≠ś∂ąśĀĮŚŹĎťÄĀšļļ
     * @return from_member_id Áü≠ś∂ąśĀĮŚŹĎťÄĀšļļ
     */
    public Integer getFromMemberId() {
        return fromMemberId;
    }

    /**
     * Áü≠ś∂ąśĀĮŚŹĎťÄĀšļļ
     * @param fromMemberId Áü≠ś∂ąśĀĮŚŹĎťÄĀšļļ
     */
    public void setFromMemberId(Integer fromMemberId) {
        this.fromMemberId = fromMemberId;
    }

    /**
     * Áü≠ś∂ąśĀĮśé•śĒ∂šļļ
     * @return to_member_id Áü≠ś∂ąśĀĮśé•śĒ∂šļļ
     */
    public String getToMemberId() {
        return toMemberId;
    }

    /**
     * Áü≠ś∂ąśĀĮśé•śĒ∂šļļ
     * @param toMemberId Áü≠ś∂ąśĀĮśé•śĒ∂šļļ
     */
    public void setToMemberId(String toMemberId) {
        this.toMemberId = toMemberId == null ? null : toMemberId.trim();
    }

    /**
     * Áü≠ś∂ąśĀĮś†áťĘė
     * @return message_title Áü≠ś∂ąśĀĮś†áťĘė
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * Áü≠ś∂ąśĀĮś†áťĘė
     * @param messageTitle Áü≠ś∂ąśĀĮś†áťĘė
     */
    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    /**
     * Áü≠ś∂ąśĀĮŚÜÖŚģĻ
     * @return message_body Áü≠ś∂ąśĀĮŚÜÖŚģĻ
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * Áü≠ś∂ąśĀĮŚÜÖŚģĻ
     * @param messageBody Áü≠ś∂ąśĀĮŚÜÖŚģĻ
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody == null ? null : messageBody.trim();
    }

    /**
     * Áü≠ś∂ąśĀĮŚŹĎťÄĀśó∂ťóī
     * @return message_time Áü≠ś∂ąśĀĮŚŹĎťÄĀśó∂ťóī
     */
    public String getMessageTime() {
        return messageTime;
    }

    /**
     * Áü≠ś∂ąśĀĮŚŹĎťÄĀśó∂ťóī
     * @param messageTime Áü≠ś∂ąśĀĮŚŹĎťÄĀśó∂ťóī
     */
    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime == null ? null : messageTime.trim();
    }

    /**
     * Áü≠ś∂ąśĀĮŚõěŚ§ćśõīśĖįśó∂ťóī
     * @return message_update_time Áü≠ś∂ąśĀĮŚõěŚ§ćśõīśĖįśó∂ťóī
     */
    public String getMessageUpdateTime() {
        return messageUpdateTime;
    }

    /**
     * Áü≠ś∂ąśĀĮŚõěŚ§ćśõīśĖįśó∂ťóī
     * @param messageUpdateTime Áü≠ś∂ąśĀĮŚõěŚ§ćśõīśĖįśó∂ťóī
     */
    public void setMessageUpdateTime(String messageUpdateTime) {
        this.messageUpdateTime = messageUpdateTime == null ? null : messageUpdateTime.trim();
    }

    /**
     * Áü≠ś∂ąśĀĮśČďŚľÄÁä∂śÄĀ
     * @return message_open Áü≠ś∂ąśĀĮśČďŚľÄÁä∂śÄĀ
     */
    public Byte getMessageOpen() {
        return messageOpen;
    }

    /**
     * Áü≠ś∂ąśĀĮśČďŚľÄÁä∂śÄĀ
     * @param messageOpen Áü≠ś∂ąśĀĮśČďŚľÄÁä∂śÄĀ
     */
    public void setMessageOpen(Byte messageOpen) {
        this.messageOpen = messageOpen;
    }

    /**
     * Áü≠ś∂ąśĀĮÁä∂śÄĀÔľĆ0šłļś≠£ŚłłÁä∂śÄĀÔľĆ1šłļŚŹĎťÄĀšļļŚą†ťô§Áä∂śÄĀÔľĆ2šłļśé•śĒ∂šļļŚą†ťô§Áä∂śÄĀ
     * @return message_state Áü≠ś∂ąśĀĮÁä∂śÄĀÔľĆ0šłļś≠£ŚłłÁä∂śÄĀÔľĆ1šłļŚŹĎťÄĀšļļŚą†ťô§Áä∂śÄĀÔľĆ2šłļśé•śĒ∂šļļŚą†ťô§Áä∂śÄĀ
     */
    public Byte getMessageState() {
        return messageState;
    }

    /**
     * Áü≠ś∂ąśĀĮÁä∂śÄĀÔľĆ0šłļś≠£ŚłłÁä∂śÄĀÔľĆ1šłļŚŹĎťÄĀšļļŚą†ťô§Áä∂śÄĀÔľĆ2šłļśé•śĒ∂šļļŚą†ťô§Áä∂śÄĀ
     * @param messageState Áü≠ś∂ąśĀĮÁä∂śÄĀÔľĆ0šłļś≠£ŚłłÁä∂śÄĀÔľĆ1šłļŚŹĎťÄĀšļļŚą†ťô§Áä∂śÄĀÔľĆ2šłļśé•śĒ∂šļļŚą†ťô§Áä∂śÄĀ
     */
    public void setMessageState(Byte messageState) {
        this.messageState = messageState;
    }

    /**
     * 0šłļÁßĀšŅ°„ÄĀ1šłļÁ≥ĽÁĽüś∂ąśĀĮ„ÄĀ2šłļÁēôŤ®Ä„ÄĀ3šłļŤģĘŚćēÁēôŤ®Ä
     * @return message_type 0šłļÁßĀšŅ°„ÄĀ1šłļÁ≥ĽÁĽüś∂ąśĀĮ„ÄĀ2šłļÁēôŤ®Ä„ÄĀ3šłļŤģĘŚćēÁēôŤ®Ä
     */
    public Byte getMessageType() {
        return messageType;
    }

    /**
     * 0šłļÁßĀšŅ°„ÄĀ1šłļÁ≥ĽÁĽüś∂ąśĀĮ„ÄĀ2šłļÁēôŤ®Ä„ÄĀ3šłļŤģĘŚćēÁēôŤ®Ä
     * @param messageType 0šłļÁßĀšŅ°„ÄĀ1šłļÁ≥ĽÁĽüś∂ąśĀĮ„ÄĀ2šłļÁēôŤ®Ä„ÄĀ3šłļŤģĘŚćēÁēôŤ®Ä
     */
    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    /**
     * Ś∑≤ÁĽŹŤĮĽŤŅáŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     * @return read_member_id Ś∑≤ÁĽŹŤĮĽŤŅáŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     */
    public String getReadMemberId() {
        return readMemberId;
    }

    /**
     * Ś∑≤ÁĽŹŤĮĽŤŅáŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     * @param readMemberId Ś∑≤ÁĽŹŤĮĽŤŅáŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     */
    public void setReadMemberId(String readMemberId) {
        this.readMemberId = readMemberId == null ? null : readMemberId.trim();
    }

    /**
     * Ś∑≤ÁĽŹŚą†ťô§ŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     * @return del_member_id Ś∑≤ÁĽŹŚą†ťô§ŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     */
    public String getDelMemberId() {
        return delMemberId;
    }

    /**
     * Ś∑≤ÁĽŹŚą†ťô§ŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     * @param delMemberId Ś∑≤ÁĽŹŚą†ťô§ŤĮ•ś∂ąśĀĮÁöĄšľöŚĎėid
     */
    public void setDelMemberId(String delMemberId) {
        this.delMemberId = delMemberId == null ? null : delMemberId.trim();
    }

    /**
     * ÁęôŚÜÖšŅ°śėĮŚź¶šłļšłÄśĚ°ŚŹĎÁĽôŚ§öšł™ÁĒ®śą∑ 0šłļŚź¶ 1šłļŚ§öśĚ° 
     * @return message_ismore ÁęôŚÜÖšŅ°śėĮŚź¶šłļšłÄśĚ°ŚŹĎÁĽôŚ§öšł™ÁĒ®śą∑ 0šłļŚź¶ 1šłļŚ§öśĚ° 
     */
    public Byte getMessageIsmore() {
        return messageIsmore;
    }

    /**
     * ÁęôŚÜÖšŅ°śėĮŚź¶šłļšłÄśĚ°ŚŹĎÁĽôŚ§öšł™ÁĒ®śą∑ 0šłļŚź¶ 1šłļŚ§öśĚ° 
     * @param messageIsmore ÁęôŚÜÖšŅ°śėĮŚź¶šłļšłÄśĚ°ŚŹĎÁĽôŚ§öšł™ÁĒ®śą∑ 0šłļŚź¶ 1šłļŚ§öśĚ° 
     */
    public void setMessageIsmore(Byte messageIsmore) {
        this.messageIsmore = messageIsmore;
    }

    /**
     * ŚŹĎšŅ°śĀĮšļļÁĒ®śą∑Śźć
     * @return from_member_name ŚŹĎšŅ°śĀĮšļļÁĒ®śą∑Śźć
     */
    public String getFromMemberName() {
        return fromMemberName;
    }

    /**
     * ŚŹĎšŅ°śĀĮšļļÁĒ®śą∑Śźć
     * @param fromMemberName ŚŹĎšŅ°śĀĮšļļÁĒ®śą∑Śźć
     */
    public void setFromMemberName(String fromMemberName) {
        this.fromMemberName = fromMemberName == null ? null : fromMemberName.trim();
    }

    /**
     * śé•śĒ∂šļļÁĒ®śą∑Śźć
     * @return to_member_name śé•śĒ∂šļļÁĒ®śą∑Śźć
     */
    public String getToMemberName() {
        return toMemberName;
    }

    /**
     * śé•śĒ∂šļļÁĒ®śą∑Śźć
     * @param toMemberName śé•śĒ∂šļļÁĒ®śą∑Śźć
     */
    public void setToMemberName(String toMemberName) {
        this.toMemberName = toMemberName == null ? null : toMemberName.trim();
    }

    /**
     * ś∂ąśĀĮťďĺśé•ŚźćÁßį
     * @return link_name ś∂ąśĀĮťďĺśé•ŚźćÁßį
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * ś∂ąśĀĮťďĺśé•ŚźćÁßį
     * @param linkName ś∂ąśĀĮťďĺśé•ŚźćÁßį
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    /**
     * ś∂ąśĀĮťďĺśé•
     * @return message_link ś∂ąśĀĮťďĺśé•
     */
    public String getMessageLink() {
        return messageLink;
    }

    /**
     * ś∂ąśĀĮťďĺśé•
     * @param messageLink ś∂ąśĀĮťďĺśé•
     */
    public void setMessageLink(String messageLink) {
        this.messageLink = messageLink == null ? null : messageLink.trim();
    }

    /**
     * ŤģĘŚćēid
     * @return order_id ŤģĘŚćēid
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * ŤģĘŚćēid
     * @param orderId ŤģĘŚćēid
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * @return count 
     */
    public Long getCount() {
        return count;
    }

    /**
     * 
     * @param count 
     */
    public void setCount(Long count) {
        this.count = count;
    }

	@Override
	public String toString() {
		return "SyMessage [messageId=" + messageId + ", messageParentId=" + messageParentId + ", fromMemberId="
				+ fromMemberId + ", toMemberId=" + toMemberId + ", messageTitle=" + messageTitle + ", messageBody="
				+ messageBody + ", messageTime=" + messageTime + ", messageUpdateTime=" + messageUpdateTime
				+ ", messageOpen=" + messageOpen + ", messageState=" + messageState + ", messageType=" + messageType
				+ ", readMemberId=" + readMemberId + ", delMemberId=" + delMemberId + ", messageIsmore=" + messageIsmore
				+ ", fromMemberName=" + fromMemberName + ", toMemberName=" + toMemberName + ", linkName=" + linkName
				+ ", messageLink=" + messageLink + ", orderId=" + orderId + ", count=" + count + "]";
	}
    
}