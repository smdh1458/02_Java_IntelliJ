package com.kh.CollectionEx.listPre;

import java.util.Scanner;

public class DrinkServiceRun {
    public static void main(String[] args) {
        //1. DrinkService소환
        DrinkService drinkService = new DrinkService();
        //2.스캐너 소환
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★ 음료 공장 메뉴 ★★★★★★");
            System.out.println("1. 음료 추가");
            System.out.println("2. 음료 목록 보기");
            System.out.println("3. 음료 검색(이름으로 검색)");
            System.out.println("4. 음료 검색(가격으로 검색)");
            System.out.println("5. 음료 삭제하기");
            System.out.println("6. 종료");
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.print("원하는 작업 번호를 선택하세요: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("------음료 추가하기 --------");
                    System.out.print("음료 이름을 입력: ");
                    String name = scanner.next();
                    System.out.print("음료 가격을 입력: ");
                    int price = scanner.nextInt();
                    drinkService.addDrink(name, price);
                    break;
                case 2:
                    //음료 조회 공간 설정
                    drinkService.allDrinks();
                    break;
                case 3:
                    //이름으로 검색해서 조회하기
                    System.out.print("검색할 이름 입력: ");
                    String searchName = scanner.next();
                    drinkService.searchDrink(searchName);
                    break;
                case 4:
                    //가격 검색조회
                    System.out.print("검색할 가격 입력: ");
                    int searchPrice = scanner.nextInt();
                    drinkService.searchDrink(searchPrice);
                    break;
                case 5:
                    //음료 이름 검색해서 삭제
                    System.out.print("삭제할 음료 입력: ");
                    String deleteName = scanner.next();
                    drinkService.removeDrink(deleteName);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 번호를 입력했습니다. 재입력해주세요.");
                    break;
            }
        }


    }
}
