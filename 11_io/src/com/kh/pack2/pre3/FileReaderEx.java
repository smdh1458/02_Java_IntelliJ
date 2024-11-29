package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    //FileReaderEx 내 method1 텍스트 파일 읽고 출력
    // lunch.txt읽고 출력
    public void method1(){
        String path = System.getProperty("user.home"+"/Desktop/lunch.txt");
        String fileName = "lunch.txt";
        try {
            FileReader file = new FileReader(path+fileName);
            BufferedReader br = new BufferedReader(file);//성능 향상용 객체
            String line; //변수 선언만 하고 아무 값도 들어있지 않는 상태

            //while 내부에 readLine()을 작성하지 않으면 계속 똑같은 줄만 바라보고 있음!!
            while ((line = br.readLine()) != null){// 한줄 씩 읽고 null 이 아닐 때만 반복
                System.out.println(line); //현재 읽은 줄 출력
            }
            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage() + "의 문제가 발생했습니다.");
        }
    }
}
