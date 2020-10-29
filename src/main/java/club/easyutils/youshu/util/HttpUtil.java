package club.easyutils.youshu.util;

/*-
 * Starttag
 * easy weprogram
 * #
 * Copyright (C) 2020 easy weprogram
 * #
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Endtag
 */

import club.easyutils.youshu.model.BaseRequestModel;
import club.easyutils.youshu.model.BaseRequestModel;
import cn.hutool.core.lang.Validator;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpUtil<T>{

    private RestTemplate restTemplate;

    public RestTemplate getRestTemplate() {
        if (Validator.isNull(restTemplate)){
            restTemplate = new RestTemplate();
        }
        return restTemplate;
    }

    public T doPost(String url, BaseRequestModel baseRequestModel, Class<T> tClass){
        return getRestTemplate().postForEntity(url, JSONObject.toJSONString(baseRequestModel), tClass).getBody();
    }

    public T doGet(String url, Class<T> tClass){
        return getRestTemplate().getForEntity(url, tClass).getBody();
    }



}
