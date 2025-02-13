package org.example.dz2.circle;

public class Main {
    public static void main (String[] args) {

        Circle circle1 = new Circle(15.5);
        System.out.println(circle1.getRadius());

        circle1.setRadius(17.5);
        double area1 = circle1.calculateArea(17.5);
        System.out.println("Площадь окружности: " + area1);

        double cirCumf1 = circle1.alculateCircumference(17.5);
        System.out.println("Длина окружности: " + cirCumf1);
    }
}
