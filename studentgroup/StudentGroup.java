package org.example.dz2.studentgroup;
/**
 * 6. Создайте класс StudentGroup
 * Поля:
 * String groupName (название группы),
 * int studentCount (количество студентов).
 * Реализуйте:
 * Конструктор для задания названия группы и количества студентов.
 * Геттеры и сеттеры для обоих полей.
 * Метод printInfo() для вывода информации о группе:
 * "Группа: QA, Количество студентов: 25".
 * В методе main измените количество студентов через сеттер и выведите обновлённую информацию.
 */

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    public String getGroupName() {
        return groupName;
    }
    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String someGroupName) {
        this.groupName = someGroupName;
    }
    public void setStudentCount(int someStudentCount) {
        this.studentCount = someStudentCount;
    }

    public void printInfo() {
        System.out.println("Группа: " + this.groupName  + "\n" + "Количество студентов: " + this.studentCount);
    }
}
