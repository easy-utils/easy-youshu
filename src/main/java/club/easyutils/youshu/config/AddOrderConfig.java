package club.easyutils.youshu.config;

import club.easyutils.youshu.util.HostUtil;
import lombok.AllArgsConstructor;

/**
 * 添加/更新订单 URL 配置
 * @author rainyblossom
 */
@AllArgsConstructor
public enum AddOrderConfig {

    /**
     * 添加/更新订单
     *
     * @link https://mp.zhls.qq.com/youshu-docs/develop/interface/order/add_order.html
     */
    ADD_ORDER("/data-api/v1/order/add_order")
    ;


    private String url;

    public String getUrl() {
        return HostUtil.convert(url);
    }
    
    public String getUrl(int dataSourceType, String merchantId) {
        return HostUtil.convert(dataSourceType, merchantId, url);
    }

}
