package com.xuehui.producttype.mapper;

import com.xuehui.order.model.producttype.ProductType;

public interface ProducttypeMapper {
    void insertProducttype(ProductType productType);
    ProductType findProductytpeByid(int id);
}
