package club.easyutils.youshu.model.order.request.detail.coupon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 该类券的细节券信息
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCouponDetail {

    /**
     * 券 id
     */
    private String external_coupon_id;

    /**
     * 券批次 id（该字段需要在优惠券接口中添加卡券批次）
     */
    private String coupon_batch_id;

    /**
     * 券名称
     */
    private String coupon_name;

    /**
     * 该张券优惠金额，单位默认为元
     */
    private Float coupon_amount;

}
