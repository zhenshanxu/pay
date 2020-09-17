package com.pay.mobile.Service;

import com.alipay.api.AlipayApiException;
import com.pay.mobile.Bean.AliPayBean;

/**
 * @BelongsProject: mobile-pay
 * @BelongsPackage: com.pay.mobile.Service.impl
 * @Author: ZhenShanXu
 * @CreateTime: 2020-09-17 10:21.
 * @Description:
 */

public interface PayService {

    String aliPay(AliPayBean alipayBean) throws ArithmeticException, AlipayApiException;
}
