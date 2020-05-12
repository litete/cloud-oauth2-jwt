package com.cloud.userservoce.client.hystrix;


import com.cloud.userservoce.client.AuthServiceClient;
import com.cloud.userservoce.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/5/31.
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
