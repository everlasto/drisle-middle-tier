package com.drisle.middle.entities;

import com.drisle.middle.constants.FeedTypes;

/**
 * Created by prashanth.a on 18/03/15.
 */
public class FeedResponse {

    String id;
    int time;
    boolean isStatus;
    String teamId;
    String authorId;
    String content;
    int type;
    int likes;
    String media;

    Object teamDetail;
    boolean canEdit;

    public FeedResponse() {
        type = FeedTypes.INVALID;
    }

    public static String getField(String fname){
        try{
            return FeedResponse.class.getDeclaredField(fname).toString().length()>0?fname:null;
        }
        catch (NoSuchFieldException e){
            //--log invalid field type selected exception
            return null;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Object getTeamDetail() {
        return teamDetail;
    }

    public void setTeamDetail(Object teamDetail) {
        this.teamDetail = teamDetail;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
