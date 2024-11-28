package com.kh.practice.list.library;

import java.util.ArrayList;

public class BookMenu {
    Book book = new Book();
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author, int category,int price) {
       Book b1 = new Book(title, author, category, price);
       books.add(b1);
       System.out.println(title+" 추가 완료!");
    }

    public void allBooks() {
        System.out.println("=== 도서 전체 조회 ===");
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
    }

    public void searchBook(String title) {
        System.out.println("==== 도서 검색 ====");
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                System.out.println(b.toString());
            }else {
                System.out.println("일치하는 책이 없습니다.");
            }

        }
    }

    public void deleteBook(String title) {
        System.out.println("====도서 삭제====");
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                books.remove(b);
                System.out.println(title+"이(가) 삭제되었습니다.");
                break;
            }
        }
    }
}
