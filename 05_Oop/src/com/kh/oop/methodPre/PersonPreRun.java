package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        PersonPre p1 = new PersonPre();
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력: ");
        int age = sc.nextInt();
        //trim() -> 좌우 띄어쓰기와 같은 공백 제거
        //공백제거한 값의 총 글자길이를 length()로 길이가 존재하는지 확인
        //trim().length() 대신에 isEmpty() 값이 들어있는지 비어있는지 유무확인
        if(name.trim().length() == 0){// 자바스크립트에서도 썼던 놈
            System.out.println("빈칸은 이름으로 들어갈 수 없습니다.");
        }else if(age<=0){
            System.out.println("나이는 0이나 음수일 수 없습니다.");
        }else {
            p1.setName(name);
            p1.setAge(age);
            System.out.println("이름: "+p1.getName()+"나이:" + p1.getAge());
        }
        //if(p1.getName() != null && p1.getAge() > 0 ){
        //System.out.println(p1.getName());
        //System.out.println(p1.getAge());

    }
}
