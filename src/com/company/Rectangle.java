package com.company;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        super.setPerimeter(calculatePerimeter());

    }

    @Override
    public int calculateArea() {
        int areaRectangle;
        areaRectangle= length*width;
        return areaRectangle;
    }

    @Override
    public int calculatePerimeter() {
        int perimeterRectangle;
        perimeterRectangle = (length + width) *2;
        return perimeterRectangle;
    }

    @Override
    public String info() {
        return  "\nlength: " + length + Figure.unit +
                "\nwidth: " + width + Figure.unit +
                "\nperimeter: " + getPerimeter() + Figure.unit +
                "\narea: " + calculateArea() + Figure.unit ;
    }
}
