package com.colorsVote.colorsVote.entity;

public class Colors {
    private String colorName;
    private int colorVote;

    public Colors(String colorName, int colorVote) {
        this.colorName = colorName;
        this.colorVote = colorVote;
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorVote() {
        return colorVote;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setColorVote(int colorVote) {
        this.colorVote = colorVote;
    }
}
