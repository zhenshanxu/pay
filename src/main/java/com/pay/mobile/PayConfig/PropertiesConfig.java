package com.pay.mobile.PayConfig;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: mobile-pay
 * @BelongsPackage: com.pay.mobile.PayConfig
 * @Author: ZhenShanXu
 * @CreateTime: 2020-09-17 10:33.
 * @Description:
 */

@Component
public class PropertiesConfig {

    /**
     * appid
     */
    public static final String APP_ID = "2021000116658892";

    /**
     * 商户私钥
     */
    public static final String MERCHANT_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC3okjkskT3kCHEHYkIyHjotc3pZ+HXZtpcbu5lFSCTZt9a3A78QWidu0C/IOxLbCIYnf5F4RULAHBk2HilI8d57fu11nfxQj/vQ4W/1tdOR2RO/P3zUcf3rjB/1BTXI6PVx/2DybpJ04tMn8hucPEwJMuO3rwMLGo1vogd0RZMXpGXK60nW6NjQUmvvZjWnQcKE/hgrf/JFSQlGsPOz8Cr/e4NOEnzh7OR1aVYzIWPiq4dYmptgGP+D4jsVU+ved9eu+5mgj3l7LU30Ku9bgt8OMmjQZI4Dc7A/bgUxoSXUqz9oKa2PSKGJSNp4QnNSkw5lmMZkVJIPzusRYRXcDuRAgMBAAECggEANmrcCRGfCHHo37IU8spdsjB2Fa3YKjnriarB8KiDH8tDcyx1MGG9u8hK1pjODUe9Duh6+oBJ+RmnNOtFTUK+ES7qAafNoWwNgDzVPNVQtnzHh/TG2L0qcgZnjuntRxfjrC14vf4gu1H6HLnY7ol/n9G3lN4CgeUDkGum8JcOcZCvrczFaf+Gr+MLLzmR2MM1hjCmVoiBTW8EdjF5WYSEsUs2DnwgH0UowzSEJJ6dDlcxkH97htOTZx4GXZ9ztv2u0VmqnKmux+kBDF+3J458jpvLLtG3vyHEekoHMRzimJ6D2ihhedJ71u//FfBtaD36I2l2NDm7CLILn5yNmqpgQQKBgQDttwmAmJ4SJthlNjdjJV6RhDtnds/dAzK4+zwXz9oNTNmkmljCBvOloSbD7lVzMprB7mrLB1eX/eEt4aDztkOqw2L8lDLA6R9omqs4SdxJvy3VpA3cthULDeOPCF7jjvTuRS4T/AkAHRQ2uPvaR1zRZLSnkU9/EygpelblJoZoeQKBgQDFwk+ONcCTrqvkxjs0mAo+McIY/4A0s2ZNTe9/Y7VihKUKTLXDfJIM6D5D9bSltSiNUcre6sqVvG9mhxNNS+hsYLWSgEBIs5FZkP73hw53a1arx6tPvAeqMUUWJOiMirRXiggz0S4CacDzkpjfbEIMSRU5l5M0cUa7R7FPs/3V2QKBgBV3N9Zy8aM1+sh48ttzHm0JgcvAANk2Vrg5h52m2UvmKqkgfu9WbV4BhVygAvtaEHt+qgoXaaOB+3mHLF+Vj9q1thSU1VhyNLHfdaKpmMjYCK2IGPBbSN8sq+XYnajy2c9CU/zd/3oRJigi4Cs/0nPeIioXhxQ0iKXmND6REgYRAoGAHkyEFdzEcZwMeBOrFIbK4vaKr3vN78Ugwm1TaWgkbUC3bJmOK7JVSib3C0CE+fKEkQpcE8VTXpetVb8SRQCBTsGOcDC4KKtidJ+TgOcvXzqR3+XKqH+9iOTdmePzwTyrHtJmKVI+Q15ikq7+PxT+FZXI67b+dcV5Oc5lKzn/hRkCgYBZN/G8KIyl1f3nnaWw5w7l4qq7LGZJk3dLKPXnQiDR+ONgbKJYMyaWaKZ/MbLd98QAH/hLK578MQi2rXLqmV/KJSl4MfV5GQiqHdktKQ3ekw9ERYXuPemU1lXySSinMbQSYIQK+t2bfgjplSnA0/AFVi41WH9si6XKGqkofYJNTw==";

    /**
     * 支付宝公钥
     */
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjS4z5mnok3XWl1SjimLPNcMTXW2XuKgQ/M6tEfYAJjM7U/IP8+OId3Wc8NCjlvhj++6neY8DibGYCjjTps5avGmS4FpHXC9mB9cDjkguFAHNTurs9TwWRfv4Q3KLyRFQ4D+25Ly9rvkZqPX9I/T+LG59lIFyNHS02uLpTCXjxGexT1qne2Aog1MYH8wDrApWwNP0J9CrU5mfD81KGcQXQaCON05TofZVgMIUmajCN6dsQuuXUQAPcKnfj4zubQ9TCe2bRVmKejgJkw+Lnm16pOd2N/k7Tfn0J9eJUmEp6SKDR9NEUXexPo1qt1lWKRA6htC/TKLn3nRjXZ+vPxXOswIDAQAB";

    /**
     * 服务器异步通知页面路径
     */
    public static final String NOTIFY_URL = "http://pay.ngrok2.xiaomiqiu.cn/notify_url.jsp";

    /**
     * 页面跳转同步通知页面路径
     */
    public static final String RETURN_URL = "http://pay.ngrok2.xiaomiqiu.cn/return_url.jsp";

    /**
     * 签名方式
     */
    public static final String SIGN_TYPE = "RSA2";

    /**
     * 字符编码格式
     */
    public static final String CHARSET = "utf-8";

    /**
     * 支付宝网关
     */
    public static final String GATEWAYURL = "https://openapi.alipaydev.com/gateway.do";

    public static final String LOG_PATH = "C:\\";
}
