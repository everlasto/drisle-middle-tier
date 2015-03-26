package com.drisle.middle.controllers;

import com.drisle.middle.constants.PageTypes;
import com.drisle.middle.services.Session;
import com.drisle.middle.utils.UIhelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by prashanth.a on 22/03/15.
 */
@Controller
public class Index {

    @Autowired
    private HttpSession session;

    @RequestMapping("/")
    public String IndexPage(
        @RequestParam(value = "messages", required = false) String messages,
        Map<String, Object> model
    ){
        //--todo model dumping feature in interceptor

        Map<String, Object> metaData = new HashMap<String, Object>();
        Map<String, String> pageData = new HashMap<String, String>();
        pageData.put("name", PageTypes.HOME);
        metaData.put("page", pageData);

        model.put("session", new Session(session));
        model.put("messages", messages);
        model.put("meta", metaData);

        model.put("modelJSON", UIhelpers.getJSONString(model));

        return "index";
    }

}
