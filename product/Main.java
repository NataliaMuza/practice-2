package org.example.dz2.product;

public class Main {
    public static void main(String[] args){

        Products prod1 = new Products("Сыр", 99.9);

        prod1.printInfo();

        prod1.setPrice(89.99);
        System.out.println("Новая цена: " + prod1.getPrice());


        prod1.applyDiscount(50);
        prod1.printDiscountPrice();
        prod1.printInfo();

    }
}
