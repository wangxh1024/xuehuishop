package com.xuehui.product.mapper;

import com.xuehui.order.model.product.Product;
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
