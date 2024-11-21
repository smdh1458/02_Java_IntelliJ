package com.kh.oop.methodPre;

public class VoidPre {
    //method 1: 온도 변화 확인하기
    public void method1(double celsius) {
         double fahrenheit = celsius * 1.8 + 32;

         System.out.println("섭씨 "+celsius+"도는 화씨 "+fahrenheit+"도 입니다.");
        System.out.println(" ");
    }
    //method 2: 학생이름 출력
    public void method2(String name) {
        System.out.println("학생이름: "+name);
        System.out.println(" ");
    }

    //method 3: 상품가격 표시
    public void method3(String itemName, int price) {
        System.out.println("상품명: "+ itemName + ", 가격: "+price+"원");
        System.out.println(" ");
    }

    //method 4: 시간계산
    public void method4(int hours, int minutes) {
        int time = hours*60 + minutes;
        System.out.println("총 " + time+"분 입니다.");
        System.out.println(" ");
    }

    //method 5: 운동 기록 출력
    public void method5(String exercise, int duration) {
        System.out.println("운동: "+ exercise + ", 지속시간: "+duration+"분");
        System.out.println(" ");
    }

    //method 6: 계좌 잔액 출력

    //%s = String   %d = int  %.숫자f=소수점표기   %n newline = 줄바꿈
    public void method6(String accountNumber, double balance) {
        //System.out.println("계좌번호: "+accountNumber +", 잔액: "+balance +"원");
        System.out.printf("계좌번호 : %s, 잔액: %.2f원%n", accountNumber, balance);
    }

    //method 7: 영화정보 출력
    public  void method7(String title, String rating) {
        System.out.println("영화제목: "+title +", 평점: "+rating);
        System.out.println(" ");
    }

    //method 8: 차량정보 출력
    public  void method8(String name1, int topSpeed) {
        System.out.println("차량명: "+name1+", 최고속도: "+topSpeed+"km/h");
        System.out.println(" ");
    }

    //method 9: 이메일 전송로그
    public  void method9(String recipient , String subject ) {
        System.out.println("수신자: "+recipient +", 제목: "+subject);
        System.out.println(" ");
    }

    //method 10: 쇼핑카트 아이템 출력
    public void method10(String itemName2, int quantity) {
        System.out.println("상품명: "+itemName2+", 수량: "+quantity+"개");
        System.out.println(" ");
    }
}
