package com.kh;

import java.util.Scanner;
//줄바꿈 단축키 Alt + Shift + 화살표 위 / 아래
public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름는?: ");
        String name = sc.next(); //사용자가 키보드로 입력하는 이름을 입력받는 공간

        System.out.print("나이는?:");//사용자가 키보드로 입력하는 나이를 받는 공간
        int age = sc.nextInt();

        System.out.print("취미는: ");
        String hobby = sc.next(); //사용자가 키보드로 입력하는 취미를 받는 공간

        System.out.println("===== 자기소개 =====");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("취미: " + hobby);
    }
}
