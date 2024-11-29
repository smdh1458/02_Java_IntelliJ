package com.kh.pack2.pre2;

import java.io.FileWriter;

public class FileWriteRun {
    public static void main(String[] args) {
        //FileWritePre에서
        //createTxt(path, fileName) 기능을 가져와서
        //바탕화면에 user.txt파일 생성
        FileWritePre fw = new FileWritePre();
        String path = System.getProperty("user.home")+"/Desktop/";
        String fileName = "user.txt";

        System.out.println("======["+ fileName +"] 생성시작 =====");
        fw.createTxt(path,fileName);

        System.out.println("======["+ fileName +"] 작성 시작 =====");
        fw.writeTxt(path,fileName);
    }
}
