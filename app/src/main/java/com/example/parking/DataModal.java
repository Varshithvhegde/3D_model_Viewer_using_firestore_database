package com.example.parking;

public class DataModal {

    // variables for storing our image and name.
    private String name;
    private String imgUrl;
    private String modurl;
    public DataModal() {
        // empty constructor required for firebase.
    }

    // constructor for our object class.
    public DataModal(String name, String imgUrl,String modurl) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.modurl = modurl;
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getModurl(){return modurl;}

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
