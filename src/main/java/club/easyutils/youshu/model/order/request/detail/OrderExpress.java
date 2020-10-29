package club.easyutils.youshu.model.order.request.detail;

import club.easyutils.youshu.model.order.request.detail.express.OrderExpressPackage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderExpress {

    /**
     * 订单物流状态
     */
    private String logistics_status;

    /**
     * 商品总重量，单位默认为克
     */
    private String goods_total_weight;

    /**
     * 收件人姓名
     */
    private String receiver_name;

    /**
     * 收件人联系电话
     */
    private String receiver_phone;

    /**
     * 收件人地址
     */
    private String receiver_address;

    /**
     * 国家编码
     */
    private String receiver_country_code;

    /**
     * 省份编码
     */
    private String receiver_province_code;

    /**
     * 城市编码
     */
    private String receiver_city_code;

    /**
     * 区编码
     */
    private String receiver_district_code;

    /**
     * 期望送货时间段，格式为“起始时间-结束时间”，如"9:00-12:00"
     */
    private String expected_delivery_time;

    /**
     * 期望送货日期，格式“YYYYMMDD”
     */
    private String expected_delivery_date;

    /**
     * 包裹信息，struct类型
     */
    private List<OrderExpressPackage> express_package_info;
}
