package com.company;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(10, 20),
                new Rectangle(22, 8),
                new Square(9),
                new Square(15),
                new Square(10)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].info());
        }
    }
}


