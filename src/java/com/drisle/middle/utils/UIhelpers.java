package com.drisle.middle.utils;

import com.drisle.middle.constants.PageTypes;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.text.html.CSS;
import java.io.IOException;
import java.util.*;

/**
 * Created by prashanth.a on 22/03/15.
 */
public class UIhelpers {

    public static ObjectMapper mapper;
    public static Map<String, String> cssFilesMap = new HashMap<String, String>();
    public static Map<String, String> jsFilesMap = new HashMap<String, String>();

    static {
        mapper = new ObjectMapper();

        cssFilesMap.put(PageTypes.HOME, "home.min.css");
        cssFilesMap.put(PageTypes.SIGNIN, "home.min.css");
        cssFilesMap.put(PageTypes.SIGNOUT, "home.min.css");
        cssFilesMap.put(PageTypes.TEAM_PROFILE, "teamprofile.min.css");
        cssFilesMap.put(PageTypes.USER_PROFILE, "userprofile.min.css");

        jsFilesMap.put(PageTypes.HOME, "home.min.js");
        jsFilesMap.put(PageTypes.SIGNIN, "home.min.js");
        jsFilesMap.put(PageTypes.SIGNOUT, "home.min.js");
        jsFilesMap.put(PageTypes.TEAM_PROFILE, "teamprofile.min.js");
        jsFilesMap.put(PageTypes.USER_PROFILE, "userprofile.min.js");

    }

    public static String getJSONString(Object object){
        try {
            return (mapper.writeValueAsString(object));
        } catch (IOException ex) {
            return "{}";
        }
    }

    public static List<String> cssFiles(String page){
        return Arrays.asList(cssFilesMap.get(page).split(","));
    }

    public static List<String> jsFiles(String page){
        return Arrays.asList(jsFilesMap.get(page).split(","));
    }

}
