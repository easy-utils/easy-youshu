package club.easyutils.youshu.model.order.request.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 主订单销售门店信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStore {

    /**
     * 主订单销售门店信息
     */
    private String external_store_id;

    /**
     * 主订单销售门店名称
     */
    private String store_name;

    /**
     * 主订单销售门店所属城市
     */
    private String store_city;

}
