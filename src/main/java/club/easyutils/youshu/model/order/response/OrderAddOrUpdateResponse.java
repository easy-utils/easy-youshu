package club.easyutils.youshu.model.order.response;

import club.easyutils.youshu.model.BaseResponseModel;
import club.easyutils.youshu.model.data.response.DataSourceParent;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 添加数据仓库
 * @author rainyblossom
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderAddOrUpdateResponse extends BaseResponseModel {

    private JSONObject data;

}
