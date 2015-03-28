package com.drisle.middle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by prashanth.a on 22/03/15.
 */
@Controller
public class Signup {

    @RequestMapping(value = "/userservice/signup/add/"/*, method = RequestMethod.POST*/)
    public Object signup(
            @RequestParam(value = "name", required = true) String username
    ){
        return null;
    }

    @RequestMapping(value = "/userservice/signup/verifyInvite/"/*, method = RequestMethod.POST*/)
    public String inviteVerify(
            @RequestParam(value = "code", required = true) String code,
            Map<String, Object>model

    ){
        model.put("result", false);
        return "common/dumper";
    }

}
