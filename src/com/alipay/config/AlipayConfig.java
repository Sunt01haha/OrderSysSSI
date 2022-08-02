package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000121631460";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDN4kiIBi/YvaAivf97hvWWNQHT+4STJG8k1wrOxl+KCK9WkZfTY5ctiHjdfKiwqyFsCC8pa1YCykLfuummCYVxMT8uZol4UcIN3l/klBdrrTIdtu8oggQ48EfdWgXsmCw5gbfzbVJthjCMy01te13+4yowCMw3IBR0qTvuyOKxzweScCKfrK8NWxjWySGY6PEiftq496q2TIFnaANNoH2Fg6PxPvnY/m1D95iGZoS7VtGSsSWNXyKy479cHXCUv6mkxVQVWVMBWReKXvlvpdYGtSR7dfHXrGGWfp5EWrVr8VxroM6wukcQ4LRrdXKCdQOA86VYY2+DhALg017p7UJ9AgMBAAECggEAJLIdXWlE4+vAfBDDVaATa8dc4Qymb5eB294cRgijhLXRkqt2lS3eBzaY3FlYs8x8s4Wt6kMAXJTyYHAvLvHpf+hYK4wJGpHv9YraKqKengmLsjIl5GFwITnqhTCDd80TrNhLEi89DtppEt81mLrxYPnaTh9zTqwAGV8EmKXjie9bW6mGCYD75w14lvWot4C5JPyniOir6sec8wU/Ety9ApNKAEmtrdLPWzMnPHqvC4aluuTp/WmItbtsgiPzDPl58gDX6AEC2ZfCqYDBlAoU5MsVZaSgMKvDYXzyP3xj7ZJi5eswPA7XQ7UbhGs0IxmS0l8LfMZ3Lqcwl72kJVBHfQKBgQD9dShq8z5PIvFujmfc5TStQ/ArPMYMjJgUtNzv/WsV6cD0my4q75JMPErWAu7XFjM2SPJj2sKvZMqmM+IrHWtQZ/hboAAdBD9is47G7fRqYBMQbwS9MD7wyydJwC5Vt/GFSXuKHgHtA/1/ZQaB8kYQDmbJXRJwdJSq8cQYSeodvwKBgQDP8vaMJd3q+LGZ4VNnFaMGZsqMYqhAqN8OmTRDrezdpAnEfo0o9BAUAv7eh7iPVKuns9kUiGO6s4tAymva0yroRbQCoXeRUi/FKSRrHrTMCjg4XonuNa9RmjhpnKOyb8SoNGZPnQTaa/6Y3NI06ZAbI2/Hq2l0l0QLDePoH+HmwwKBgEIh66XcSgnECFLcfWU5uQDslSHy/YoQtS3R80P7T5GsKFiqlOVHFVkm8i/dHAyrEjm71uMPFXVGS0oKh5zQVEvqlPbzTJRFo3RRfZOSSw/meZL0JLxodkPF/j5UEsLy9+XbQozLP51kSSSQa55EZNuTpmYsDr+g65me85eS0a9pAoGAEmWmVkPLXExgOgLrRAVwBNL3PHBF/mJySXJYY1xxxjILAy1HA8aD3aFeNwW+2D9faFjK7bwbRps3yKWf4R4pf58bC9iJIXwp6cF4DVoMGLkWvDXw8fgh6JBCSWWoPdMRjOgF3SlBEqnXPmLa3f+D1kLOUtXhYIU5adjyvsiDTc0CgYBgLWxCOiWZJLr4kdyeTQEiy12PAlwS4JMyXFo29189VUpm+GZm8lzakKfpuwF6leLtzqE78PrTbkQ4iW+Ad/TqkVmRr9RyUIQIdagr3f6K8Z7AyKlMT+ZUtmOJfABzC7ajPst0BuuckL2u9UqHBRq7TCgeEDAqhauYVNv531ZvrQ==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmzf1PAiVZQIAS9vMsKeEDkjRyFMUemaLNdjW6wxi7uQJbaXAOvV6iOcXk1QmQ//KtOem7OwUkuvi1ucsODBifseqbsAU9FE0+sO3KhXGUG8tM6JoZYvtNPuL6Lwj8h2sfJfolfFrl70kFB6a2p0BmR2g9teteA9y+tg/9Up+CaKmBTTIsyii2oJnoyt0e5JWDGXwi+Mq3lGss5sgi+nQme4UKISXNMtaogjglX3gBGVQ9pQMpcUW3iaeiM0pRjE5eAwltJ93qkcxBEy0IaRSA835R0xbdHU6NEH/q0y+AsBO1ABuBBGYa9lW2SHiznhicGhswU0eD+t12ZG+dMWJGQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost8088/alipay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost8088/alipay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

