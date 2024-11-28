package com.kh.practice.list.library;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        BookMenu bookMenu = new BookMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Welcome KH Library =====");
        while (true) {
            System.out.println("=====***** 메인 메뉴*****=====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴번호 입력: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("===== 새 도서 추가 =====");
                    System.out.println("책 정보를 입력해주세요.");
                    System.out.print("도서명: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    System.out.print("저자명: ");
                    String bookAuthor = sc.next();
                    sc.nextLine();
                    System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타): ");
                    int bookCategory = sc.nextInt();
                    System.out.print("가격: ");
                    int bookPrice = sc.nextInt();
                    bookMenu.addBook(bookName, bookAuthor, bookCategory, bookPrice);
                    break;
                case 2:
                    bookMenu.allBooks();
                    break;
                case 3:
                    System.out.print("검색할 이름: ");
                    String name  = sc.next();
                    bookMenu.searchBook(name);
                    break;
                case 4:
                    System.out.print("삭제할 도서명: ");
                    String name1 = sc.next();
                    bookMenu.deleteBook(name1);
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;


            }
        }
    }
}
