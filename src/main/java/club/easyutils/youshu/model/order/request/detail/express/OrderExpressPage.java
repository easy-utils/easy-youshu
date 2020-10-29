package club.easyutils.youshu.model.order.request.detail.express;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 运费跳转页面，json字符串
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderExpressPage {

    /**
     * 快递详情页跳转链接（小程序页面，小程序填此字段）
     */
    private String miniprogram_path;

    /**
     * 小程序APPID，填写了miniprogram_path需填此字段
     */
    private String miniprogram_appid;

    /**
     * 快递详情页跳转链接（h5页面，公众号填此字段）
     */
    private String miniprogram_h5;
}
