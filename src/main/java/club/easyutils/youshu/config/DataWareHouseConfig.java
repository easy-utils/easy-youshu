package club.easyutils.youshu.config;

import club.easyutils.youshu.util.HostUtil;
import lombok.AllArgsConstructor;

/**
 * 数据仓库配置
 * @author rainyblossom
 */
@AllArgsConstructor
public enum DataWareHouseConfig {

    /**
     * 添加数据仓库
     *
     * 此接口是后端数据使用接口上报的第一步。每个接口上报数据前都需都添加一个数据仓库，每种数据源类型的数据仓库只可添加一次，该数据仓库在传输数据时可重复使用。
     * @link https://mp.zhls.qq.com/youshu-docs/develop/interface/datawarehouse/data_source_add.html
     */
    DATA_WARE_HOUSE_ADD("/data-api/v1/data_source/add"),

    /**
     * 获取数据仓库
     *
     * 此接口可获取之前已经创建的数据仓库。
     * @link https://mp.zhls.qq.com/youshu-docs/develop/interface/datawarehouse/data_source_get.html
     */
    DATA_WARE_HOUSE_GET("/data-api/v1/data_source/get");

    private String url;

    public String getUrl() {
        return HostUtil.convert(url);
    }
    
    public String getUrl(int dataSourceType, String merchantId) {
        return HostUtil.convert(dataSourceType, merchantId, url);
    }

}
