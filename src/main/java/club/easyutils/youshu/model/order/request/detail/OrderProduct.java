package club.easyutils.youshu.model.order.request.detail;

import club.easyutils.youshu.model.order.request.product.OrderChannel;
import club.easyutils.youshu.model.order.request.product.OrderCommission;
import club.easyutils.youshu.model.order.request.product.OrderStore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 主订单商品信息，数组类型，每个sku存一个数组单位
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct {

    /**
     * sku 编号
     */
    private String external_sku_id;

    /**
     * sku 名称
     */
    private String sku_name_chinese;

    /**
     * 单件商品原价
     */
    private Float goods_amount;

    /**
     * 多件商品实付金额（分摊了优惠的金额）
     */
    private Float payment_amount;

    /**
     * 是否赠品
     * 0代表非赠品
     * 1代表赠品
     */
    private Integer is_gift;

    /**
     * sku 所属 spu 编号
     * 若无 spu，传输内容请与 external_sku_id 保持一致
     */
    private String external_spu_id;

    /**
     * spu 名称
     * 若无 spu，传输内容请与 sku_name_chinese 保持一致
     */
    private String spu_name_chinese;

    /**
     * 商品售卖单位
     */
    private String sale_unit;

    /**
     * 末级类目 id
     */
    private String category_id;

    /**
     * 末级类目名称
     */
    private String category_name;

    /**
     * 商品数量
     */
    private Integer goods_num;

    /**
     * 商品重量，单位默认为克
     */
    private Float goods_weight;

    /**
     * 主订单销售门店信息
     */
    private OrderStore store_info;

    /**
     * 主订单来源渠道，数组类型
     */
    private List<OrderChannel> chan_info;

    /**
     * 佣金，json字符串
     */
    private List<OrderCommission> commission_info;


}
