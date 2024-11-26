package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class ClothStoreRun {
    public static void main(String[] args) {
        //1. 스캐너 소환
        Scanner sc = new Scanner(System.in);

        //2. ClothingStore 소환
        ClothingStore cs = new ClothingStore();
        while (true){
            System.out.println("\n 쇼핑몰 옷 관리 프로그램 ----");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 목록 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); //int에 남아있는 잔여 줄바꿈 지우기
            //switch choice로 사용자에게 특정 번호를 받고
            //특정 번호에 맞는 case에서
            //해당하는 기능을 실행할 수 있도록 만든 조건문
            if(choice == 1){
                System.out.print("옷 이름: ");
                String name = sc.nextLine();

                System.out.print("카테고리(상의/하의/외투 등): ");
                String category = sc.nextLine();

                System.out.print("가격(숫자만 입력): ");
                int price = sc.nextInt();
                sc.nextLine();

                cs.addClothing(name,category,price);

            }else if(choice == 2){
                cs.allClothing();

            }else if(choice == 3){
                System.out.println("프로그램을 종료합니다.");
                return;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }



        }
    }
}
