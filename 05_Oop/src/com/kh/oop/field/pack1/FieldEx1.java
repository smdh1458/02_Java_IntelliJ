package com.kh.oop.field.pack1;

/*필드 속성(값)에 대한 정리*/
public class FieldEx1 {
    //필드(Field)
    // - 객체의 속성을 나타냄
    
    //- 필드 == 멤버 변수
    
    //*작성법*       ()친 것은 생략가능   생략가능
    /*(접근제한자)(예약어) 자료명 변수명 (=초기값);

    /*
    * 접근제한자 종류
    * public        = 어디서든 불러와서 사용 가능
    *
    * protected     = 같은 패키지에서는 접근 가능
    *                 다른 패키지에서 접근하려면 상속받은 클래스만
    *
    * default       = 접근제한자를 작성하지 않을 경우 기본값
    *                 같은 패키지 안에서만 접근가능
    *                 다른 패키지에서 접근 불가
    *
    * private       = 클래스 파일명 안에서만 접근 가능
    *                 외부 클래스에서 접근하려면 getter setter메서드를 사용
    * */

    //접근제한자에 따른 필드 선언

    public String 퍼블릭필드 = "공개빌드";
    protected String 프로텍트필드 = "보호된 필드";
    /*defualt*/String 디폴트필드 = "기본 접근 필드";
    private  String 프라이빗필드 = "비공개 필드";

    //모든 접근 제한자가 같은 클래스 내부에 접근 가능하기 때문에 오류가 없는 기능
    public void method1(){
        System.out.println(퍼블릭필드);
        System.out.println(프로텍트필드);
        System.out.println(디폴트필드);
        System.out.println(프라이빗필드);
    }
}
