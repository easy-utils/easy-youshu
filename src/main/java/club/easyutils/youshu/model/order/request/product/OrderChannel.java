package club.easyutils.youshu.model.order.request.product;

import club.easyutils.youshu.model.order.request.product.channel.OrderChannelApp;
import club.easyutils.youshu.model.order.request.product.channel.OrderChannelCustom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 主订单来源渠道，数组类型
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderChannel {

    /**
     * 小程序渠道
     */
    private OrderChannelApp chan_wxapp;

    /**
     * 自定义渠道
     */
    private OrderChannelCustom chan_custom;

    /**
     * 智慧零售入口小程序必传，来源小程序或公众号appid
     */
    private String chan_refer_app_id;

    /**
     * 智慧零售入口小程序必传，引流渠道编码
     */
    private String chan_id;
}
