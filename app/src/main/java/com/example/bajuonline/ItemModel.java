package com.example.bajuonline;

public class ItemModel {

    String name;
    String typpe;
    int image;

    public ItemModel(String name, String typpe, int image) {
        this.name = name;
        this.typpe = typpe;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyppe() {
        return typpe;
    }

    public void setTyppe(String typpe) {
        this.typpe = typpe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
