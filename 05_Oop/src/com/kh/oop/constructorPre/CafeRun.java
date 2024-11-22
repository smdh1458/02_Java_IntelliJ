package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe cf1 = new Cafe();
        System.out.print("메뉴명: ");
        String name = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("수량: ");
        int quantity = sc.nextInt();

        /*
        cf1.setName(name);
        cf1.setPrice(price);
        cf1.setQuantity(quantity);
        */

        Cafe cf2 = new Cafe(name, price, quantity);

        //System.out.println(cf1.toString());
        System.out.println(cf2.toString());
        System.out.println("총 합계: "+ cf2.result(price, quantity));
    }
}
