package com.xuehui.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Data
public class Order {
   private int id;//主键
    private int payamount;//支付金额
    private int userid;//用户id
    private Date createtime;//创建时间
    private Date paytime;//支付时间
    private int  paystatus;//支付状态 支付状态,1未支付 2已支付 3已退款
    private String consigneeaddress;//收货人地址
    private String consigneephone;//收货人电话
    private String consigneename;//收货人姓名
    private String tradenumber;//交易流水号
    private int paytype;//支付类型
    private int orderstatus;//订单状态 0 正常，1 取消
}
