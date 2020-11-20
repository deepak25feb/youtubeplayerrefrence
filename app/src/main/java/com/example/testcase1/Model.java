package com.example.testcase1;

public class Model {
    String title;
    int imgResId;

    public Model(String title, int imgResId) {
        this.title = title;
        this.imgResId = imgResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }
}
