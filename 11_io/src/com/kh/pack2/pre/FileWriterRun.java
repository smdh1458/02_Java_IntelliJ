package com.kh.pack2.pre;

public class FileWriterRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home")+"/Desktop/";
        String fileName = "food212.txt";

        FileWriterPre5 fwp5 = new FileWriterPre5();
        //파일 생성하기 기능
        //파일 생성기능(path, fileName)
        fwp5.creatFile(path,fileName);

        //파일 작성기능
        fwp5.writeFile(path,fileName);
    }
}
