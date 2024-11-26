package com.kh.inheritanceEx;

//자식이 부모의 무언가를 상속받음
public class 자식 extends 부모{

    //추가 필드
    private String 취미;

    //기본생성자
    public 자식(){
        super();//부모의 기본 생성자를 무조건적으로 호출하기 때문에 super!

    }

    //필수생성자
    public 자식(String 성씨, String 주소, int 돈, String 차){
        super(성씨, 주소, 돈, 차);

        this.취미 = 취미;
    }

    //setter
    public void set취미(String 취미){
        this.취미 = 취미;
    }

    //getter

    public String get취미() {
        return 취미;
    }


    //부모 클래스의 기능(매서드)를 오버라이딩
    //돈 차 private이기 때문에 get돈 get차로 가지고 올 수 있음


    @Override
    public String toString() {
        return "자식{" + super.toString() + '\''+
                "취미='" + 취미 + '\'' +
                ", 성씨='" + 성씨 + '\'' +
                ", 주소='" + 주소 + '\'' +
                '}';
    }
}

