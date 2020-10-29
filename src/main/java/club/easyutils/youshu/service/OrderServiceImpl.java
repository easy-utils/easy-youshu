package club.easyutils.youshu.service;

import club.easyutils.youshu.config.DataWareHouseConfig;
import club.easyutils.youshu.model.data.response.DataWareHouseAddResponse;
import club.easyutils.youshu.model.order.request.OrderAddOrUpdateRequest;
import club.easyutils.youshu.model.order.response.OrderAddOrUpdateResponse;
import club.easyutils.youshu.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 * 添加/更新订单
 * 开发之前请添加数据仓库，dataSourceType = 0。
 * 每种数据源类型的数据仓库只可添加一次。每个接口创建一个数据仓库后，传输数据时可重复使用。
 * @author rainyblossom
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public OrderAddOrUpdateResponse addOrUpdate(OrderAddOrUpdateRequest request) {
        HttpUtil<OrderAddOrUpdateResponse> httpUtil = new HttpUtil();
        return httpUtil.doPost(DataWareHouseConfig.DATA_WARE_HOUSE_ADD.getUrl(), request, OrderAddOrUpdateResponse.class);

    }
}
