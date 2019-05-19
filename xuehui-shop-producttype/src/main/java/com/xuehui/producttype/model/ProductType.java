package com.xuehui.producttype.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductType implements Serializable {
    private int id;
    private String productTypeName;
    private String productTypeDescription;
    private String typeGrade;//等级比如1,2,3 1是最大的分类
    private int parentId;//如果是第一类别，父节点就为-1
}
