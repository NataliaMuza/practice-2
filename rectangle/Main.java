package org.example.dz2.rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(5,3);

        rec1.print();

        rec1.setWidth(8);
        rec1.setHeight(4);

        System.out.println("Новая ширина: " + rec1.getWidth() + " " + "\nНовая высота: " + rec1.getHeight());
        System.out.println("Площадь прямоугольника 1: " + rec1.calculateArea());

        Rectangle rec2 = new Rectangle(5,3);

        rec2.setWidth(10);
        rec2.setHeight(5);
        System.out.println("Площадь прямоугольника 2: " + rec2.calculateArea());

        Rectangle rec3 = new Rectangle(5,3);

        rec2.setWidth(5);
        rec2.setHeight(3);
        System.out.println("Площадь прямоугольника 3: " + rec3.calculateArea());



    }
}
