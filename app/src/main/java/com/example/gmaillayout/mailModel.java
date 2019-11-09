package com.example.gmaillayout;

public class mailModel {

    private String username;
    private String content;
    private String title;
    private String time;
    private int avatar;
    private boolean selected;

    public mailModel(String username,String title , String content, int avatar,String time ) {
        this.username = username;
        this.title= title;
        this.content = content;
        this.avatar = avatar;
        this.time = time;
        this.selected = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
