package org.example.dz2.studentgroup;

public class Main {
    public static void main (String[] args) {

        StudentGroup group1 = new StudentGroup("QA", 25);
        group1.printInfo();

        group1.setGroupName("AQA");
        group1.setStudentCount(30);
        group1.printInfo();
    }
}
