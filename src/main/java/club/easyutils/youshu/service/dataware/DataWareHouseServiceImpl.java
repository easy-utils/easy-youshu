package club.easyutils.youshu.service.dataware;

import club.easyutils.youshu.config.DataWareHouseConfig;
import club.easyutils.youshu.model.data.request.DataWareHouseAddRequest;
import club.easyutils.youshu.model.data.response.DataWareHouseAddResponse;
import club.easyutils.youshu.model.data.response.DataWareHouseGetResponse;
import club.easyutils.youshu.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 * 数据仓库服务
 * @author rainyblossom
 */
@Service
public class DataWareHouseServiceImpl implements DataWareHouseService{

    @Override
    public DataWareHouseAddResponse add(DataWareHouseAddRequest request) {
        return (DataWareHouseAddResponse) HttpUtil.doPost(DataWareHouseConfig.DATA_WARE_HOUSE_ADD.getUrl(), request, DataWareHouseAddResponse.class).getBody();
    }

    @Override
    public DataWareHouseGetResponse get() {
        return (DataWareHouseGetResponse) HttpUtil.doGet(DataWareHouseConfig.DATA_WARE_HOUSE_GET.getUrl(), DataWareHouseGetResponse.class).getBody();
    }
}
