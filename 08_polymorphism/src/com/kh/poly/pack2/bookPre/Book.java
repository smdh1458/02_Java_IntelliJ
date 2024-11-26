package com.kh.poly.pack2.bookPre;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Book" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price ;
    }

    /*
    toString 을 적지 않으면 아래와 같이 주소값이 나옴
    EBook{com.kh.poly.pack2.bookPre.EBook@404b9385'
    PrintBook{com.kh.poly.pack2.bookPre.PrintBook@15aeb7ab
     */
}
