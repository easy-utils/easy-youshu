package club.easyutils.youshu.model.data.response;

import lombok.*;

import java.util.List;

/**
 * 数据仓库响应模型
 * @author rainyblossom
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceParent {

    private List<DataSource> dataSource;

}
