package com.kh.pratice.condition;

import java.util.Scanner;

public class ConditionPre {
    public void methodAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하슈: ");
        int age = sc.nextInt();

        switch (age / 10) {
            case 0:
            case 1:
                System.out.println("어린이유");
                break;
            case 2:
                if (age <= 18) {
                    System.out.println("청소년이유");
                } else {
                    System.out.println("어른이유");
                }
                break;
            default:
                System.out.println("성인이유");
                break;
        }
    }
}
