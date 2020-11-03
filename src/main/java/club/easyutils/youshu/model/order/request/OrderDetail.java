package club.easyutils.youshu.model.order.request;

import club.easyutils.youshu.model.order.request.detail.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 订单列表 数组最大长度 50
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    /**
     * 商家订单号
     */
    private String external_order_id;

    /**
     * 订单创建时间，unix时间戳 字段长度为 13 字节
     */
    private String create_time;

    /**
     * 订单来源
     *
     * 枚举值:
     * 商家小程序：wxapp；
     * 商家app：app；
     * 商家H5：mobileweb；
     * 商家pcweb：pcweb；
     * 线下人工pos：offstore_pos_manual；
     * 线下自助收银：offstore_pos_self_help；
     * 其他：other
     */
    private String order_source;

    /**
     * 订单类型
     * 1：普通订单；
     * 2：充值订单；
     * 3：消费订单；
     * 普通购买商品订单传 1 即可
     */
    private Integer order_type;

    /**
     * 订单品牌 id
     */
    private String brand_id;

    /**
     * 订单品牌名称
     */
    private String brand_name;

    /**
     * 订单商品总数量
     */
    private Integer goods_num_total;

    /**
     * 订单商品总重量，默认单位为克
     */
    private Float goods_weight;

    /**
     * 商品总金额，单位默认为元
     * 注：已含单品级别优惠的商品金额，如单品直降
     */
    private Float goods_amount_total;

    /**
     * 订单运费，单位默认为元
     * 注：运费为0时，传0.00
     */
    private Float freight_amount;

    /**
     * 订单金额，单位默认为元
     * 注：商品总金额+运费金额=订单金额
     */
    private Float order_amount;

    /**
     * 订单应付金额，单位默认为元
     * 注：订单金额-订单级别的优惠金额（如：订单满减）=订单应付金额
     */
    private Float payable_amount;

    /**
     * 实付金额，单位默认为元
     * 注：订单应付金额-支付优惠金额（如：微信支付优惠、招商银行优惠等）=订单实付金额
     */
    private Float payment_amount;

    /**
     * 主订单状态
     * 1110待支付
     * 1150已支付待发货
     * 1160已发货
     * 1180销售完成/已收货
     * 1280退款中
     * 1290退货完成
     */
    private String order_status;

    /**
     * 用户信息，json格式
     */
    private OrderUser user_info;

    /**
     * 主订单商品信息，数组类型，每个sku存一个数组单位
     */
    private List<OrderProduct> goods_info;

    /**
     * 主订单商品参与的活动信息，数组类型
     */
    private List<OrderPromotion> promotion_info;

    /**
     * 主订单用到的券信息，数组类型
     */
    private List<OrderCoupon> coupon_info;

    /**
     * 主订单每种支付方式的支付信息
     * order_status = 1110时 payment_info非必填，其他状态码必填
     */
    private List<OrderPayment> payment_info;

    /**
     * 快递信息
     */
    private OrderExpress express_info;

    /**
     * 发票信息，类型为数组
     */
    private List<OrderInvoice> invoice_info;

    /**
     * 订单赠送总积分
     */
    private Float points_total;

    /**
     * 商家标记订单已删除
     * 0-未删除，1-已删除
     */
    private Integer is_deleted;

}
