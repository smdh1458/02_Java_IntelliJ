package com.kh.oop.methodPre;

public class ReturnPre1 {
    public String name = "홍길동"; //이름
    public int phone = 1234;//핸드폰 번호
    public String id = "dongdong1004";//아이디

    //이름과 핸드폰 번호가 일치하는 아이디를 전달하기
    public String findId(String a,int b){
        //return "dongdong1004";
        if(name.equals(a)&&phone == b){
            return id;
        }

        /*if(name.equals(a)){
            return id;
        }
        if(phone==b){ //기본타입은 == 사용
            return id;
        }*/
        //일치하지 않는 고객이라면 조회된 정보가 없습니다.
        return "아이디를 찾을 수 없습니다.";


        //만약에 이름과 핸드폰 번호가 일치하는 고객이라면 아이디를 전달

        //일치하지 않는 고객이라면 조회된 정보가 없습니다. 전달

    }

    //계산기
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        return a/b;
    }
}
