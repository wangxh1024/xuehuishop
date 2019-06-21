package com.xuehui.producttype.service;

import com.xuehui.order.model.producttype.ProductType;
import com.xuehui.producttype.dao.ProducttypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    ProducttypeDao producttypeDao;

    public void insertProducttype(ProductType productType){
        producttypeDao.insertProducttype(productType);
    }
    public ProductType findProductytpeByid(int id){
        return producttypeDao.findProductytpeByid(id);
    }
}
