package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;


public class FolderPre1 {
    //method1 : 바탕화면에 profileImg 라는 폴더가 존재하는지 확인하고
    //          바탕화면에 존재하지 않으면 폴더 생성 , 존재하면 이미 존재하는 폴더입니다. 출력
    public void method1(){

        File folders = new File(System.getProperty("user.home")+"/Desktop/profileImg");
        if(folders.exists()){
            System.out.println("이미 존재하는 폴더입니다.");
        }else{
            folders.mkdir();
            System.out.println("폴더 생성 완료");
        }
    }

    //method2 : 바탕화면에 newFile.txt 생성
    public void method2(){
        File dir = new File(System.getProperty("user.home")+"/Desktop/newFile.txt");
        if(dir.exists()){
            System.out.println("이미 있는 폴더입니다.");
        }else {
            try {
                dir.createNewFile();
                System.out.println("생 완"+dir);
            } catch (IOException e) {
               System.out.println("파일 생성 중 예기치 못한 문제가 발생했습니다.");
            }

        }
    }
}
