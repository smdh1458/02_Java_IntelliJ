package com.variable.practice;

import java.util.Scanner;
//자동정렬 단축키 -> Ctrl + Alt + L
//한줄 복사       -> Ctrl + D
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("국어: ");
        double ko = sc.nextDouble();

        System.out.print("영어: ");
        double eng = sc.nextDouble();

        System.out.print("수학: ");
        double math = sc.nextDouble();

        //()우선순위 진행 국어+수학+영어 점수 더한 다음에 강제형변환 진행
        int sum = (int)(ko + eng + math);
        int average = sum / 3;

        System.out.print("총점: "+sum);
        System.out.println(" ");
        System.out.print("평균: "+average);
    }
}
