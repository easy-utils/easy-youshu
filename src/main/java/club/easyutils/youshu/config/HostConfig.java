package club.easyutils.youshu.config;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 基础 Host 配置
 *
 * @author rainyblossom
 */
@Service
public interface HostConfig {

    /**
     * 获取接口地址
     *
     * 后端 API 测试环境 url：https://test.zhls.qq.com/
     * 后端 API 生产环境 url：https://zhls.qq.com/
     *
     * 由于腾讯有数的 host 是区分测试环境 & 生产环境的，这里只做接口。
     * 服务端通过实现该接口，在不同的环境下注入不同的 host 地址
     * @return
     */
    String getHost();

    /**
     * 获取 AppId
     * @return
     */
    String getAppId();


    /**
     * 获取 AppSecret
     * @return
     */
    String getAppSecret();

}
