package org.example.dz2.circle;

/**
 * 7. Напишите класс Circle
 * Поля:
 * double radius (радиус).
 * Реализуйте:
 * Конструктор для задания радиуса.
 * Геттер для получения радиуса.
 * Сеттер для изменения радиуса.
 * Метод calculateArea(), который возвращает площадь (πr2\pi r^2).
 * Метод calculateCircumference(), который возвращает длину окружности (2πr2 \pi r).
 * В методе main создайте круг, измените радиус через сеттер и выведите площадь и длину окружности.
 */

public class Circle {
    double radius;

    public Circle(double someRadius) {
        this.radius = someRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double someRadius) {
        this.radius = someRadius;
    }

    public double calculateArea(double someRadius){
        return Math.PI * radius * radius;
    }

    public double alculateCircumference(double someRadius){
        return 2 * Math.PI * radius;
    }


}
