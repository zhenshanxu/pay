package com.pay.mobile.PayConfig;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.pay.mobile.Bean.AliPayBean;

/**
 * @BelongsProject: mobile-pay
 * @BelongsPackage: com.pay.mobile.PayConfig
 * @Author: ZhenShanXu
 * @CreateTime: 2020-09-17 10:25.
 * @Description:
 */

public class AliPayUtil {

    public static String connect(AliPayBean alipayBean) throws AlipayApiException {
        //1、获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(
                PropertiesConfig.GATEWAYURL,//支付宝网关
                PropertiesConfig.APP_ID,//appid
                PropertiesConfig.MERCHANT_PRIVATE_KEY,//商户私钥
                PropertiesConfig.FORMAT,//参数格式
                PropertiesConfig.CHARSET,//字符编码格式
                PropertiesConfig.ALIPAY_PUBLIC_KEY,//支付宝公钥
                PropertiesConfig.SIGN_TYPE//签名方式
        );
        //2、设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        //页面跳转同步通知页面路径
//        alipayRequest.setReturnUrl(PropertiesConfig.getKey("return_url"));
        alipayRequest.setReturnUrl(PropertiesConfig.RETURN_URL);
        // 服务器异步通知页面路径
//        alipayRequest.setNotifyUrl(PropertiesConfig.getKey("notify_url"));
        alipayRequest.setNotifyUrl(PropertiesConfig.NOTIFY_URL);
        //封装参数
        alipayRequest.setBizContent(JSON.toJSONString(alipayBean));

        //3、请求支付宝进行付款，并获取支付结果
        String result = alipayClient.pageExecute(alipayRequest).getBody();

        //返回付款信息
        return result;
    }

}
