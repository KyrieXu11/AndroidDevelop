package com.kyriexu.homework02;

public enum Color {
    PINK("#FFC0CB"),PURPLE("#BF3EFF"),GREEN("#98FB98"),BLUE("#5CACEE"),DEFAULT("#8BC34A");

    public String getColor() {
        return color;
    }

    private String color;

    Color(String color) {
        this.color = color;
    }

    public static Color getColor(int i){
        switch (i){
            case 0:
                return PINK;
            case 1:
                return PURPLE;
            case 2:
                return GREEN;
            case 3:
                return BLUE;
        }
        return DEFAULT;
    }
}
