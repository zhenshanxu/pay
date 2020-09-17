package com.pay.mobile.Service.impl;

import com.alipay.api.AlipayApiException;
import com.pay.mobile.Bean.AliPayBean;
import com.pay.mobile.PayConfig.AliPayUtil;
import com.pay.mobile.Service.PayService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: mobile-pay
 * @BelongsPackage: com.pay.mobile.Service.impl
 * @Author: ZhenShanXu
 * @CreateTime: 2020-09-17 10:23.
 * @Description:
 */
@Service
public class PayServiceImpl implements PayService {

    @Override
    public String aliPay(AliPayBean aliPayBean) throws ArithmeticException, AlipayApiException {
        return AliPayUtil.connect(aliPayBean);
    }
}
