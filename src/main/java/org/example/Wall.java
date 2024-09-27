package org.example;

import java.security.PublicKey;

public class Wall {
    public  double height,width;

    public Wall(double height,double width){
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public  double getArea(){
        return  width * height;
    }
}
