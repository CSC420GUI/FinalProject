package com.example.dylanrichmond.swype01;


import android.graphics.drawable.Drawable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Listing {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String image;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("description")
    @Expose
    private String itemDescription;
    @SerializedName("location")
    @Expose
    private String location;

    public String getItemTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setItemDescription(String itemDescription){
        this.itemDescription = itemDescription;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}