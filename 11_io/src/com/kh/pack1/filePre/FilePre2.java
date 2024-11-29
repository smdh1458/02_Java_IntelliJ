package com.kh.pack1.filePre;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilePre2 {
    public void method1(){
        String folderPath = System.getProperty("user.home")+"/front-workspace/01_HTML";
        System.out.println("폴더 위치 보기: "+ folderPath);

        //File 객체 생성
        File file = new File(folderPath);

        //폴더 안에 있는 파일이나 폴더 목록 가져오기
        File[] files = file.listFiles();

        //파일 날짜 지정할 포멧 설정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //파일 정보 출력
        for(File f : files){
            System.out.println("f.toString [파일경로 + 파일이름]: "+f.toString());
            //System.out.println("수정 날짜: "+f.lastModified());
            System.out.println("파일 이름: "+f.getName());
            String lastDate = sdf.format(f.lastModified());
            System.out.println("마지막 수정날짜: "+lastDate);
        }
    }
}
