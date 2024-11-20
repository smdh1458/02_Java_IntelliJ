package com.kh.loof;

import java.util.Scanner;

public class LoofDoWhile {
    /*
    * do-while문
    * - 조건식이 뒤에 작성된 while문
    * - 무조건 최소 1회 이상의 반복을 보장
    * */

    /*
    * 기능 (=methode, 메소드)
    * method1() 기능은
    * do-while을 이용해서 0이 입력될때까지 정수를 계속 입력받고
    * 0입력시 누적된 합계출력
    * */
    Scanner sc = new Scanner(System.in);

    public void method1() {
        int sum = 0; //합계 누적용 변수
        int input = 0; //입력한 값을 저장하는 변수

        do{//while문을 시작하기 전에 한 번 무조건 실행하는 공간
            //입력된 값이 0이 아닐때 반복
            System.out.println("정수 입력: ");
            input = sc.nextInt();//사용자가 키보드로 입력한 정수 가져오기
            sum += input;// 입력한 수를 sum변수에 계속 더하기를 진행하는 것
                        //sum에서 누적된 값이 얼마가 되던간에 input으로 들어온 값이 0이면 종료
        }while (input != 0);//input의 값이 0이 아닐때 do{} 기능을 계속 실행
        System.out.println("합계: " + sum);
    }
}
