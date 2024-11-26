package com.kh.poly.pack2.bookPre;

public class BookRun {
    public static void main(String[] args) {
        EBook Ebook = new EBook("자바프로그래밍","홍길동",20000,"15.5MB");
        PrintBook PrintBook = new PrintBook("파이썬입문","이영희",18000,3000);

        System.out.println(Ebook.toString());
        System.out.println(PrintBook.toString());
    }
}