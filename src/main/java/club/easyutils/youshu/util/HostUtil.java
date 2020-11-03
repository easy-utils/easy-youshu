package club.easyutils.youshu.util;

import club.easyutils.youshu.config.HostConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

/**
 * Host 转换工具
 *
 * @author RainyBlossom
 */
@Component
public class HostUtil {

    private static Logger logger = LoggerFactory.getLogger(HostUtil.class.getName());

    private static HostUtil hostUtil;


    @PostConstruct
    public void init() {
        hostUtil = this;
    }

    @Autowired(required = false)
    private HostConfig hostConfig;
    
    private static StringBuilder commUrlPre(String target) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hostUtil.hostConfig.getHost());
        stringBuilder.append(target);
        stringBuilder.append("?");
        return stringBuilder;
    }

    public static String convert(String target){
        String finalUrl = "";
        try {
            finalUrl = commUrlPre(target).append(sign()).toString();
        } catch (Exception e) {
            logger.error("【Easy YouShu】获取 sign 签名失败！", e);
        }
        logger.info("调用有数url={}", finalUrl);
        return finalUrl;
    }

    public static String convert(int dataSourceType, String merchantId, String target) {
        String url = "";
        try {
            url = sign();
            url = commUrlPre(target).append(String.format("dataSourceType=%d&merchantId=%s&%s", dataSourceType, merchantId, url)).toString();
            
        } catch (Exception e) {
            logger.error("【Easy YouShu】获取 sign 签名失败！", e);
        }
        logger.info("调用有数url={}", url);
        return url;
    } 

    private static String sign() throws Exception{
        if (null != hostUtil.hostConfig) {
            String appId = hostUtil.hostConfig.getAppId();
            String appSecret = hostUtil.hostConfig.getAppSecret();
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random(System.currentTimeMillis());
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
            String nonce = String.valueOf(Math.abs(random.nextLong()));
            String str = String.format("app_id=%s&nonce=%s&sign=sha256&timestamp=%s", appId, nonce, timestamp);
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(appSecret.getBytes("UTF-8"), mac.getAlgorithm());
            mac.init(secretKey);
            byte[] bytes = mac.doFinal(str.getBytes("UTF-8"));
            stringBuilder.setLength(0);
            for (byte b : bytes){
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(hex);
            }
            String signature = stringBuilder.toString();
            return str + "&signature=" + signature;
        }
        
        return "";
    }

}
