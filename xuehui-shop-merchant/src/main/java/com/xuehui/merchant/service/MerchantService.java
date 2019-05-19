package com.xuehui.merchant.service;

import com.xuehui.merchant.dao.MerchantDao;
import com.xuehui.merchant.model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    @Autowired
	MerchantDao MerchantDao;

    public void insertMerchant(Merchant Merchant){
        Merchant.setAuditStatus(1);
        MerchantDao.insertMerchant(Merchant);
    }

    public void upateMerchant(Merchant Merchant){
        MerchantDao.upateMerchant(Merchant);
    }

    public Merchant findMerchantbyid(int id){
        return MerchantDao.findMerchantbyid(id);
    }
}
