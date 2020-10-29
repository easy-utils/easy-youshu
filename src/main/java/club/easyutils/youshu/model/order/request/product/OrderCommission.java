package club.easyutils.youshu.model.order.request.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 佣金，json字符串
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCommission {

    /**
     * 佣金类型
     * 枚举值如下：
     * 1：按比例提成；
     * 2：按金额提成
     */
    private Integer commission_type;

    /**
     * 佣金金额，单位元
      */
    private Float commission_fee;

}
