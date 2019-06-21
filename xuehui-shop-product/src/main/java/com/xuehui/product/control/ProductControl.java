package com.xuehui.product.control;

import com.netflix.discovery.converters.Auto;
import com.xuehui.order.model.product.Product;
import com.xuehui.product.api.ProductTypeApi;
import com.xuehui.product.service.ProductService;
import com.xuehui.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class ProductControl {

    @Autowired
    ProductService productService;

    @Autowired
    private ProductTypeApi productTypeApi;

    @RequestMapping(value = "/insertProduct",method = RequestMethod.POST)
    public void insertProduct(Product product){
        product.setCreateTime(new Date());
        product.setSellNum(0);
        productService.insertProduct(product);
    }


    @RequestMapping(value = "/toinsertProduct",method = RequestMethod.GET)
    public String toinsertProduct(Product product){
        return "addproduct";
    }

    @RequestMapping(value = "/toAuditProduct",method = RequestMethod.GET)
    public String toAuditProduct(int id,Model model){
        Product product = productService.findproductbyid(id);
        model.addAttribute("product",product);
        return "auditproduct";
    }

    @RequestMapping(value = "/auditProduct",method = RequestMethod.POST)
    public void auditProduct(Product product){
        productService.auditProduct(product.getId(),product.getAuditState());
    }

    @RequestMapping(value = "/listProduct",method = RequestMethod.GET)
    public String listProduct(Model model){
        ProductVo productvo = new ProductVo();
        List<Product> list = productService.queryProductbyvo(productvo);
        model.addAttribute("list",list);
        return "listProduct";
    }


    @RequestMapping(value = "/viewProduct",method = RequestMethod.GET)
    public String viewProduct(int id,Model model){
        Product product = productService.findproductbyid(id);
        model.addAttribute("product",product);
        return "viewproduct";
    }


    @RequestMapping(value = "/deleteProduct",method = RequestMethod.GET)
    public String deleteProduct(int id){
        productService.deleteProductbyid(id);
        return "listProduct";
    }

    @RequestMapping(value = "/toupdateProduct",method = RequestMethod.GET)
    public String toupdateProduct(int id,Model model){
        Product product = productService.findproductbyid(id);
        model.addAttribute("product",product);
        return "updateproduct";
    }

    @RequestMapping(value = "/updateProduct",method = RequestMethod.POST)
    public void updateProduct(Product product){
        productService.upateProduct(product);
    }


    @ResponseBody
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(String name){
        return productTypeApi.test(name);
    }
}
