package club.easyutils.youshu.model.order.request;

import club.easyutils.youshu.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 添加数据仓库
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderAddOrUpdateRequest extends BaseRequestModel {

    /**
     * 数据源id（create方法返回的data.dataSource.id）
     */
    private String dataSourceId;

    /**
     * 订单列表 数组最大长度 50
     */
    private List<OrderDetail> orders;

}
