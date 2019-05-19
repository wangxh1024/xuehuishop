package com.xuehui.merchant.model;

import lombok.Data;

@Data
public class Merchant {
    private int id;
    private String merchantName;
    private String merchantShopName;
    private String merchantAccount;
    private String MerchantPassword;
    private String MerchantScope;
    private int auditStatus;//1提交成功，2审核通过，3审核不通过
}
