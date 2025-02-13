package org.example.dz2.car;

/**
 * 1. Напишите класс Car
 * Поля:
 * String brand (марка машины),
 * int year (год выпуска).
 * Реализуйте:
 * Конструктор, который принимает brand и year.
 * Геттеры и сеттеры для обоих полей.
 * Метод print(), который выводит информацию о машине в формате:
 * "Марка: Toyota, Год выпуска: 2015".
 * В методе main создайте объект класса Car, установите значения через конструктор, измените год через сеттер и выведите информацию.
 */

public class Car {
     String brand;
     int year;

     public Car(String someBrand, int someYear) {
         this.brand = someBrand;
         this.year = someYear;
     }

     public String getBrand() {
         return brand;
     }
     public int getYear() {
         return year;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }
     public void setYear(int year) {
         this.year = year;
     }

     public void print() {
         System.out.println("Марка: " + getBrand());
         System.out.println("Год выпуска: " + getYear());

     }

}
