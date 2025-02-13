package org.example.dz2.product;

/**
 * 9. Напишите класс Product
 * Поля:
 * String name (название товара),
 * double price (цена).
 * Реализуйте:
 * Конструктор для задания имени и цены.
 * Геттеры для получения данных.
 * Сеттер для изменения цены.
 * Метод applyDiscount(double discount) для уменьшения цены на discount процентов.
 * Метод printInfo() для вывода:
 * "Товар: Хлеб, Цена: 50.0 руб.".
 * В методе main измените цену через сеттер, примените скидку и выведите новую цену.
 */

public class Products {
    String name;
    double price;

    public Products(String sName, double sPrice) {
        this.name = sName;
        this.price = sPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String sName) {
        this.name = sName;
    }

    public void setPrice(double sPrice) {
        this.price = sPrice;
    }

    public double applyDiscount(double discountPercentage) {
        this.price = this.price * (1 - discountPercentage/100);
        return price;
    }

    public void printInfo() {
        System.out.println("Товар: " + getName() + "\nЦена: " + getPrice());
    }

    public void printDiscountPrice() {
        System.out.println("Цена со скидкой: " + this.price);
    }
}
