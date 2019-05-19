package com.xuehui.producttype.Control;

import com.xuehui.producttype.model.ProductType;
import com.xuehui.producttype.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductTypeContral {

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
}
