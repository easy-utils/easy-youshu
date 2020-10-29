package club.easyutils.youshu.service;

import club.easyutils.youshu.config.DataWareHouseConfig;
import club.easyutils.youshu.model.data.request.DataWareHouseAddRequest;
import club.easyutils.youshu.model.data.request.DataWareHouseGetRequest;
import club.easyutils.youshu.model.data.response.DataWareHouseAddResponse;
import club.easyutils.youshu.model.data.response.DataWareHouseGetResponse;
import club.easyutils.youshu.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 数据仓库服务
 * @author rainyblossom
 */
@Service
public class DataWareHouseServiceImpl implements DataWareHouseService{

    @Override
    public DataWareHouseAddResponse add(DataWareHouseAddRequest request) {
        HttpUtil<DataWareHouseAddResponse> httpUtil = new HttpUtil();
        return httpUtil.doPost(DataWareHouseConfig.DATA_WARE_HOUSE_ADD.getUrl(), request, DataWareHouseAddResponse.class);
    }

    @Override
    public DataWareHouseGetResponse get() {
        HttpUtil<DataWareHouseGetResponse> httpUtil = new HttpUtil();
        return httpUtil.doGet(DataWareHouseConfig.DATA_WARE_HOUSE_GET.getUrl(), DataWareHouseGetResponse.class);
    }
}
