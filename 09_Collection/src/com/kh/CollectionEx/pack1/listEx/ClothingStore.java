package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

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

    //3.리스트에 있는 옷들 중에서 삭제하고자하는 옷을 선택해서 제거하기
    //book이랑 다르게 제거하고자 하는 책제목을 Run에서 입력하는 것이 아니라 기능클래스에서 작성한 버전
    //결과는 같지만 결과에 도달하는 방법이 다름을 표현
    public void removeClothing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 옷 제거 ===");
        System.out.print("제거하고자 하는 옷의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < clothingList.size(); i++) {
            if (clothingList.get(i).getName().equals(name)) { //i번째 있는 옷에서 옷이름과 삭제하고자하는 옷 이름이 일치하다면
                clothingList.remove(i);// i번째에 있는 옷을 제거
                System.out.println("["+name+"] 옷이 성공적으로 제거되었습니다.");
                found = true; //찾았기 때문에 true
                break; //삭제후 for문을 종료
            }
        }
        //위 for문 코드에서는 만약에 삭제하고자하는 옷 이름과 옷목록리스트에 작성된 옷이름이 일치하다면 삭제를 한 상태

        //아래 if문 코드에서는 옷이름을 검색했을 때 검색한 옷 이름이 없다면 옷을 찾을 수 없다라는 표기를 작성해줘야지
        //유저들이 옷이 없구나~ 하는것을 알 수 있음
        if(!found){
            System.out.println("["+name+"] 옷을 찾을 수 없습니다.");
        }
    }
}
