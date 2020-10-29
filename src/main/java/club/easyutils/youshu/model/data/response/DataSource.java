package club.easyutils.youshu.model.data.response;

import lombok.*;

/**
 * 数据仓库响应模型
 * @author rainyblossom
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataSource {

    private String id;

    private Integer type;

    private String merchantId;
}
