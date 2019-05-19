package com.xuehui.product.model;

import lombok.Data;

@Data
public class ProductDetail {

    private int id;//主键
    private int proudctId;//商品id
    private String productPlace;//商品产地
    private String  productTitle;//商品标题
    private String   productBrand;//商品品牌
    private String   productWeight;//商品重量
    private String    productSpecification;//商品规格说明和包装
    private String     productDetaiPicurl;//商品详情图片地址

}
