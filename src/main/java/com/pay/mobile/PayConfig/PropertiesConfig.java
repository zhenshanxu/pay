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
    public static final String MERCHANT_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC8xTFIXhZ4PYZ/m6R/ZuO4FKT+cGRDHRfGiOmanuDmZ02uzCVsgibXVaxmzqm2GVDxzlrs6RRxd8oj0VnVG/wFKnjr4XHKlw2MZDo3KgmafpPb+IagsswU9wbrnlml+f8fYdv9o93mizUKUgSxvdGbCDPLB1p4F7bckmbr/VN4PStekHF5mc0qX89R5EZoy6Ryoqt938apph6Rw63k5/qIQ+ZfzxGQiiST7aFsY2fvQyZNeHAOiRAqIRpbRt+Z7diVXaI9aVHQNet8YCw+YM7nKr+91WoCO5ZnQrIAkOd6dYliQs5HFkObmbvuQU8wupICZhqzMtkiSjnIozEvnoXfAgMBAAECggEAZ8hGSxInal3xFzE75CtuISOAfr7N8LQLAUT+odqdrS64X9Su8pQvxI2+phsS5SHQBdE83ila6vM/+Cc+K1MiYLi0GIMu64HWmgv0kaWT+BOFORfO9IS4fQI/FMVPZlgmsls79pvkAL8iHxVurUW9+m0tBH97drEbAPOgkDgLbvvISgflfRrwZAIbsJNHjLWXd/CLFUOA/PIWj1SJLxLqh8OOtk+UNkLmvCqVN6ZEGiZZgcSEE6BrlT4JGfXKotaJEEThLV6dxw90fPND98iP/RcFsxuW+SfDa7dHlNFWWp2o6UDMAuQiYK7dDufmlbg8Jf0uNvv5taWA1ypuqcPXUQKBgQDoNQUJ7+OGNCuATSLxiHS136eHRFrhk+8BbVWDwmlcVKueiBz1/qcU0Y/SshinHzD5QOJm+CgPFu2lHzrR4v5pcuhH91kXniMhRI/LkrXhpcDIJuJsUFk2ANwY13OoHdyx6m10g2shUhxdREDgAHtKJe0yOFzLRKYpAQTg8Ctu5wKBgQDQHMouM1ysL9uZDgqpSnOe4XoWFHvVjqYZ1BJ6ZUCdkkvyxLAUPRhc/XMFMzVcn1A2TI1as5LHwRsDqxsiG8oZG9ZC9d7su269JFdH3A5Xaee772lRJRKCQHvKVWSk9NJII8MYldjsd9HV9WLOe7tezwqhTQPDRBuKJkwwJWYqSQKBgQCDTxgeWm1LQs0mrHgKJaP6BRNzRpAt573MDMvCynlSIP87krTt1qcc+rRd7SBLwTOsf6iHmeTtQ4X3TgWxEq/TaYs4xwK2fFJZSbAW6ku34kd156c6oOURyMKtuYhJlTlr0qk6reYy3X/0rdgR07PkZjYPpBe1Soi7vzvHB4lIGQKBgQDFWCeYu/fLB+7TKm+NrR4KsYGV4oKzNfvoTiPfkJg/U3VVlpHp/y1VMLmbWr3lQOVNODZqphIv/bviNKUcKQHx4WXCRWjJT8to7Ecfy1qGJdUrb5GM8vykKwW4DlXL3qRw6AifDamQQubmXzT83HQHKYnI/0DsL292B28D0NMakQKBgDOKBXVJthVBu1Z8jKBdpGYiBULYdHGIvVzj8m3jVuhl0aJvmwHVy79Hy65PzYe02II2h74xhd4irWSG45gTdeT+4J/+WM1TR+mDDzwtpupWnL912Zu+or79uP8d00GGYfV7BO3Md8NpdyAHAWBbH2tM8/Igp4m+5EcufJRGHHUt";

    /**
     * 支付宝公钥
     */
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjS4z5mnok3XWl1SjimLPNcMTXW2XuKgQ/M6tEfYAJjM7U/IP8+OId3Wc8NCjlvhj++6neY8DibGYCjjTps5avGmS4FpHXC9mB9cDjkguFAHNTurs9TwWRfv4Q3KLyRFQ4D+25Ly9rvkZqPX9I/T+LG59lIFyNHS02uLpTCXjxGexT1qne2Aog1MYH8wDrApWwNP0J9CrU5mfD81KGcQXQaCON05TofZVgMIUmajCN6dsQuuXUQAPcKnfj4zubQ9TCe2bRVmKejgJkw+Lnm16pOd2N/k7Tfn0J9eJUmEp6SKDR9NEUXexPo1qt1lWKRA6htC/TKLn3nRjXZ+vPxXOswIDAQAB";

    /**
     * 服务器异步通知页面路径
     */
    public static final String NOTIFY_URL = "http://r3x4365388.wicp.vip:19183/pay/notify_url.jsp";

    /**
     * 页面跳转同步通知页面路径
     */
    public static final String RETURN_URL = "http://r3x4365388.wicp.vip:19183/pay/return_url.jsp";

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
