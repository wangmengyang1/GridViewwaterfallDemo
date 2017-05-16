package com.example.administrator.mygridviewdemo;

import android.widget.ImageView;

/**
 * Created by Administrator on 2017/5/16.
 */
public class GridViewEntry {
    private int image;
    private String name;

    public GridViewEntry(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
