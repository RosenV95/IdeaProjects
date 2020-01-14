package com.valkov;

public class Wall {
    private double height;
    private double width;

    public Wall(){}

    public Wall(double width, double height) {
        this.width=width;
        this.height=height;
        if (height < 0) {
            this.height = 0;
        }
        if (width < 0) {
            this.width = 0;

        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width=width;
        if(this.width<0){
            this.width=0;
        }

    }
    public double getArea(){
        return this.width*this.height;
    }
}
