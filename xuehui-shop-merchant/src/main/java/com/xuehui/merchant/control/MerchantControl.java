package com.xuehui.merchant.control;

import com.xuehui.merchant.model.Merchant;
import com.xuehui.merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MerchantControl {

    @Autowired
	MerchantService MerchantService;

    @RequestMapping(value = "/insertMerchant",method = RequestMethod.POST)
    public void insertMerchant(Merchant Merchant){
        MerchantService.insertMerchant(Merchant);
    }

    @RequestMapping(value = "/toinsertMerchant",method = RequestMethod.GET)
    public String toinsertMerchant(){
        return "Merchantregister";
    }

    @RequestMapping(value = "/toupateMerchant",method = RequestMethod.GET)
    public String toupateMerchant(Model model,int id){
        Merchant Merchant = MerchantService.findMerchantbyid(id);
        model.addAttribute("Merchant",Merchant);
        return "Merchantupdate";
    }

    @RequestMapping(value = "/upateMerchant",method = RequestMethod.POST)
    public void upateMerchant(Merchant Merchant){
        MerchantService.upateMerchant(Merchant);
    }

    @RequestMapping(value = "/findMerchantbyid",method = RequestMethod.GET)
    public String findMerchantbyid(Model model,int id){
        Merchant Merchant = MerchantService.findMerchantbyid(id);
        model.addAttribute("Merchant",Merchant);
        return "Merchantview";
    }
}
