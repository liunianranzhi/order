package com.shanyuan.platform.ms.core.store.bo;

public class AlbumClassBo {
	
	/**
     * 相册id
     */
    private Integer aclassId;

    /**
     * 相册名称
     */
    private String aclassName;

    /**
     * 所属店铺id
     */
    private Integer storeId;

    /**
     * 相册描述
     */
    private String aclassDes;

    /**
     * 排序
     */
    private Integer aclassSort;

    /**
     * 相册封面
     */
    private String aclassCover;

    /**
     * 图片上传时间
     */
    private Integer uploadTime;

    /**
     * 是否为默认相册,1代表默认
     */
    private Byte isDefault;

    /**
     * 相册id
     * @return aclass_id 相册id
     */
    public Integer getAclassId() {
        return aclassId;
    }

    /**
     * 相册id
     * @param aclassId 相册id
     */
    public void setAclassId(Integer aclassId) {
        this.aclassId = aclassId;
    }

    /**
     * 相册名称
     * @return aclass_name 相册名称
     */
    public String getAclassName() {
        return aclassName;
    }

    /**
     * 相册名称
     * @param aclassName 相册名称
     */
    public void setAclassName(String aclassName) {
        this.aclassName = aclassName == null ? null : aclassName.trim();
    }

    /**
     * 所属店铺id
     * @return store_id 所属店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 所属店铺id
     * @param storeId 所属店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 相册描述
     * @return aclass_des 相册描述
     */
    public String getAclassDes() {
        return aclassDes;
    }

    /**
     * 相册描述
     * @param aclassDes 相册描述
     */
    public void setAclassDes(String aclassDes) {
        this.aclassDes = aclassDes == null ? null : aclassDes.trim();
    }

    /**
     * 排序
     * @return aclass_sort 排序
     */
    public Integer getAclassSort() {
        return aclassSort;
    }

    /**
     * 排序
     * @param aclassSort 排序
     */
    public void setAclassSort(Integer aclassSort) {
        this.aclassSort = aclassSort;
    }

    /**
     * 相册封面
     * @return aclass_cover 相册封面
     */
    public String getAclassCover() {
        return aclassCover;
    }

    /**
     * 相册封面
     * @param aclassCover 相册封面
     */
    public void setAclassCover(String aclassCover) {
        this.aclassCover = aclassCover == null ? null : aclassCover.trim();
    }

    /**
     * 图片上传时间
     * @return upload_time 图片上传时间
     */
    public Integer getUploadTime() {
        return uploadTime;
    }

    /**
     * 图片上传时间
     * @param uploadTime 图片上传时间
     */
    public void setUploadTime(Integer uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 是否为默认相册,1代表默认
     * @return is_default 是否为默认相册,1代表默认
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * 是否为默认相册,1代表默认
     * @param isDefault 是否为默认相册,1代表默认
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

}
