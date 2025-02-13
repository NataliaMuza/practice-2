package org.example.dz2.point;

/**
 * 5. Напишите класс Point
 * Поля:
 * int x (координата x),
 * int y (координата y).
 * Реализуйте:
 * Конструктор для задания координат.
 * Геттеры для получения значений координат.
 * Сеттер для изменения значения x.
 * Метод print() для вывода координат в формате:
 * "Координаты: x = 5, y = 10".
 * В методе main измените координату x и выведите новые координаты.
 */

public class Point {
    int x;
    int y;

    public Point(int someX, int someY) {
        this.x = someX;
        this.y = someY;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int someX) {
        this.x = someX;
    }

    public void printInfo(){
        System.out.println("Координаты: " + " " + "x=" + x + ", " + "y=" + y);
    }

}
