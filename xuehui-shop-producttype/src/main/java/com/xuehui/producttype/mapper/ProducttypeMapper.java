package com.xuehui.producttype.mapper;

import com.xuehui.producttype.model.ProductType;

public interface ProducttypeMapper {
    void insertProducttype(ProductType productType);
    ProductType findProductytpeByid(int id);
}
