package org.example.dz2.point;

public class Main {
    public static void main (String[] args) {
        Point point1 = new Point(5,9);
        point1.printInfo();

        point1.setX(7);
        point1.printInfo();

        point1.getX();
        System.out.println(point1.getX());
    }
}
