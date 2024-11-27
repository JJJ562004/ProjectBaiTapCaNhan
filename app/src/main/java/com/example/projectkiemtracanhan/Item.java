package com.example.projectkiemtracanhan;

public class Item {

    private String name;
    private int quant;
    private String qual;
    private int imageID;

    public Item(int imageID, String name, String qual, int quant) {
        this.imageID = imageID;
        this.name = name;
        this.qual = qual;
        this.quant = quant;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getQual() {
        return qual;
    }

    public int getQuant() {
        return quant;
    }
}
