package org.example.dz2.teacher;

public class Main {
    public static void main(String[] args) {
        Teacher newTeacher = new Teacher("Истомина Ирина Викторовна", "История");
        System.out.println(newTeacher.getName() + "\n" + newTeacher.getSubject());

        newTeacher.setSubject("География");
        newTeacher.printInfo();
    }
}
