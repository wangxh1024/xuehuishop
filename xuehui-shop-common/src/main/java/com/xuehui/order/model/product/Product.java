package com.xuehui.order.model.product;

import lombok.Data;

import java.util.Date;

@Data
public class Product {

  private int id;//主键
  private int productTypeId;//商品类别
  private String productTitle;//商品标题
    private int productPrice ;//商品价格
    private int merchantId;//商家id
    private Date createTime;//创建时间
    private Date auditTime;//审核时间
    private int  auditState;//审核转态,0,未审核 1 审核通过 2 审核不通过
    private int      stockNum;//库存
    private int  sellNum;//销售数量
    private String   productPicurl;//商品图片地址

}
