package com.drisle.middle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


}
