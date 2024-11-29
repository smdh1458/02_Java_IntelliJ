package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {
    //바탕화면에 lunch.txt
    //먹고 싶은 점심메뉴 리스트를 줄바꿈을 이용해서 작성하고
    //파일이 존재한다면 이미 존재합니다 와 동시에 프로그램 return으로 종료
    //main() 메서드 작성
    public static void main(String[] args) {
        String rt = System.getProperty("user.home")+"/Desktop/";
        File file = new File(rt+"lunch.txt");

        try {
            if (file.exists()) {
                System.out.println("파일이 존재합니다.");
                return;
            } else {
              file.createNewFile();
              System.out.println("파일이 생성되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("생성 실패");
            return;
        }

        try {
            FileWriter writer = new FileWriter(file);
            String food = "햄버거\n분식\n피자\n컵라면\n라멘\n샌드위치\n국밥\n만두\n우동\n돈가스\n자장면\n냉면\n초밥";

            writer.write(food);
            writer.close();
        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다.");
        }finally {
            System.out.println("작업 끝. 맛점");
        }
    }
}
