package club.easyutils.youshu.service.analysis;

import club.easyutils.youshu.model.analysis.request.VisitPageReportRequest;
import club.easyutils.youshu.model.analysis.response.VisitPageReportResponse;

/**
 * 数据上报接口
 *
 * https://mp.zhls.qq.com/youshu-docs/develop/interface/wxapp/add_wxapp_page_visit.html
 * @author rainyblossom
 */
public interface DataReportService {

    /**
     * 上报页面访问
     *
     * 开发之前请添加数据仓库，dataSourceType = 7。
     * 每个接口创建一个数据仓库后，传输数据可重复使用。每种数据源类型的数据仓库只可添加一次。每个接口创建一个数据仓库后，传输数据时可重复使用。
     *
     * 上报步骤：
     * 每天早上 10 点调用微信 analysis.getVisitPage (opens new window) 接口。
     * 调用微信接口请使用微信的access_token (opens new window)。
     * grant_type 填写 "client_credential" ；
     * appid 填写微信小程序的 appId，可在<微信公众平台 (opens new window) >- <设置> - <开发设置>中获得；
     * secret 填写微信小程序的 appSecret ，获取方式同微信小程序 appId。
     * 每天早上 11 点前请求腾讯有数上报页面访问接口，将 analysis.getVisitPage (opens new window) 接口返回的数据按原格式上报。
     * 调用腾讯有数接口请使用腾讯有数的开发账号。
     *
     * @param request
     * @return
     */
    VisitPageReportResponse reportVisitPageData(VisitPageReportRequest request);


}
