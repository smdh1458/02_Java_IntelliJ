package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;

public class ClothingStore {
    //옷 추가 서비스
    private ArrayList<Clothing> clothingList = new ArrayList<Clothing>();

    public void addClothing(String name, String category, int price) {
        Clothing c1 = new Clothing(name, category, price);
        clothingList.add(c1);
        System.out.println("[" + name + "] 추가 완료!");
    }

    //추가된 옷 리스트들 확인하는 기능
    public void allClothing() {
        System.out.println("=== 추가된 옷 목록 ====");
        //만약에 등록된 옷 목록이 존재하지 않다면

        if (clothingList.isEmpty()) {
            System.out.println("등록된 옷이 없습니다.");
        } else {
            //하나씩 clothing이라는 변수명에 옷이름 카테고리 가격을 담아서
            for (Clothing clothing : clothingList) { //clothingList에 담겨 있는 옷들을
                System.out.println(clothing.toString());
            }
        }
    }
}
