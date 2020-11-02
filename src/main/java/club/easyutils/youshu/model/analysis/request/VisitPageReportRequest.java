package club.easyutils.youshu.model.analysis.request;

import club.easyutils.weprogram.model.analysis.response.AnalysisVisitPageResponse;
import club.easyutils.youshu.model.BaseRequestModel;
import lombok.*;

import java.util.List;

/**
 * Visit Page 数据上报请求对象
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisitPageReportRequest extends BaseRequestModel {

    /**
     * 数据源id（create方法返回的data.dataSource.id）
     */
    @NonNull
    private String dataSourceId;

    /**
     * 微信小程序后台请求结果列表
     */
    @NonNull
    private List<AnalysisVisitPageResponse> rawMsg;
}
