package club.easyutils.youshu.model;

import lombok.*;

/**
 * 请求响应基础模型
 * @author rainyblossom
 */
@Setter
@Getter
public class BaseResponseModel {

    private String retcode;

    private String errmsg;

}
