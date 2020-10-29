package club.easyutils.youshu.model.order.request.detail;

import club.easyutils.youshu.model.order.request.detail.coupon.OrderCouponDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCoupon {

    /**
     * 卡券类型；1：商家券；2：微信支付券
     */
    private Integer coupon_type;

    /**
     * 该类券优惠金额总额，单位默认为元
     */
    private Float coupon_amount_total;

    /**
     * 该类券的细节券信息
     */
    private List<OrderCouponDetail> coupon_detail;
}
