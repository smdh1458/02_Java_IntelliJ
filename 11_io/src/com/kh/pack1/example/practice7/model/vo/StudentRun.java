package com.kh.pack1.example.practice7.model.vo;

public class StudentRun {
    public static void main(String[] args) {
       StudentController std1 = new StudentController();

       std1.printStudent("김길동","자바",100);
       std1.printStudent("박길동","디비",50);
       std1.printStudent("이길동","화면",85);
       std1.printStudent("정길동","서버",60);
       std1.printStudent("홍길동","자바",20);

       std1.sumStudent();
    }
}
