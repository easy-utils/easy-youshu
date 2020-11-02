package club.easyutils.youshu.model.analysis.response;

import club.easyutils.weprogram.model.analysis.response.AnalysisVisitPageResponse;
import club.easyutils.youshu.model.BaseRequestModel;
import club.easyutils.youshu.model.BaseResponseModel;
import com.alibaba.fastjson.JSONObject;
import lombok.*;

import java.util.List;

/**
 * Visit Page 数据上报响应对象
 * @author rainyblossom
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VisitPageReportResponse extends BaseResponseModel {

    /**
     * 响应内容
     */
    private JSONObject data;
}
