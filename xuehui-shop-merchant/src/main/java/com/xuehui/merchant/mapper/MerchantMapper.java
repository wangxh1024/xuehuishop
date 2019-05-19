package com.xuehui.merchant.mapper;

import com.xuehui.merchant.model.Merchant;

public interface MerchantMapper {
     void insertMerchant(Merchant Merchant);
     void upateMerchant(Merchant Merchant);
     Merchant findMerchantbyid(int id);
}
