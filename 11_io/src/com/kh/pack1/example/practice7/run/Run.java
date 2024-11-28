package com.kh.pack1.example.practice7.run;

import com.kh.pack1.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args){
        //파라미터 생성자에 모든 값을 넣고 저장
        Employee employee = new Employee(100,"홍길동","영업부","과장",25,'남',250000,0.05,"010-1234-5678","서울시 강남구");

        Employee practice8 = new Employee();
        practice8.setEmpNo(100);
        practice8.setEmpName("홍길동");
        practice8.setDept("영업부");
        practice8.setJob("과장");
        practice8.setAge(25);
        practice8.setGender('남');
        practice8.setSalary(250000);
        practice8.setBonusPoint(0.05);
        practice8.setPhone("010-1234-5678");
        practice8.setAddress("서울시 강남구");

        System.out.println(employee.toString());
        System.out.println(practice8.toString());
    }
}
