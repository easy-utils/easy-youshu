package club.easyutils.youshu.model.order.request.detail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPayment {

    /**
     * 支付方式，见<枚举列表>页
     */
    private String payment_type;

    /**
     * 微信支付订单ID/流水号
     */
    private String trans_id;

    /**
     * 金额，单位默认为元
     */
    private Float trans_amount;
}
