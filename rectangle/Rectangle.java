package org.example.dz2.rectangle;

/**
 * 2. Напишите класс Rectangle
 * Поля:
 * int width (ширина),
 * int height (высота).
 * Реализуйте:
 * Конструктор для задания ширины и высоты.
 * Геттеры для получения значений ширины и высоты.
 * Сеттер для изменения ширины.
 * Метод calculateArea(), который возвращает площадь прямоугольника.
 * В методе main создайте прямоугольник, измените ширину через сеттер и выведите его площадь.
 */

public class Rectangle {
    int width;
    int height;

    public Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public void setWidth(int someWidth) {
        this.width = someWidth;
    }
    public void setHeight(int someHeight) {
        this.height = someHeight;
    }

    public int calculateArea() {
        return this.width * this.height;
    }

    public void print() {
        System.out.println("Ширина прямоугольника: " + getWidth() + " " + "Высота прямоугольника: " + getHeight());
    }

}
