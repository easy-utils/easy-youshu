package club.easyutils.youshu.model.data.response;

import club.easyutils.youshu.model.BaseResponseModel;
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
public class DataWareHouseGetResponse extends BaseResponseModel {

    private DataSourceGetParent data;

}
