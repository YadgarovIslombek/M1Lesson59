package com.example.m1lesson59.model;

public class ChatModel {
    private String name;
    private String msg;
    private String date;
    private String img;

    public ChatModel(String name, String msg, String date, String img) {
        this.name = name;
        this.msg = msg;
        this.date = date;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
