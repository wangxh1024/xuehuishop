package com.xuehui.producttype.dao;

import com.xuehui.order.model.producttype.ProductType;
import com.xuehui.producttype.mapper.ProducttypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class ProducttypeDao {

    @Autowired(required = false)
    ProducttypeMapper producttypeMapper;

    public void insertProducttype(ProductType productType){
        producttypeMapper.insertProducttype(productType);
    }
    public ProductType findProductytpeByid(int id){
        return producttypeMapper.findProductytpeByid(id);
    }

}
