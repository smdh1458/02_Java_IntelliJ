package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.stream.StreamSupport;

public class DrinkService {
    //1.Drink 객체 생성
    private Drink d = new Drink();
    private ArrayList<Drink> drinks = new ArrayList<Drink>();

    //2.드링크에서 음료 이름 가격 추가
    public void addDrink(String name, int price) {
        Drink d1 = new Drink(name, price);
        drinks.add(d1);
        System.out.println(name + "이(가) 성공적으로 추가되었습니다.");
    }

    //3.드링크 음료 이름 가격 모두 조회
    public void allDrinks() {
        //만약에 등록된 메뉴가 없을 경우
        if (drinks.size() > 0) {//하나도 없을 때 isEmpty 대신 사용하기도 함
            System.out.println("등록된 메뉴가 없습니다.");
        }else {
            for (int i = 0; i < drinks.size(); i++) {
                System.out.println(drinks.get(i).toString());
            }
        }
    }
    //4.드링크 음료 특정 음료 삭제 -> 이름만 검색
    public void removeDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)) {// 우리가 검색한 음료이름과 목록에 있는 이름이 일치하다면
                drinks.remove(i); //음료 삭제
                System.out.println("해당 메뉴가 삭제되었습니다.");
                break;
            }
        }
    }
    //5. 드링크 음료 특정 음료 검색
    public void searchDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)) { //우리가 검색하고자하는 음료 이름이 있다면
                System.out.println(drinks.get(i).toString()); //음료정보 출력하기
            }else {
                System.out.println("상품명과 일치하는 음료가 없습니다.");
            }

        }
    }

    //6. 드링크 특정 음료 검색 -> 가격을 통해 검색
    public void searchDrink(int price) {
        for (Drink d : drinks) {
            if (d.getPrice() == price) {
                System.out.println(d);
            }else {
                System.out.println("가격과 일치하는 음료가 없습니다.");
            }
        }
    }
}
