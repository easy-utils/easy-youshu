package club.easyutils.youshu.model.data.request;

import club.easyutils.youshu.model.BaseRequestModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 添加数据仓库
 * @author rainyblossom
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataWareHouseGetRequest extends BaseRequestModel {

    /**
     * 分配的app_id
     */
    private String app_id;

    /**
     * 随机字符串
     */
    private String nonce;

    /**
     * 签名算法
     */
    private String sign;

    /**
     * 请求时间戳（秒级）
     */
    private String timestamp;

    /**
     * 签名结果
     */
    private String signature;
}
