package org.example.dz2.laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", 1500);
        laptop1.printInfo();

        laptop1.setPrice(1400.50);
        laptop1.printInfo();
    }
}
