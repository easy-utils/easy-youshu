package club.easyutils.youshu.model.order.request.detail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息，json格式
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderUser {

    /**
     * 下单人 open_id
     * order_source = wxapp时，必填
     */
    private String open_id;

    /**
     * 小程序或公众号的appid
     */
    private String app_id;

    /**
     * 下单人 union_id
     */
    private String union_id;

    /**
     * 下单人手机号
     */
    private String user_phone;

    /**
     * 下单人用户 id
     */
    private String user_id;

    /**
     * 下单人会员号
     */
    private String member_id;

    /**
     * 下单人在KA注册后首次下单时间，格式为UNIX时间戳 字段长度为 13 字节
     */
    private String user_first_order_time;
}
