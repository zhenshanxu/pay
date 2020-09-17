<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>付款</title>
</head>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.alipay.config.*"%>
<%@ page import="com.alipay.api.*"%>
<%@ page import="com.alipay.api.request.*"%>
<%
	//获得初始化的AlipayClient
//	AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
    AlipayClient alipayClient = new
            DefaultAlipayClient ("https://openapi.alipaydev.com/gateway.do","2021000116658892","MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC8xTFIXhZ4PYZ/m6R/ZuO4FKT+cGRDHRfGiOmanuDmZ02uzCVsgibXVaxmzqm2GVDxzlrs6RRxd8oj0VnVG/wFKnjr4XHKlw2MZDo3KgmafpPb+IagsswU9wbrnlml+f8fYdv9o93mizUKUgSxvdGbCDPLB1p4F7bckmbr/VN4PStekHF5mc0qX89R5EZoy6Ryoqt938apph6Rw63k5/qIQ+ZfzxGQiiST7aFsY2fvQyZNeHAOiRAqIRpbRt+Z7diVXaI9aVHQNet8YCw+YM7nKr+91WoCO5ZnQrIAkOd6dYliQs5HFkObmbvuQU8wupICZhqzMtkiSjnIozEvnoXfAgMBAAECggEAZ8hGSxInal3xFzE75CtuISOAfr7N8LQLAUT+odqdrS64X9Su8pQvxI2+phsS5SHQBdE83ila6vM/+Cc+K1MiYLi0GIMu64HWmgv0kaWT+BOFORfO9IS4fQI/FMVPZlgmsls79pvkAL8iHxVurUW9+m0tBH97drEbAPOgkDgLbvvISgflfRrwZAIbsJNHjLWXd/CLFUOA/PIWj1SJLxLqh8OOtk+UNkLmvCqVN6ZEGiZZgcSEE6BrlT4JGfXKotaJEEThLV6dxw90fPND98iP/RcFsxuW+SfDa7dHlNFWWp2o6UDMAuQiYK7dDufmlbg8Jf0uNvv5taWA1ypuqcPXUQKBgQDoNQUJ7+OGNCuATSLxiHS136eHRFrhk+8BbVWDwmlcVKueiBz1/qcU0Y/SshinHzD5QOJm+CgPFu2lHzrR4v5pcuhH91kXniMhRI/LkrXhpcDIJuJsUFk2ANwY13OoHdyx6m10g2shUhxdREDgAHtKJe0yOFzLRKYpAQTg8Ctu5wKBgQDQHMouM1ysL9uZDgqpSnOe4XoWFHvVjqYZ1BJ6ZUCdkkvyxLAUPRhc/XMFMzVcn1A2TI1as5LHwRsDqxsiG8oZG9ZC9d7su269JFdH3A5Xaee772lRJRKCQHvKVWSk9NJII8MYldjsd9HV9WLOe7tezwqhTQPDRBuKJkwwJWYqSQKBgQCDTxgeWm1LQs0mrHgKJaP6BRNzRpAt573MDMvCynlSIP87krTt1qcc+rRd7SBLwTOsf6iHmeTtQ4X3TgWxEq/TaYs4xwK2fFJZSbAW6ku34kd156c6oOURyMKtuYhJlTlr0qk6reYy3X/0rdgR07PkZjYPpBe1Soi7vzvHB4lIGQKBgQDFWCeYu/fLB+7TKm+NrR4KsYGV4oKzNfvoTiPfkJg/U3VVlpHp/y1VMLmbWr3lQOVNODZqphIv/bviNKUcKQHx4WXCRWjJT8to7Ecfy1qGJdUrb5GM8vykKwW4DlXL3qRw6AifDamQQubmXzT83HQHKYnI/0DsL292B28D0NMakQKBgDOKBXVJthVBu1Z8jKBdpGYiBULYdHGIvVzj8m3jVuhl0aJvmwHVy79Hy65PzYe02II2h74xhd4irWSG45gTdeT+4J/+WM1TR+mDDzwtpupWnL912Zu+or79uP8d00GGYfV7BO3Md8NpdyAHAWBbH2tM8/Igp4m+5EcufJRGHHUt","json","utf-8",
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjS4z5mnok3XWl1SjimLPNcMTXW2XuKgQ/M6tEfYAJjM7U/IP8+OId3Wc8NCjlvhj++6neY8DibGYCjjTps5avGmS4FpHXC9mB9cDjkguFAHNTurs9TwWRfv4Q3KLyRFQ4D+25Ly9rvkZqPX9I/T+LG59lIFyNHS02uLpTCXjxGexT1qne2Aog1MYH8wDrApWwNP0J9CrU5mfD81KGcQXQaCON05TofZVgMIUmajCN6dsQuuXUQAPcKnfj4zubQ9TCe2bRVmKejgJkw+Lnm16pOd2N/k7Tfn0J9eJUmEp6SKDR9NEUXexPo1qt1lWKRA6htC/TKLn3nRjXZ+vPxXOswIDAQAB","RSA2" );

	//设置请求参数
	AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	alipayRequest.setReturnUrl(AlipayConfig.return_url);
	alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
	
	//商户订单号，商户网站订单系统中唯一订单号，必填
	String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
	//付款金额，必填
	String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
	//订单名称，必填
	String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
	//商品描述，可空
	String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
	
	alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
			+ "\"total_amount\":\""+ total_amount +"\"," 
			+ "\"subject\":\""+ subject +"\"," 
			+ "\"body\":\""+ body +"\"," 
			+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
	
	//若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
	//alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
	//		+ "\"total_amount\":\""+ total_amount +"\"," 
	//		+ "\"subject\":\""+ subject +"\"," 
	//		+ "\"body\":\""+ body +"\"," 
	//		+ "\"timeout_express\":\"10m\"," 
	//		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
	//请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节
	
	//请求
	String result = alipayClient.pageExecute(alipayRequest).getBody();
	
	//输出
	out.println(result);
%>
<body>
</body>
</html>