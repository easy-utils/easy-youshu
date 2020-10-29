package club.easyutils.youshu.model.order.request.product.channel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 小程序渠道
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderChannelApp {

    /**
     * 小程序场景值
     */
    private String chan_scene;
}
