package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1.저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> usersList = new ArrayList<>();

    //2.스캐너 사용
    private Scanner sc = new Scanner(System.in);

    private ArrayList<User> usersList1 = new ArrayList<User>();
    //3.사용자 추가 기능 만들기!
    public void addUser() {
        System.out.print("아이디 입력: ");
        String name = sc.nextLine();
        System.out.print("비밀번호 입력: ");
        String password = sc.nextLine();
        System.out.print("이메일 입력: ");
        String email = sc.nextLine();

        User newUser = new User(name, password, email);
        usersList.add(newUser);
        System.out.println("유저 추가 완료");
    }

    //4.유저 목록 조회하기
    public void allUsers() {
        System.out.println("\n===== 추가된 사용자 목록 =====");
        //만약에 등록된 사용자가 없다면 "등록된 사용자가 없습니다" 출력
        if(usersList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        }else {
            // 하나는 주석처리해서 일반for문 하나는 향상된 for문
            //사용자가 1명이라도 존재한다면 향상된 for문을 이용해서 모두 출력

            /*
            for(int i=0;i<usersList.size();i++){
                System.out.println(usersList.get(i));
            }
            */

            for (User user : usersList) {
                System.out.println(user);
            }

        }
    }

    //5. 유저 삭제하기
    public void removeUser() {
        // ClothingStore 방법과 동일하게 유저이름을 찾고 유저를 제거
        System.out.print("삭제할 유저이름 입력: ");
        String name = sc.nextLine();
        boolean found = false; //삭제 여부를 확인하기 위한 변수

        for (int i = 0; i < usersList.size(); i++) {
            //만약에 사용자 이름이 유저목록에 일치하는 유저가 존재한다면
            if(usersList.get(i).getUsername().equals(name)) {
                usersList.remove(i); //해당하는 index 번호를 삭제
                System.out.println("삭제 완료");
                found = true;
                break; //삭제후 반복문 종료
            }
        }
        //만약에 일치하는 유저가 없다면
        if(!found) {
            System.out.println(name+"을 찾을수가 없습니다.");
        }
    }
}
