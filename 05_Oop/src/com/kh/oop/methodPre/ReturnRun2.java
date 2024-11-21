package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 r2 = new ReturnPre2();
        System.out.println(r2.method1("홍길동",40));

        System.out.println(r2.method2(123,456));

        System.out.println(r2.method3(85));

        System.out.println(r2.method4(100000,20));

        double[] numbers = {10,20,30,40,50};
        System.out.printf("평균값 : %.1f%n",r2.method5(numbers));

        System.out.println(r2.method6(17));

        System.out.println(r2.method7("Hello", "World"));

        String[] fr = {"apple", "banana", "cherry"};
        System.out.println(r2.method8(fr,"banana"));

        System.out.println(r2.method9(7));
    }
}
