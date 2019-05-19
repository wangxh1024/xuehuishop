package com.xuehui.merchant.dao;

import com.xuehui.merchant.mapper.MerchantMapper;
import com.xuehui.merchant.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MerchantDao {
    @Autowired
    MerchantMapper merchantMapper;

    public void insertMerchant(Merchant Merchant){
        merchantMapper.insertMerchant(Merchant);
    }

    public void upateMerchant(Merchant Merchant){
        merchantMapper.upateMerchant(Merchant);
    }
    public Merchant findMerchantbyid(int id){
        return merchantMapper.findMerchantbyid(id);
    }
}
