package club.easyutils.youshu.service.dataware;

import club.easyutils.youshu.model.data.request.DataWareHouseAddRequest;
import club.easyutils.youshu.model.data.request.DataWareHouseGetRequest;
import club.easyutils.youshu.model.data.response.DataWareHouseAddResponse;
import club.easyutils.youshu.model.data.response.DataWareHouseGetResponse;
import org.springframework.stereotype.Service;

/**
 * 数据仓库服务
 * @author rainyblossom
 */
@Service
public interface DataWareHouseService {

    DataWareHouseAddResponse add(DataWareHouseAddRequest request);

    DataWareHouseGetResponse get();

}
