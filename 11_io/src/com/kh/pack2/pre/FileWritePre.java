package com.kh.pack2.pre;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) throws IOException {
        //바탕화면에 hello.txt 만들고
        //안녕하세요 Hello Hi
        //작성 후 파일을 닫고 프로그램 종료
        String path = System.getProperty("user.home")+"/Desktop/";
        File files = new File(path+"hello.txt");

        //2.파일이 존재하는지 확인하고 파일 생성
        try {
            if (files.exists()) {
                System.out.println("파일이 존재함");
                return; //파일이 이미 존재하고 덮어쓰기가 돼서
                //글 작성이 되는 것을 방지하기 위해 return 돌려보내기 추가
            } else {
                files.createNewFile();
                System.out.println("생성됨");
            }
        }catch (Exception e){
            System.out.println("파일 만들기에 실패함");
            return; // 프로그램에서 더이상 코드를 실행하지 않겠다는 return 돌려보내기 작성
        }
        //3. 안녕하세요 hello hi
        try {
            FileWriter writer = new FileWriter(files);
            String word = "안녕하세요 \nHello\n Hi";

            writer.write(word);
            writer.close(); //글 작성 다하면 종료
        } catch (Exception e) {
            System.out.println("글자 작성에 실패했습니다.");
        }finally {
            System.out.println("작업 끝");
        }
    }
}
