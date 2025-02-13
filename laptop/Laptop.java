package org.example.dz2.laptop;

/**
 * 10. Реализуйте класс Laptop
 * Поля:
 * String brand (бренд),
 * double price (цена).
 * Реализуйте:
 * Конструктор для задания бренда и цены.
 * Геттеры и сеттеры для обоих полей.
 * Метод printInfo() для вывода:
 * "Ноутбук: Lenovo, Цена: 70000.0 руб.".
 * В методе main измените цену через сеттер и выведите обновлённую информацию.
 */

public class Laptop {
    String brand;
    double price;

    public Laptop(String someBrand, double somePrice) {
        this.brand = someBrand;
        this.price = somePrice;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    public void setBrand(String someBrand) {
        this.brand = someBrand;
    }
    public void setPrice(double somePrice) {
        this.price = somePrice;
    }

     void printInfo(){
        System.out.println("Ноутбук: " + brand + ", Цена: " + price);
    }

}
