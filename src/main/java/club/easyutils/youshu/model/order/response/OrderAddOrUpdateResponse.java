package club.easyutils.youshu.model.order.response;

import club.easyutils.youshu.model.BaseResponseModel;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 添加/更新订单 有数返回类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderAddOrUpdateResponse extends BaseResponseModel {

    private JSONObject data;

}
