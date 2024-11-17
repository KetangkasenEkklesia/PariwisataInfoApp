package com.example.pariwisatainfoapp;

public class ItemList {
    private int imageview;
    private String location;
    private String desc;
    private String descdetail;

    public ItemList(int imageview, String location, String desc, String descdetail) {
        this.imageview = imageview;
        this.location = location;
        this.desc = desc;
        this.descdetail = descdetail;
    }

    public int getImageview() {
        return imageview;
    }

    public String getLocation() {
        return location;
    }

    public String getDesc() {
        return desc;
    }

    public String getDetail() {
        return descdetail;
    }
}
