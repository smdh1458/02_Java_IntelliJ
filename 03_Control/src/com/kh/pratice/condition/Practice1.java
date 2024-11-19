package com.kh.pratice.condition;

import java.util.Objects;
import java.util.Scanner;

public class Practice1 {
    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호를 입력하세요: ");
        //메뉴 번호 입력받기
        int choice = sc.nextInt();
        String result = "";

        switch (choice) {
            case 1:
                result = "입력";
                break;

            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;

            case 4:
                result = "삭제";
                break;
            case 7:
                result = "종료";
                break;
            default:
                System.out.println("잘못된 번호 조회입니다.");
                return;
        }
        System.out.println(result + " 메뉴 입니다.");
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int number = sc.nextInt();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        } else {
            System.out.println("음수입니다.");
        }
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);
        String Id = "myId";
        String Pw = "myPassword12";

        System.out.print("아이디 입력: ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호 입력: ");
        String inputPw = sc.nextLine();

        if(inputPw.equals(Id) && inputId.equals(Pw)) {
            System.out.println("아이디와 비밀번호가 모두 일치합니다.");
        }
         if(inputId.equals(Id)){
             System.out.println("아이디가 일치합니다.");
         }

         if(inputPw.equals(Pw)){
             System.out.println("비밀번호가 일치합니다.");
         }
        /*
        ==부등호
        if (inputId == Id && inputPw == Pw) {
            System.out.println("로그인성공!");
        } else if (inputId != Id) {
            System.out.println("아이디가 틀렸습니다.");
            System.out.println("비밀번호가 틀렸습니다.");
        } else if (inputPw != Pw) {
            System.out.println("비밀번호가 틀렸습니다.");
        }else {
            System.out.println("모두 틀렸습니다.");
        }*/
    }
}
