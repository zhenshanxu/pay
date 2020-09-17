package com.pay.mobile.controller;

import com.alipay.api.AlipayApiException;
import com.pay.mobile.Bean.AliPayBean;
import com.pay.mobile.Service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: mobile-pay
 * @BelongsPackage: com.pay.mobile.controller
 * @Author: ZhenShanXu
 * @CreateTime: 2020-09-17 10:30.
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PayService payService;//调用支付服务

    /*阿里支付*/
    @PostMapping(value = "alipay")
    public String alipay(String out_trade_no, String subject, String total_amount, String body) throws AlipayApiException {
        return payService.aliPay(new AliPayBean()
                .setBody(body)
                .setOut_trade_no(out_trade_no)
                .setTotal_amount(new StringBuffer().append(total_amount))
                .setSubject(subject));
    }

}
