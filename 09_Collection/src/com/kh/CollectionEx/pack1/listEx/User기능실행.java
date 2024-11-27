package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {
        //1. 스캐너 소환
        Scanner sc = new Scanner(System.in);
        //2.User기능 클래스 소환
        User기능 userStore = new User기능();

        while (true) {
            System.out.println("\n ----- 사용자 관리 프로그램 -----");
            System.out.println("1.사용자 추가");
            System.out.println("2.추가된 유저 목록 모두 조회");
            System.out.println("3. 유저 삭제");
            System.out.println("4.프로그램 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            //switch를 이용해서 choice로 사용자가 사용하고자 하는 기능의 번호를 입력받고
            //입력받은 번호는 case를 이용해서 해당하는 기능 실행
            switch (choice) {
                case 1:
                    userStore.addUser();
                    break;
                case 2:
                    userStore.allUsers();
                    break;
                case 3:
                    //유저삭제기능
                    userStore.removeUser();
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }

    }

}
