package club.easyutils.youshu.model.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 数据仓库响应模型
 * @author rainyblossom
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceGetParent {

    private List<DataSource> dataSources;

}
