package com.xuehui.producttype.dao;

import com.xuehui.producttype.mapper.ProducttypeMapper;
import com.xuehui.producttype.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducttypeDao {

    @Autowired
    ProducttypeMapper producttypeMapper;

    public void insertProducttype(ProductType productType){
        producttypeMapper.insertProducttype(productType);
    }
    public ProductType findProductytpeByid(int id){
        return producttypeMapper.findProductytpeByid(id);
    }

}
