package com.kh.example.practice7.model.vo;

public class StudentController {
    private Student[] sArr = new Student[5];
    public static final int CUT_LINE = 60; // 통과 기준 점수는 변할 일이 없기 때문에 상수
    public void StudentController() {
        sArr[0] = new Student("김길동","자바",100);
        sArr[1] = new Student("박길동","디비",50);
        sArr[2] = new Student("이길동","화면",85);
        sArr[3] = new Student("정길동","서버",60);
        sArr[4] = new Student("홍길동","자바",20);
    }
    public  Student[] printStudent(){
       return sArr;
    }

    public int sumScore(){
            int sum = 0;
            for (Student student : sArr) {
                sum += student.getScore();
            }
            return sum;
    }
    public double[] avgScore(){
       int sum = 0;
       double avg = (double)sum/(double)sArr.length;
       return new double[]{avg,sum};
    }
}
