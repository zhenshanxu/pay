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
<%@ page import="com.pay.mobile.PayConfig.PropertiesConfig" %>
<%
	//获得初始化的AlipayClient
	AlipayClient alipayClient = new DefaultAlipayClient(PropertiesConfig.GATEWAYURL, PropertiesConfig.APP_ID, PropertiesConfig.MERCHANT_PRIVATE_KEY, "json", PropertiesConfig.CHARSET, PropertiesConfig.ALIPAY_PUBLIC_KEY, PropertiesConfig.SIGN_TYPE);
//    AlipayClient alipayClient = new
//            DefaultAlipayClient ("https://openapi.alipaydev.com/gateway.do","2021000116658892","IIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC3okjkskT3kCHEHYkIyHjotc3pZ+HXZtpcbu5lFSCTZt9a3A78QWidu0C/IOxLbCIYnf5F4RULAHBk2HilI8d57fu11nfxQj/vQ4W/1tdOR2RO/P3zUcf3rjB/1BTXI6PVx/2DybpJ04tMn8hucPEwJMuO3rwMLGo1vogd0RZMXpGXK60nW6NjQUmvvZjWnQcKE/hgrf/JFSQlGsPOz8Cr/e4NOEnzh7OR1aVYzIWPiq4dYmptgGP+D4jsVU+ved9eu+5mgj3l7LU30Ku9bgt8OMmjQZI4Dc7A/bgUxoSXUqz9oKa2PSKGJSNp4QnNSkw5lmMZkVJIPzusRYRXcDuRAgMBAAECggEANmrcCRGfCHHo37IU8spdsjB2Fa3YKjnriarB8KiDH8tDcyx1MGG9u8hK1pjODUe9Duh6+oBJ+RmnNOtFTUK+ES7qAafNoWwNgDzVPNVQtnzHh/TG2L0qcgZnjuntRxfjrC14vf4gu1H6HLnY7ol/n9G3lN4CgeUDkGum8JcOcZCvrczFaf+Gr+MLLzmR2MM1hjCmVoiBTW8EdjF5WYSEsUs2DnwgH0UowzSEJJ6dDlcxkH97htOTZx4GXZ9ztv2u0VmqnKmux+kBDF+3J458jpvLLtG3vyHEekoHMRzimJ6D2ihhedJ71u//FfBtaD36I2l2NDm7CLILn5yNmqpgQQKBgQDttwmAmJ4SJthlNjdjJV6RhDtnds/dAzK4+zwXz9oNTNmkmljCBvOloSbD7lVzMprB7mrLB1eX/eEt4aDztkOqw2L8lDLA6R9omqs4SdxJvy3VpA3cthULDeOPCF7jjvTuRS4T/AkAHRQ2uPvaR1zRZLSnkU9/EygpelblJoZoeQKBgQDFwk+ONcCTrqvkxjs0mAo+McIY/4A0s2ZNTe9/Y7VihKUKTLXDfJIM6D5D9bSltSiNUcre6sqVvG9mhxNNS+hsYLWSgEBIs5FZkP73hw53a1arx6tPvAeqMUUWJOiMirRXiggz0S4CacDzkpjfbEIMSRU5l5M0cUa7R7FPs/3V2QKBgBV3N9Zy8aM1+sh48ttzHm0JgcvAANk2Vrg5h52m2UvmKqkgfu9WbV4BhVygAvtaEHt+qgoXaaOB+3mHLF+Vj9q1thSU1VhyNLHfdaKpmMjYCK2IGPBbSN8sq+XYnajy2c9CU/zd/3oRJigi4Cs/0nPeIioXhxQ0iKXmND6REgYRAoGAHkyEFdzEcZwMeBOrFIbK4vaKr3vN78Ugwm1TaWgkbUC3bJmOK7JVSib3C0CE+fKEkQpcE8VTXpetVb8SRQCBTsGOcDC4KKtidJ+TgOcvXzqR3+XKqH+9iOTdmePzwTyrHtJmKVI+Q15ikq7+PxT+FZXI67b+dcV5Oc5lKzn/hRkCgYBZN/G8KIyl1f3nnaWw5w7l4qq7LGZJk3dLKPXnQiDR+ONgbKJYMyaWaKZ/MbLd98QAH/hLK578MQi2rXLqmV/KJSl4MfV5GQiqHdktKQ3ekw9ERYXuPemU1lXySSinMbQSYIQK+t2bfgjplSnA0/AFVi41WH9si6XKGqkofYJNTw==","json","utf-8",
//            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjS4z5mnok3XWl1SjimLPNcMTXW2XuKgQ/M6tEfYAJjM7U/IP8+OId3Wc8NCjlvhj++6neY8DibGYCjjTps5avGmS4FpHXC9mB9cDjkguFAHNTurs9TwWRfv4Q3KLyRFQ4D+25Ly9rvkZqPX9I/T+LG59lIFyNHS02uLpTCXjxGexT1qne2Aog1MYH8wDrApWwNP0J9CrU5mfD81KGcQXQaCON05TofZVgMIUmajCN6dsQuuXUQAPcKnfj4zubQ9TCe2bRVmKejgJkw+Lnm16pOd2N/k7Tfn0J9eJUmEp6SKDR9NEUXexPo1qt1lWKRA6htC/TKLn3nRjXZ+vPxXOswIDAQAB","RSA2" );

	//设置请求参数
	AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	alipayRequest.setReturnUrl(PropertiesConfig.RETURN_URL);
	alipayRequest.setNotifyUrl(PropertiesConfig.NOTIFY_URL);
	
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
//	out.println(result);
    System.out.println(result);
%>
<body>
</body>
</html>