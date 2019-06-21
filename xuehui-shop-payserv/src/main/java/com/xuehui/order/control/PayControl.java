package com.xuehui.order.control;

import com.xuehui.user.service.impl.WeiXinPayService;
import com.xuehui.user.service.impl.YinLianPayService;
import com.xuehui.user.service.impl.ZhifuBaoPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Controller
public class PayControl {
    @Autowired
    WeiXinPayService weiXinPayService;
    @Autowired
    YinLianPayService yinLianPayService;
    @Autowired
    ZhifuBaoPayService zhifuBaoPayService;

    /**
     *
     * @param paytype 1 微信支付 2 支付宝支付 3 银联卡支付
     * @param tradenumber
     * @param amount
     * @return 1支付成功 2支付失败
     */
    @RequestMapping(value = "payWithAmout")
    public int payWithAmout(String paytype,String tradenumber,int amount){
        int payresult = 2;
        if("1".equals(paytype)){
            payresult = weiXinPayService.payWithpayAmount(tradenumber,amount);
        }else if("2".equals(paytype)){
            payresult = yinLianPayService.payWithpayAmount(tradenumber,amount);
        }else if("3".equals(paytype)){
            payresult =zhifuBaoPayService.payWithpayAmount(tradenumber,amount);
        }
        return payresult;
    }
}
