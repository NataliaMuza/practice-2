package org.example.dz2.teacher;

/**
 * 8. Реализуйте класс Teacher
 * Поля:
 * String name (имя учителя),
 * String subject (предмет).
 * Реализуйте:
 * Конструктор для задания имени и предмета.
 * Геттеры и сеттеры для обоих полей.
 * Метод printInfo() для вывода:
 * "Учитель: Анна Ивановна, Предмет: Математика".
 * В методе main создайте объект учителя, измените предмет через сеттер и выведите информацию.
 */

public class Teacher {
    String name;
    String subject;

    public Teacher(String someName, String someSubject) {
        this.name = someName;
        this.subject = someSubject;
    }

    public String getName() {
        return this.name;
    }
    public String getSubject() {
        return this.subject;
    }

    public void setName(String someName){
        this.name = someName;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Учитель: " + name + "\nПредмет: " + subject);
    }
}
