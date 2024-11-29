package com.kh.pack1.filePre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {
    public static void main(String[] args) {
        // menu.txt
        //파일이 존재 유무 확인 존재 하면 이어쓰기
        //이어쓰기 /n떡볶이, 순대 ,마라탕 주문하기
        String path = System.getProperty("user.home")+"/Desktop/";
        String goal = "manu.txt";
        File files = new File(path+goal);

            if (files.exists()) {
                try {
                    FileWriter fw = new FileWriter(files,true);
                    String content = "\n떡볶이, 순대, 마라탕";
                    fw.write(content);
                    fw.close();
                    System.out.println("글자 작성을 완료함");
                } catch (IOException e) {
                    System.out.println("글자를 작성중에 실패했습니다.");
                }

        }else{
                try {
                    files.createNewFile();
                    FileWriter fw = new FileWriter(files);
                    String content = "떡볶이, 순대, 마라탕 주문하기";
                } catch (IOException e) {
                    System.out.println("파일 작성중 문제가 발생했습니다.");
                }
        }
    }
}
