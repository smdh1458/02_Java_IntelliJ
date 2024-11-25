package com.kh.oop.OopEx;

public class People {
    //필드
    private String name;
    private int jumin;
    private int phone;
    private String hobby; //일반적으로 여가시간을 즐기기 위한 활동
    private String specialty;//자신이 잘하거나 특별히 능숙한 것

    //메서드
    //기본 생성자
    public People() {
    }

    //부분적으로 필수 생성자
    public People(String name, int jumin, int phone) {
        this.name = name;
        this.jumin = jumin;
        this.phone = phone;
    }
    //세터 -> hobby specialty

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //게터

    public String getSpecialty() {
        return specialty;
    }

    public String getHobby() {
        return hobby;
    }

    //toString

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", jumin=" + jumin +
                ", phone=" + phone +
                ", hobby='" + hobby + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
