package com.kh.loof;

public class For문Pre {
    public void method1(){
        String[] fruits={"사과","바나나","체리"};
        //주의할 점: 값이 들어있는 배열과
        //값을 하나씩 꺼내서 저장하는 변수명은 자료형이 일치해야함
        //fruits는 String인데, 과일을 하나씩 담는 변수명 fruit가
        //int라면 "사과" 와 같은 문자열을 이어 담을 수 없기 때문에
        //String으로 맞춰줘야함
        for (String fruit :fruits){
            System.out.println(fruit);
        }
    }

    public void method2(){
        int[] numbers = {1,2,3,4,5};
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
