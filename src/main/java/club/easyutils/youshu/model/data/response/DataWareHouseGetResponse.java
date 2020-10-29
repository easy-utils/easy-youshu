package club.easyutils.youshu.model.data.response;

import club.easyutils.youshu.model.BaseResponseModel;
import lombok.*;

/**
 * 添加数据仓库
 * @author rainyblossom
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataWareHouseGetResponse extends BaseResponseModel {

    private DataSourceParent data;

}
