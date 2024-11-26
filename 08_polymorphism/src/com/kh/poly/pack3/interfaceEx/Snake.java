package com.kh.poly.pack3.interfaceEx;

//Animal 을 상속받는 뱀은 무조건 eat 과 sleep 의 기능을 구현해야함
public class Snake extends Animal{
   private String poison;

    public Snake() {}

    public Snake(String type, String poison) {
        super(type);
        this.poison = poison;
    }

    public void setPoison(String poison) {
        this.poison = poison;
    }

    public String getPoison() {
        return poison;
    }

    @Override
    public void eat() {
        System.out.println("뱀은 똬리를 틀고 한번에 삼켜서 천천히 소화시킴");
    }

    @Override
    public void sleep() {
        System.out.println("뱀은 똬리를 틀고 잠을 잔다.");
    }
}
