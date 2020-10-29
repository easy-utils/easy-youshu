package club.easyutils.youshu.model.order.request.detail;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPayment {

    /**
     * 支付方式，见<枚举列表>页
     */
    @NonNull
    private String payment_type;

    /**
     * 微信支付订单ID/流水号
     */
    @NonNull
    private String trans_id;

    /**
     * 金额，单位默认为元
     */
    @NonNull
    private Float trans_amount;
}
