package com.drisle.middle.services;

import javax.servlet.http.HttpSession;

/**
 * Created by prashanth.a on 22/03/15.
 */
public class Session {
    String name, pic, id;

    public Session(HttpSession session) {
        name = "";
        pic = "";
        id = "";
        if(session!=null && session.getAttribute("id")!=null){
            id = session.getAttribute("id").toString();
            name = session.getAttribute("name").toString();
            pic = session.getAttribute("pic").toString();
        }
    }

    public boolean loggedIn(){
        return id.isEmpty();
    }

    public boolean test(){
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
