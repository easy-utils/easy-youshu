package club.easyutils.youshu.service.analysis;

import club.easyutils.youshu.config.AnalysisConfig;
import club.easyutils.youshu.model.analysis.request.VisitPageReportRequest;
import club.easyutils.youshu.model.analysis.response.VisitPageReportResponse;
import club.easyutils.youshu.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 * 数据上报接口
 *
 * https://mp.zhls.qq.com/youshu-docs/develop/interface/wxapp/add_wxapp_page_visit.html
 * @author rainyblossom
 */
@Service
public class DataReportServiceImpl implements DataReportService{

    @Override
    public VisitPageReportResponse reportVisitPageData(VisitPageReportRequest request) {
        return (VisitPageReportResponse) HttpUtil.doPost(AnalysisConfig.ANALYSIS_VISIT_PAGE_REPORT.getUrl(), request, VisitPageReportResponse.class).getBody();
    }

}
