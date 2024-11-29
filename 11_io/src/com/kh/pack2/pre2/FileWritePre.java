package com.kh.pack2.pre2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWritePre {
    /*
    * createTxt(path, fileName)
    *
    *
    * @param path
    * @param fileName
    * */

    public void createTxt(String path,String fileNAme){
        File file = new File(path+fileNAme);

        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("파일 생성됨: "+fileNAme);
            }catch (Exception e){
                System.out.println("파일 생성 되지 않음: "+fileNAme);
                return;
            }
        }else{
            System.out.println("이미 존재하는 파일임: "+fileNAme);
            return;
        }
    }
    /*
    * writeTxt(path, fileName)
    *
    * @param path = 파일 경로
    * @param fileName = 파일 이름
    * */

    public void writeTxt(String path,String fileNAme){
        File file = new File(path+fileNAme);
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(file, true);
            System.out.print("내용을 입력: ");
            String info = sc.nextLine();
            fw.write(info);
            fw.close();
            System.out.println("파일 쓰기 완료");
        }catch (Exception e){
            System.out.println("이미 파일이 존재함: "+fileNAme);
        }finally{
            sc.close();
            System.out.println("File: "+fileNAme);
        }
    }
}
