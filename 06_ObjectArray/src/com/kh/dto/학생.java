package com.kh.dto;

//DTO : Data Transfer Object (값 전달용 객체)
public class 학생 {
    //필드 인스턴스 변수(=static이 없음)
    private String studentNumber;
    private String studentName;
    private char gender;

    //매서드 (기본생성자, 필수 생성자, setter, getter, toString)

    //기본

    public 학생() {
    }

    //필수

    public 학생(String studentNumber, String studentName, char gender) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gender = gender;
    }

    //Setter

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //Getter

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGender() {
        return gender;
    }

    //toString

    @Override
    public String toString() {
        return "학생{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
