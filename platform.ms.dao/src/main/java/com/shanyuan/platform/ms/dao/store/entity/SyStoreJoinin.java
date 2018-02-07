package com.shanyuan.platform.ms.dao.store.entity;

import java.util.Date;

/**
 * 描述:sy_store_joinin表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-19
 */
public class SyStoreJoinin {
    /**
     * 用户编号
     */
    private Integer memberId;

    /**
     * 店主用户名
     */
    private String memberName;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 公司详细地址
     */
    private String companyAddressDetail;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 员工总数
     */
    private Integer companyEmployeeCount;

    /**
     * 注册资金
     */
    private Integer companyRegisteredCapital;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人电话
     */
    private String contactsPhone;

    /**
     * 联系人邮箱
     */
    private String contactsEmail;

    /**
     * 营业执照号
     */
    private String businessLicenceNumber;

    /**
     * 营业执所在地
     */
    private String businessLicenceAddress;

    /**
     * 营业执照有效期开始
     */
    private Date businessLicenceStart;

    /**
     * 营业执照有效期结束
     */
    private Date businessLicenceEnd;

    /**
     * 法定经营范围
     */
    private String businessSphere;

    /**
     * 营业执照电子版
     */
    private String businessLicenceNumberElectronic;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 组织机构代码电子版
     */
    private String organizationCodeElectronic;

    /**
     * 一般纳税人证明
     */
    private String generalTaxpayer;

    /**
     * 银行开户名
     */
    private String bankAccountName;

    /**
     * 公司银行账号
     */
    private String bankAccountNumber;

    /**
     * 开户银行支行名称
     */
    private String bankName;

    /**
     * 支行联行号
     */
    private String bankCode;

    /**
     * 开户银行所在地
     */
    private String bankAddress;

    /**
     * 开户银行许可证电子版
     */
    private String bankLicenceElectronic;

    /**
     * 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
     */
    private Byte isSettlementAccount;

    /**
     * 结算银行开户名
     */
    private String settlementBankAccountName;

    /**
     * 结算公司银行账号
     */
    private String settlementBankAccountNumber;

    /**
     * 结算开户银行支行名称
     */
    private String settlementBankName;

    /**
     * 结算支行联行号
     */
    private String settlementBankCode;

    /**
     * 结算开户银行所在地
     */
    private String settlementBankAddress;

    /**
     * 税务登记证号
     */
    private String taxRegistrationCertificate;

    /**
     * 纳税人识别号
     */
    private String taxpayerId;

    /**
     * 税务登记证号电子版
     */
    private String taxRegistrationCertificateElectronic;

    /**
     * 卖家帐号
     */
    private String sellerName;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺分类编号集合
     */
    private String storeClassIds;

    /**
     * 店铺分类名称集合
     */
    private String storeClassNames;

    /**
     * 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
     */
    private String joininState;

    /**
     * 管理员审核信息
     */
    private String joininMessage;

    /**
     * 店铺等级名称
     */
    private String sgName;

    /**
     * 店铺等级编号
     */
    private Integer sgId;

    /**
     * 店铺分类名称
     */
    private String scName;

    /**
     * 店铺分类编号
     */
    private Integer scId;

    /**
     * 分类佣金比例
     */
    private String storeClassCommisRates;

    /**
     * 付款凭证
     */
    private String payingMoneyCertificate;

    /**
     * 付款凭证说明
     */
    private String payingMoneyCertificateExplain;

    /**
     * 运货车辆
     */
    private Integer carNum;

    /**
     * 仓库面积
     */
    private Integer warehouseArea;

    /**
     * 打单设备数量
     */
    private Integer singleDeviceNum;

    /**
     * 电脑设备数量
     */
    private Integer computerNum;

    /**
     * 合作物流公司
     */
    private String logisticsName;

    /**
     * 房屋租赁协议电子版
     */
    private String rentalAgreement;

    /**
     * 打单设备照片
     */
    private String singleDeviceImg;

    /**
     * 用户编号
     * @return member_id 用户编号
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 用户编号
     * @param memberId 用户编号
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 店主用户名
     * @return member_name 店主用户名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 店主用户名
     * @param memberName 店主用户名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 公司名称
     * @return company_name 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名称
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 公司地址
     * @return company_address 公司地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 公司地址
     * @param companyAddress 公司地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    /**
     * 公司详细地址
     * @return company_address_detail 公司详细地址
     */
    public String getCompanyAddressDetail() {
        return companyAddressDetail;
    }

    /**
     * 公司详细地址
     * @param companyAddressDetail 公司详细地址
     */
    public void setCompanyAddressDetail(String companyAddressDetail) {
        this.companyAddressDetail = companyAddressDetail == null ? null : companyAddressDetail.trim();
    }

    /**
     * 公司电话
     * @return company_phone 公司电话
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * 公司电话
     * @param companyPhone 公司电话
     */
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    /**
     * 员工总数
     * @return company_employee_count 员工总数
     */
    public Integer getCompanyEmployeeCount() {
        return companyEmployeeCount;
    }

    /**
     * 员工总数
     * @param companyEmployeeCount 员工总数
     */
    public void setCompanyEmployeeCount(Integer companyEmployeeCount) {
        this.companyEmployeeCount = companyEmployeeCount;
    }

    /**
     * 注册资金
     * @return company_registered_capital 注册资金
     */
    public Integer getCompanyRegisteredCapital() {
        return companyRegisteredCapital;
    }

    /**
     * 注册资金
     * @param companyRegisteredCapital 注册资金
     */
    public void setCompanyRegisteredCapital(Integer companyRegisteredCapital) {
        this.companyRegisteredCapital = companyRegisteredCapital;
    }

    /**
     * 联系人姓名
     * @return contacts_name 联系人姓名
     */
    public String getContactsName() {
        return contactsName;
    }

    /**
     * 联系人姓名
     * @param contactsName 联系人姓名
     */
    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    /**
     * 联系人电话
     * @return contacts_phone 联系人电话
     */
    public String getContactsPhone() {
        return contactsPhone;
    }

    /**
     * 联系人电话
     * @param contactsPhone 联系人电话
     */
    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    /**
     * 联系人邮箱
     * @return contacts_email 联系人邮箱
     */
    public String getContactsEmail() {
        return contactsEmail;
    }

    /**
     * 联系人邮箱
     * @param contactsEmail 联系人邮箱
     */
    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail == null ? null : contactsEmail.trim();
    }

    /**
     * 营业执照号
     * @return business_licence_number 营业执照号
     */
    public String getBusinessLicenceNumber() {
        return businessLicenceNumber;
    }

    /**
     * 营业执照号
     * @param businessLicenceNumber 营业执照号
     */
    public void setBusinessLicenceNumber(String businessLicenceNumber) {
        this.businessLicenceNumber = businessLicenceNumber == null ? null : businessLicenceNumber.trim();
    }

    /**
     * 营业执所在地
     * @return business_licence_address 营业执所在地
     */
    public String getBusinessLicenceAddress() {
        return businessLicenceAddress;
    }

    /**
     * 营业执所在地
     * @param businessLicenceAddress 营业执所在地
     */
    public void setBusinessLicenceAddress(String businessLicenceAddress) {
        this.businessLicenceAddress = businessLicenceAddress == null ? null : businessLicenceAddress.trim();
    }

    /**
     * 营业执照有效期开始
     * @return business_licence_start 营业执照有效期开始
     */
    public Date getBusinessLicenceStart() {
        return businessLicenceStart;
    }

    /**
     * 营业执照有效期开始
     * @param businessLicenceStart 营业执照有效期开始
     */
    public void setBusinessLicenceStart(Date businessLicenceStart) {
        this.businessLicenceStart = businessLicenceStart;
    }

    /**
     * 营业执照有效期结束
     * @return business_licence_end 营业执照有效期结束
     */
    public Date getBusinessLicenceEnd() {
        return businessLicenceEnd;
    }

    /**
     * 营业执照有效期结束
     * @param businessLicenceEnd 营业执照有效期结束
     */
    public void setBusinessLicenceEnd(Date businessLicenceEnd) {
        this.businessLicenceEnd = businessLicenceEnd;
    }

    /**
     * 法定经营范围
     * @return business_sphere 法定经营范围
     */
    public String getBusinessSphere() {
        return businessSphere;
    }

    /**
     * 法定经营范围
     * @param businessSphere 法定经营范围
     */
    public void setBusinessSphere(String businessSphere) {
        this.businessSphere = businessSphere == null ? null : businessSphere.trim();
    }

    /**
     * 营业执照电子版
     * @return business_licence_number_electronic 营业执照电子版
     */
    public String getBusinessLicenceNumberElectronic() {
        return businessLicenceNumberElectronic;
    }

    /**
     * 营业执照电子版
     * @param businessLicenceNumberElectronic 营业执照电子版
     */
    public void setBusinessLicenceNumberElectronic(String businessLicenceNumberElectronic) {
        this.businessLicenceNumberElectronic = businessLicenceNumberElectronic == null ? null : businessLicenceNumberElectronic.trim();
    }

    /**
     * 组织机构代码
     * @return organization_code 组织机构代码
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * 组织机构代码
     * @param organizationCode 组织机构代码
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    /**
     * 组织机构代码电子版
     * @return organization_code_electronic 组织机构代码电子版
     */
    public String getOrganizationCodeElectronic() {
        return organizationCodeElectronic;
    }

    /**
     * 组织机构代码电子版
     * @param organizationCodeElectronic 组织机构代码电子版
     */
    public void setOrganizationCodeElectronic(String organizationCodeElectronic) {
        this.organizationCodeElectronic = organizationCodeElectronic == null ? null : organizationCodeElectronic.trim();
    }

    /**
     * 一般纳税人证明
     * @return general_taxpayer 一般纳税人证明
     */
    public String getGeneralTaxpayer() {
        return generalTaxpayer;
    }

    /**
     * 一般纳税人证明
     * @param generalTaxpayer 一般纳税人证明
     */
    public void setGeneralTaxpayer(String generalTaxpayer) {
        this.generalTaxpayer = generalTaxpayer == null ? null : generalTaxpayer.trim();
    }

    /**
     * 银行开户名
     * @return bank_account_name 银行开户名
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * 银行开户名
     * @param bankAccountName 银行开户名
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * 公司银行账号
     * @return bank_account_number 公司银行账号
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * 公司银行账号
     * @param bankAccountNumber 公司银行账号
     */
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber == null ? null : bankAccountNumber.trim();
    }

    /**
     * 开户银行支行名称
     * @return bank_name 开户银行支行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 开户银行支行名称
     * @param bankName 开户银行支行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 支行联行号
     * @return bank_code 支行联行号
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 支行联行号
     * @param bankCode 支行联行号
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * 开户银行所在地
     * @return bank_address 开户银行所在地
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * 开户银行所在地
     * @param bankAddress 开户银行所在地
     */
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    /**
     * 开户银行许可证电子版
     * @return bank_licence_electronic 开户银行许可证电子版
     */
    public String getBankLicenceElectronic() {
        return bankLicenceElectronic;
    }

    /**
     * 开户银行许可证电子版
     * @param bankLicenceElectronic 开户银行许可证电子版
     */
    public void setBankLicenceElectronic(String bankLicenceElectronic) {
        this.bankLicenceElectronic = bankLicenceElectronic == null ? null : bankLicenceElectronic.trim();
    }

    /**
     * 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
     * @return is_settlement_account 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
     */
    public Byte getIsSettlementAccount() {
        return isSettlementAccount;
    }

    /**
     * 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
     * @param isSettlementAccount 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
     */
    public void setIsSettlementAccount(Byte isSettlementAccount) {
        this.isSettlementAccount = isSettlementAccount;
    }

    /**
     * 结算银行开户名
     * @return settlement_bank_account_name 结算银行开户名
     */
    public String getSettlementBankAccountName() {
        return settlementBankAccountName;
    }

    /**
     * 结算银行开户名
     * @param settlementBankAccountName 结算银行开户名
     */
    public void setSettlementBankAccountName(String settlementBankAccountName) {
        this.settlementBankAccountName = settlementBankAccountName == null ? null : settlementBankAccountName.trim();
    }

    /**
     * 结算公司银行账号
     * @return settlement_bank_account_number 结算公司银行账号
     */
    public String getSettlementBankAccountNumber() {
        return settlementBankAccountNumber;
    }

    /**
     * 结算公司银行账号
     * @param settlementBankAccountNumber 结算公司银行账号
     */
    public void setSettlementBankAccountNumber(String settlementBankAccountNumber) {
        this.settlementBankAccountNumber = settlementBankAccountNumber == null ? null : settlementBankAccountNumber.trim();
    }

    /**
     * 结算开户银行支行名称
     * @return settlement_bank_name 结算开户银行支行名称
     */
    public String getSettlementBankName() {
        return settlementBankName;
    }

    /**
     * 结算开户银行支行名称
     * @param settlementBankName 结算开户银行支行名称
     */
    public void setSettlementBankName(String settlementBankName) {
        this.settlementBankName = settlementBankName == null ? null : settlementBankName.trim();
    }

    /**
     * 结算支行联行号
     * @return settlement_bank_code 结算支行联行号
     */
    public String getSettlementBankCode() {
        return settlementBankCode;
    }

    /**
     * 结算支行联行号
     * @param settlementBankCode 结算支行联行号
     */
    public void setSettlementBankCode(String settlementBankCode) {
        this.settlementBankCode = settlementBankCode == null ? null : settlementBankCode.trim();
    }

    /**
     * 结算开户银行所在地
     * @return settlement_bank_address 结算开户银行所在地
     */
    public String getSettlementBankAddress() {
        return settlementBankAddress;
    }

    /**
     * 结算开户银行所在地
     * @param settlementBankAddress 结算开户银行所在地
     */
    public void setSettlementBankAddress(String settlementBankAddress) {
        this.settlementBankAddress = settlementBankAddress == null ? null : settlementBankAddress.trim();
    }

    /**
     * 税务登记证号
     * @return tax_registration_certificate 税务登记证号
     */
    public String getTaxRegistrationCertificate() {
        return taxRegistrationCertificate;
    }

    /**
     * 税务登记证号
     * @param taxRegistrationCertificate 税务登记证号
     */
    public void setTaxRegistrationCertificate(String taxRegistrationCertificate) {
        this.taxRegistrationCertificate = taxRegistrationCertificate == null ? null : taxRegistrationCertificate.trim();
    }

    /**
     * 纳税人识别号
     * @return taxpayer_id 纳税人识别号
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /**
     * 纳税人识别号
     * @param taxpayerId 纳税人识别号
     */
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId == null ? null : taxpayerId.trim();
    }

    /**
     * 税务登记证号电子版
     * @return tax_registration_certificate_electronic 税务登记证号电子版
     */
    public String getTaxRegistrationCertificateElectronic() {
        return taxRegistrationCertificateElectronic;
    }

    /**
     * 税务登记证号电子版
     * @param taxRegistrationCertificateElectronic 税务登记证号电子版
     */
    public void setTaxRegistrationCertificateElectronic(String taxRegistrationCertificateElectronic) {
        this.taxRegistrationCertificateElectronic = taxRegistrationCertificateElectronic == null ? null : taxRegistrationCertificateElectronic.trim();
    }

    /**
     * 卖家帐号
     * @return seller_name 卖家帐号
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * 卖家帐号
     * @param sellerName 卖家帐号
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
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
     * 店铺分类编号集合
     * @return store_class_ids 店铺分类编号集合
     */
    public String getStoreClassIds() {
        return storeClassIds;
    }

    /**
     * 店铺分类编号集合
     * @param storeClassIds 店铺分类编号集合
     */
    public void setStoreClassIds(String storeClassIds) {
        this.storeClassIds = storeClassIds == null ? null : storeClassIds.trim();
    }

    /**
     * 店铺分类名称集合
     * @return store_class_names 店铺分类名称集合
     */
    public String getStoreClassNames() {
        return storeClassNames;
    }

    /**
     * 店铺分类名称集合
     * @param storeClassNames 店铺分类名称集合
     */
    public void setStoreClassNames(String storeClassNames) {
        this.storeClassNames = storeClassNames == null ? null : storeClassNames.trim();
    }

    /**
     * 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
     * @return joinin_state 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
     */
    public String getJoininState() {
        return joininState;
    }

    /**
     * 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
     * @param joininState 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
     */
    public void setJoininState(String joininState) {
        this.joininState = joininState == null ? null : joininState.trim();
    }

    /**
     * 管理员审核信息
     * @return joinin_message 管理员审核信息
     */
    public String getJoininMessage() {
        return joininMessage;
    }

    /**
     * 管理员审核信息
     * @param joininMessage 管理员审核信息
     */
    public void setJoininMessage(String joininMessage) {
        this.joininMessage = joininMessage == null ? null : joininMessage.trim();
    }

    /**
     * 店铺等级名称
     * @return sg_name 店铺等级名称
     */
    public String getSgName() {
        return sgName;
    }

    /**
     * 店铺等级名称
     * @param sgName 店铺等级名称
     */
    public void setSgName(String sgName) {
        this.sgName = sgName == null ? null : sgName.trim();
    }

    /**
     * 店铺等级编号
     * @return sg_id 店铺等级编号
     */
    public Integer getSgId() {
        return sgId;
    }

    /**
     * 店铺等级编号
     * @param sgId 店铺等级编号
     */
    public void setSgId(Integer sgId) {
        this.sgId = sgId;
    }

    /**
     * 店铺分类名称
     * @return sc_name 店铺分类名称
     */
    public String getScName() {
        return scName;
    }

    /**
     * 店铺分类名称
     * @param scName 店铺分类名称
     */
    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    /**
     * 店铺分类编号
     * @return sc_id 店铺分类编号
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * 店铺分类编号
     * @param scId 店铺分类编号
     */
    public void setScId(Integer scId) {
        this.scId = scId;
    }

    /**
     * 分类佣金比例
     * @return store_class_commis_rates 分类佣金比例
     */
    public String getStoreClassCommisRates() {
        return storeClassCommisRates;
    }

    /**
     * 分类佣金比例
     * @param storeClassCommisRates 分类佣金比例
     */
    public void setStoreClassCommisRates(String storeClassCommisRates) {
        this.storeClassCommisRates = storeClassCommisRates == null ? null : storeClassCommisRates.trim();
    }

    /**
     * 付款凭证
     * @return paying_money_certificate 付款凭证
     */
    public String getPayingMoneyCertificate() {
        return payingMoneyCertificate;
    }

    /**
     * 付款凭证
     * @param payingMoneyCertificate 付款凭证
     */
    public void setPayingMoneyCertificate(String payingMoneyCertificate) {
        this.payingMoneyCertificate = payingMoneyCertificate == null ? null : payingMoneyCertificate.trim();
    }

    /**
     * 付款凭证说明
     * @return paying_money_certificate_explain 付款凭证说明
     */
    public String getPayingMoneyCertificateExplain() {
        return payingMoneyCertificateExplain;
    }

    /**
     * 付款凭证说明
     * @param payingMoneyCertificateExplain 付款凭证说明
     */
    public void setPayingMoneyCertificateExplain(String payingMoneyCertificateExplain) {
        this.payingMoneyCertificateExplain = payingMoneyCertificateExplain == null ? null : payingMoneyCertificateExplain.trim();
    }

    /**
     * 运货车辆
     * @return car_num 运货车辆
     */
    public Integer getCarNum() {
        return carNum;
    }

    /**
     * 运货车辆
     * @param carNum 运货车辆
     */
    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    /**
     * 仓库面积
     * @return warehouse_area 仓库面积
     */
    public Integer getWarehouseArea() {
        return warehouseArea;
    }

    /**
     * 仓库面积
     * @param warehouseArea 仓库面积
     */
    public void setWarehouseArea(Integer warehouseArea) {
        this.warehouseArea = warehouseArea;
    }

    /**
     * 打单设备数量
     * @return single_device_num 打单设备数量
     */
    public Integer getSingleDeviceNum() {
        return singleDeviceNum;
    }

    /**
     * 打单设备数量
     * @param singleDeviceNum 打单设备数量
     */
    public void setSingleDeviceNum(Integer singleDeviceNum) {
        this.singleDeviceNum = singleDeviceNum;
    }

    /**
     * 电脑设备数量
     * @return computer_num 电脑设备数量
     */
    public Integer getComputerNum() {
        return computerNum;
    }

    /**
     * 电脑设备数量
     * @param computerNum 电脑设备数量
     */
    public void setComputerNum(Integer computerNum) {
        this.computerNum = computerNum;
    }

    /**
     * 合作物流公司
     * @return logistics_name 合作物流公司
     */
    public String getLogisticsName() {
        return logisticsName;
    }

    /**
     * 合作物流公司
     * @param logisticsName 合作物流公司
     */
    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName.trim();
    }

    /**
     * 房屋租赁协议电子版
     * @return rental_agreement 房屋租赁协议电子版
     */
    public String getRentalAgreement() {
        return rentalAgreement;
    }

    /**
     * 房屋租赁协议电子版
     * @param rentalAgreement 房屋租赁协议电子版
     */
    public void setRentalAgreement(String rentalAgreement) {
        this.rentalAgreement = rentalAgreement == null ? null : rentalAgreement.trim();
    }

    /**
     * 打单设备照片
     * @return single_device_img 打单设备照片
     */
    public String getSingleDeviceImg() {
        return singleDeviceImg;
    }

    /**
     * 打单设备照片
     * @param singleDeviceImg 打单设备照片
     */
    public void setSingleDeviceImg(String singleDeviceImg) {
        this.singleDeviceImg = singleDeviceImg == null ? null : singleDeviceImg.trim();
    }
}