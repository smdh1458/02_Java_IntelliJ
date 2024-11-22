package com.kh.oop.constructor;

//경로주의 ↓
import com.kh.oop.constructor.Student;

public class StudentRun {
    public static void main(String[] args) {
        //1.기본 생성자를 사용해서 객체 생성 후 setter 값으로 설정
        Student student1 = new Student();
        student1.setName("홍길동");
        student1.setAge(21);
        student1.setGender("남성");
        student1.setMajor("자바공학");
        student1.setGap(3.8);
        student1.setPhoneNumber("010-2345-6789");
        student1.setEmail("hong123@gmeil.com");
        student1.setAddress("서울");

        //2. 매개변수가 모두 있는 생성자를 사용해서 객체 생성
        //객체 안에 모두 한번에 작성하여 정보를 저장
        Student student2 = new Student("홍길동",21,"남성","자바공학",3.8,"010-2345-6789","hong123@gmeil.com","서울");

        //3. toString() 메서드 호출
        //student1 과 student2 정보를 각각 출력
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        //4.Getter로 값이 무사히 전달되고 있는지 전광과 학점 테스트
        System.out.println("학생 1의 전공은: "+student1.getMajor());
        System.out.println("학생 2의 전공은: "+student2.getGap());
    }
}
