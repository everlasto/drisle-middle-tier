package com.drisle.middle.entities;

import java.util.Map;

/**
 * Created by prashanth.a on 18/03/15.
 */
public class UserSocialResponse extends UserMinimalSocialResponse {

    Map<String, Object> data;

    public UserSocialResponse() {
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
