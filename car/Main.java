package org.example.dz2.car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("kia", 2022);

        car1.print();

        car1.setYear(2025);
        car1.setBrand("BMW");

        System.out.println("Новая машина 1: " + " " + car1.brand + " " + car1.year);

        Car car2 = new Car("kia", 2025);

        car2.print();

        car2.setYear(2024);
        car2.setBrand("Audi");

        System.out.println("Новая машина 2: " + " " + car2.brand + " " + car2.year);

    }
}
