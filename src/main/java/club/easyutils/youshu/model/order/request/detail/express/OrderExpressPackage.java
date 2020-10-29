package club.easyutils.youshu.model.order.request.detail.express;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderExpressPackage {

    /**
     * 物流公司编码，枚举类型，枚举值请参见文章后面的“物流商 code”
     */
    private String express_company_code;

    /**
     * 物流公司名称
     */
    private String express_company_name;

    /**
     * 运单号
     */
    private String express_code;

    /**
     * 发货时间，格式为时间戳 字段长度为 13 字节
     */
    private String ship_time;

    /**
     * 运费跳转页面，json字符串
     */
    private OrderExpressPage express_page;

    /**
     * 物流包裹信息
     */
    private List<OrderExpressPackageInfo> express_package_info;

}
