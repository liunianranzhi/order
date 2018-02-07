package com.shanyuan.platform.ms.core.union.bo;

import java.io.Serializable;

/**
 * unionBo
 * @author zhangwd
 */
public class UnionBo implements Serializable {

	private static final long serialVersionUID = 6650935322170289191L;

	/**
     * 联盟名称
     */
    private String unionName;
	
    /**
     * 联盟通道
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
     * 联盟描述
     */
    private String unionDesc;

	public String getUnionName() {
		return unionName;
	}

	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}

	public String getUnionChannel() {
		return unionChannel;
	}

	public void setUnionChannel(String unionChannel) {
		this.unionChannel = unionChannel;
	}

	public String getUnionImage() {
		return unionImage;
	}

	public void setUnionImage(String unionImage) {
		this.unionImage = unionImage;
	}

	public String getUnionDisImage() {
		return unionDisImage;
	}

	public void setUnionDisImage(String unionDisImage) {
		this.unionDisImage = unionDisImage;
	}

	public Byte getUnionType() {
		return unionType;
	}

	public void setUnionType(Byte unionType) {
		this.unionType = unionType;
	}

	public Byte getUnionHidden() {
		return unionHidden;
	}

	public void setUnionHidden(Byte unionHidden) {
		this.unionHidden = unionHidden;
	}

	public Byte getUnionFree() {
		return unionFree;
	}

	public void setUnionFree(Byte unionFree) {
		this.unionFree = unionFree;
	}

	public Integer getUnionSort() {
		return unionSort;
	}

	public void setUnionSort(Integer unionSort) {
		this.unionSort = unionSort;
	}

	public Byte getUnionDel() {
		return unionDel;
	}

	public void setUnionDel(Byte unionDel) {
		this.unionDel = unionDel;
	}

	public Byte getUnionOperation() {
		return unionOperation;
	}

	public void setUnionOperation(Byte unionOperation) {
		this.unionOperation = unionOperation;
	}

	public String getUnionDesc() {
		return unionDesc;
	}

	public void setUnionDesc(String unionDesc) {
		this.unionDesc = unionDesc;
	}
    
}
