package org.example.dz2.book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг");
        book1.printInfo();

        book1.setAuthor("Дж.Р.Р.Толкин");
        book1.setTitle("Властелин колец");

        book1.printInfo();

        book1.setAuthor("Стивен Кинг");
        book1.setTitle("Оно");

        book1.printInfo();

    }
}
