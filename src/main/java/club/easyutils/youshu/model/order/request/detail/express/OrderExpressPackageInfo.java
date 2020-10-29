package club.easyutils.youshu.model.order.request.detail.express;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 物流包裹信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderExpressPackageInfo {

    /**
     * 商品sku id
     */
    private String external_sku_id;

    /**
     * 商品数量
     */
    private Integer number;


}
