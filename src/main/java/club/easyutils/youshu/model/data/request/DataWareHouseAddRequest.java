package club.easyutils.youshu.model.data.request;

import club.easyutils.youshu.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 添加数据仓库
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataWareHouseAddRequest extends BaseRequestModel {

    /**
     * 商家 id，有数提供
     */
    private String merchantId;

    /**
     * 数据源类型
     *
     * 主订单	0	订单数据仓库, 对应上报接口 /order/add_order
     * 子订单	1	子订单数据仓库，对应上报接口 /order/add_sub_order
     * 销售信息	2	销售信息数据仓库，对应上报接口 /salesinfo/add
     * 商品 sku	3	商品 sku 数据仓库，对应上报接口 /sku/add
     * 门店信息	4	门店信息数据仓库，对应上报接口 /store/add
     * 商品 spu	5	商品 spu 数据仓库，对应上报接口 /spus/add
     * 商品类目	6	商品类目数据仓库，对应上报接口 /product_categories/add
     * 微信小程序页面访问	7	微信小程序页面访问信息数据仓库，对应微信接口 analysis.getVisitPage，对应上报接口 /analysis/add_wxapp_visit_page
     * 微信小程序访问分布数据	8	微信小程序页面访问信息数据仓库，对应微信接口 analysis.getVisitDistribution，对应上报接口 /analysis/add_wxapp_visit_distribution
     * 用户信息	11	用户信息数据仓库，对应上报接口 /user/add_user
     * 活动信息	12	活动信息数据仓库，对应上报接口 /order/add_promotion
     * 卡券信息	13	卡券信息数据仓库，对于上报接口 /order/add_coupon
     * 汇总订单	51	汇总订单数据仓库, 对应上报接口 /order/add_order_sum
     */
    private String dataSourceType;
}
