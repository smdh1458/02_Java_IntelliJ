package com.kh.CollectionEx.pack2.setEx;

import java.util.Scanner;

public class 회원기능실행 {
    public static void main(String[] args) {
        회원기능 service = new 회원기능();


        회원 u1 = new 회원(1,"홍길동","hong@hkt.com","산타기");
        회원 u2 = new 회원(2,"강길자","gil@hkt.com","강구경하기");
        회원 u3 = new 회원(3,"박창실","shil@kht.com","십자수");

        service.addUser(u1);
        service.addUser(u2);
        service.addUser(u3);

        service.allUser();


        service.serachUser(2);


    }
}
