package com.xuehui.product.mapper;

import com.xuehui.product.model.Product;
import com.xuehui.product.vo.ProductVo;

import java.util.List;

public interface ProductMapper {
    void insertProduct(Product product);
    void auditProduct(Product product);
    Product findproductbyid(int id);
    void upateProduct(Product product);
    void deleteProductbyid(int id);
    List<Product> queryProductbyvo(ProductVo productVo);
}
