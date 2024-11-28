package com.kh.CollectionEx.pack3.MapEx;

import java.util.HashMap;

public class SnackService {
    //method1 과자이름 가격 추가
    //구름과자 2000
    //HashMap<String Integer> snackList
    //put 추가 출력
    //스캐너 사용 X
    public void method1(){
        HashMap<String, Integer> snackList = new HashMap<>();

        snackList.put("구름과자", 2000);

        System.out.println(snackList);
    }

    // method2 점심메뉴 저장 (키: 메뉴이름 값: 분류)
    public void method2(){
        /*
        * key                value
        * 김치찌개           한식
        * 파스타             양식
        * 짜장면             중식
        * 스테이크           양식
        * 비빔밥             한식
        *
        * 메뉴 모두 출력
        * 점심 리스트 확인:
        *
        * 파스타를 확인했을 때 파스타는 어떤 음식인지출력
        *
        * 짜장면을 제거
        *
        * 짜장면 제거됐는지 확인
        *
        * 스테이크 -> 한식으로 변경
        *
        * 점심리스트 모두 삭제
        *
        * 모두 삭제 됐는지 확인
        */
        HashMap<String, String> lunchList = new HashMap<String, String>();
        lunchList.put("김치찌개","한식");
        lunchList.put("파스타","양식");
        lunchList.put("짜장면","중식");
        lunchList.put("스테이크","양식");
        lunchList.put("비빔밥","한식");

        //1.파스타가 어떤 음식인지 확인
        String pastaType = lunchList.get("파스타");
        System.out.println(pastaType);// 출력의 결과는 String 값으로 양식이 나옴

        //2.짜장면 제거하고 제거된 목록 확인
        lunchList.remove("짜장면");
        System.out.println("짜장면있음? :"+lunchList);

        //3. 짜장면 존재 유무 확인
        boolean jjajang = lunchList.containsKey("짜장면"); //존재유무 boolean true or false
        System.out.println(jjajang);

        //4. 스테이크를 한식으로 변경 put 으로 덮어쓰기
        lunchList.put("스테이크","한식");
        System.out.println("스테이크가 한식으로 변경되었는지 확인: "+lunchList);

        //replace 특정 값을 변경시킨다
        lunchList.replace("스테이크","한식"); //위 put에 작성된 스테이크의 값을 한식으로 변경할 수 있음

        //5. 점심리스트 모두 삭제
        lunchList.clear();
        System.out.println("점심리스트 확인: "+lunchList);

        //6. 모두 비워졌는지 확인
        boolean tf = lunchList.isEmpty();
        System.out.println(tf);//isEmpty 결과 또한 boolean이기 때문에 자료형 boolean 변수명으로 담아서 사용가능
    }
}
