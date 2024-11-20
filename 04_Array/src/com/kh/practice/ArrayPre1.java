package com.kh.practice;

import java.util.Scanner;

public class ArrayPre1 {
    Scanner sc = new Scanner(System.in);

    public void practice3() {
        System.out.print("배열 크기 입력: ");
        int size = sc.nextInt();
        if (size >= 0) {
            System.out.println("양의 정수를 입력하세요.");
            return;// 프로그램을 종료
        } else {
            int array[] = new int[size];
            //사용자가 size 변수명에 5를 입력했다면 -> int[] arr = new int[5];
            for (int i = 0; i < size; i++) {
                array[i] = i + 1; //1부터 size까지 호출
            }
            //배열 출력 (일반 for문 사용)
            for (int i = 0; i < array.length; i++) { //size = arr.length는 같음
                System.out.print(array[i] + " ");
            }
        }
    }


    public void practice4() {
        String[] fr = {"사과","귤","포도","복숭아","참외"};
        System.out.println(fr[0]);
        System.out.println(fr[1]);
        System.out.println(fr[2]);
        System.out.println(fr[3]);
        System.out.println(fr[4]);
    }

    public void practice6() {
        char[] arr = new char[14];//123456-1234567
        System.out.print("주민등록 번호(-포함)를 입력하세요: ");
        String input = sc.nextLine();

        //문자열.length() : 문자열의 길이를 반환하는 메서드
        // 배열.length() : 배열 길이를 반환하는 필드
        int len = input.length();
        for (int i = 0; i < len; i++) {
            // 성별 부분 전 까지는 그대로 배열에 저장
            // index = 7까지는 그대로 넣어주기
            if( i <=7){
                //charAt = 문자열에서 특정 위치를 반환
                arr[i] = input.charAt(i);//0~7까지 배열에 저장
            }else {//8번부터는 모두 *로 저장
                arr[i] = '*';
            }
        }
        //반드시 결과는 for문이 종료된 }밑에 작성
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void practice6A() {
        System.out.print("전화번호 입력 - 포함: ");
        String input = sc.nextLine();
        char[] arr = new char[17];

        //문자열 길이와 char 배열 길이 활용
        for (int i = 0; i < input.length(); i++) {
            if(i <= 7) {
                arr[i] = input.charAt(i);
            }else {
                arr[i] = '*';
            }
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    /* 국가번호
    *  +82-고정
    *  사람들이 작성한 핸드폰 번호만 이어서 출력
    * */
    public void practice6B() {
        //+82- 고정, 나머지 번호를 입력받아 이어 작성
        String contryCode = "+82-";

        System.out.print("전화번호 입력 - 포함: ");
        String input = sc.nextLine();


        //전화번호 전체 길이를 계산하기 위해 국가번호 + 핸드폰 번호 합치기
        String fullNumber = contryCode + input;// +82- 포함한 전체번호

        //전화번호를 저장할 char 배열 생성
        char[] arr = new char[fullNumber.length()];//전화번호 전체길이크기가 반영된 배열 생성

        //문자열 길이와 char 배열 길이 활용
        for (int i = 0; i < fullNumber.length(); i++) {
            if(i <= 7) {
                arr[i] = fullNumber.charAt(i);
            }else {
                arr[i] = '*';
            }
        }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
