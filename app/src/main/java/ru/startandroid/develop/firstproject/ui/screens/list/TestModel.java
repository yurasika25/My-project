package ru.startandroid.develop.firstproject.ui.screens.list;

import android.net.Uri;

class TestModel{

    private String title;
    private String worlds;
    private String time;

    public TestModel(Uri parse) {
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }

    private Uri image;

    public TestModel(Uri image, String title, String worlds, String time) {
        this.title = title;
        this.image = image;
        this.worlds = worlds;
        this.time = time;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorlds() {return worlds;}

    public void setWorlds (String worlds) {this.worlds = worlds;}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
