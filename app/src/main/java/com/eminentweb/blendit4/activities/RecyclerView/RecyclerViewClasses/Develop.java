package com.eminentweb.blendit4.activities.RecyclerView.RecyclerViewClasses;


public class Develop {

    String title;
    String excerpt;
    String image;

    public Develop(String title, String excerpt, String image) {
        this.title = title;
        this.excerpt = excerpt;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public String getImage() {
        return image;
    }
}
