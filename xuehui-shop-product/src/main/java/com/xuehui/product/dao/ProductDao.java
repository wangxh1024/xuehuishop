package com.xuehui.product.dao;

import com.xuehui.product.mapper.ProductMapper;
import com.xuehui.product.model.Product;
import com.xuehui.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDao {
    @Autowired
    ProductMapper productMapper;

    public void insertProduct(Product product){

        productMapper.insertProduct(product);
    }

    public void auditProduct(Product product){
        productMapper.auditProduct(product);
    }


    public Product findproductbyid(int id){
        return productMapper.findproductbyid(id);
    }


    public void upateProduct(Product product){
         productMapper.upateProduct(product);
    }
    public void deleteProductbyid(int id){
        productMapper.deleteProductbyid(id);
    }
    public List<Product> queryProductbyvo(ProductVo productVo){
        return productMapper.queryProductbyvo(productVo);
    }
}
