package com.example.myapplication;

public class Man {
    private String name;
    private int ImageId;

    public Man(String user1, int image1) {
        this.name   = user1;
        this.ImageId = image1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
