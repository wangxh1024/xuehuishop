package com.xuehui.producttype.Control;

import com.xuehui.order.model.producttype.ProductType;
import com.xuehui.producttype.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;

    @ResponseBody
    @RequestMapping(value = "/insertProducttype",method = RequestMethod.POST)
    public void insertProducttype(ProductType productType){
        productTypeService.insertProducttype(productType);
    }

    @RequestMapping(value = "/findProductytpeByid",method = RequestMethod.GET)
    public String findProductytpeByid(int id, Model model){
        ProductType productType = productTypeService.findProductytpeByid(id);
        if(productType == null){
            productType = new ProductType();
            productType.setId(-1);
        }
        model.addAttribute("productType",productType);
        return "producttypeadd";
    }

    @ResponseBody
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(String name){
        return "hello:" + name;
    }
}
