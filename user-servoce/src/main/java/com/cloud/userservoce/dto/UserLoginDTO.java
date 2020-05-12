package com.cloud.userservoce.dto;


import com.cloud.userservoce.entity.JWT;
import com.cloud.userservoce.entity.User;

/**
 * Created by fangzhipeng on 2017/5/27.
 */
public class UserLoginDTO {

    private JWT jwt;

    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
