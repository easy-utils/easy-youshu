package club.easyutils.youshu.config;

import club.easyutils.youshu.util.HostUtil;
import lombok.AllArgsConstructor;

/**
 * 数据上报接口常量
 * @author rainyblossom
 */
@AllArgsConstructor
public enum AnalysisConfig {

    /**
     * 上报页面访问
     *
     *
     * @link https://mp.zhls.qq.com/youshu-docs/develop/interface/wxapp/add_wxapp_page_visit.html
     */
    ANALYSIS_VISIT_PAGE_REPORT("/data-api/v1/analysis/add_wxapp_visit_page"),

    /**
     * 上报页面访问
     *
     *
     * @link https://mp.zhls.qq.com/youshu-docs/develop/interface/wxapp/add_wxapp_page_visit.html
     */
    ANALYSIS_VISIT_DISTRIBUTION_REPORT("/data-api/v1/analysis/add_wxapp_visit_distribution");


    private String url;

    public String getUrl() {
        return HostUtil.convert(url);
    }
}
