package club.easyutils.youshu.model.order.request.detail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 主订单商品参与的活动信息，数组类型
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPromotion {

    /**
     * 活动类型
     * 枚举值如下：1：订单满减；2：订单满折；3：订单赠品；4：订单积分；5：单品降价；6：单品打折；7：单品赠品；8：单品积分；9：X件N折；10：X元N件；11：拼团
     */
    private Integer promotion_type;

    /**
     * 活动 id
     */
    private Integer external_promotion_id;

    /**
     * 活动名称
     */
    private String promotion_name;

    /**
     * 订单维度的活动优惠金额，单位默认为元
     */
    private Float promotion_amount;
}
