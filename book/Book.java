package org.example.dz2.book;

/**
 * 3. Создайте класс Book
 * Поля:
 * String title (название книги),
 * String author (автор).
 * Реализуйте:
 * Конструктор для задания названия и автора.
 * Геттеры и сеттеры для обоих полей.
 * Метод printInfo(), который выводит:
 * "Название: Гарри Поттер, Автор: Джоан Роулинг".
 * В методе main создайте объект книги, измените автора через сеттер и выведите информацию.
 */

public class Book {
    String title;
    String author;

    public Book(String someTitle, String someAuthor) {
        this.author = someAuthor;
        this.title = someTitle;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo() {
        System.out.println("Название книги: " + title +  "\nНазвание автора: " + author);
    }
}
