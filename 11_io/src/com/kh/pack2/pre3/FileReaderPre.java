package com.kh.pack2.pre3;

import java.io.*;

public class FileReaderPre {
    //파일을 읽고 읽은 내용을 눈으로 확인
    //happyLunch.txt
    /*
     *readTxt(String path, String fileName)
     *
     * @param path      = 파일경로
     * @param fileName  = 파일 이름
     */

    public void readTxt(String path, String fileName){

        try {
            FileReader file = new FileReader(path+fileName);
            BufferedReader br = new BufferedReader(file);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
