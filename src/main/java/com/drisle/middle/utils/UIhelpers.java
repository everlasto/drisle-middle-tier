package com.drisle.middle.utils;

import com.drisle.middle.constants.PageTypes;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
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
    public static List<String> sharedJsFiles = new ArrayList<String>();;
    public static List<String> sharedCssFiles = new ArrayList<String>();
    public static final String externalPath = "http://controller-mess-31125.bitballoon.com/";

    static {
        mapper = new ObjectMapper();

        cssFilesMap.put(PageTypes.HOME, "home-page.css");
        cssFilesMap.put(PageTypes.SIGNIN, "home.min.css");
        cssFilesMap.put(PageTypes.SIGNOUT, "home.min.css");
        cssFilesMap.put(PageTypes.TEAM_PROFILE, "teamprofile.min.css");
        cssFilesMap.put(PageTypes.USER_PROFILE, "userprofile.min.css");

        sharedJsFiles.add("jquery-2.1.3.min");
        sharedJsFiles.add("rivets.bundled.min.js");

        jsFilesMap.put(PageTypes.HOME, "home-page.js");
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

    public static String echoText(){return "test-string";}

    public static List<String> cssFiles(String page){
        List<String> configured_files = Arrays.asList(cssFilesMap.get(page).split(","));

        List<String> all_files = new ArrayList<String>();

        for(String file : configured_files){
            all_files.add(externalPath + "css/dev/" + file);
        }

        for(String file : sharedCssFiles){
            all_files.add(externalPath + "css/shared/" + file);
        }

        return all_files;
    }

    public static List<String> jsFiles(String page){
        List<String> configured_files = Arrays.asList(jsFilesMap.get(page).split(","));

        List<String> all_files = new ArrayList<String>();

        for(String file : configured_files){
            all_files.add(externalPath + "js/dev/" + file);
        }

        for(String file : sharedJsFiles){
            all_files.add(externalPath + "js/shared/" + file);
        }

        return all_files;
    }

}
