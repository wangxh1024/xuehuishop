package com.xuehui.product.service;

import com.xuehui.product.dao.ProductDao;
import com.xuehui.product.model.Product;
import com.xuehui.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
@Service
public class ProductService {
@Autowired
ProductDao productDao;
    public void insertProduct(Product product){

        productDao.insertProduct(product);
    }

    public void auditProduct(int id,int auditstate){
        Product product = new Product();
        product.setId(id);
        product.setAuditState(auditstate);
        product.setAuditTime(new Date());
        productDao.auditProduct(product);
    }


    public Product findproductbyid(int id){
        return productDao.findproductbyid(id);
    }


    public void upateProduct(Product product){
        productDao.upateProduct(product);
    }
    public void deleteProductbyid(int id){
        productDao.deleteProductbyid(id);
    }
    public List<Product> queryProductbyvo(ProductVo productVo){
        return productDao.queryProductbyvo(productVo);
    }
}
