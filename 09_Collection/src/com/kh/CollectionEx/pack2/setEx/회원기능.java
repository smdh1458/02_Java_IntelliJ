package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {
    private HashSet<회원> userList = new HashSet<>();

    public void addUser(회원 user1) {
        if(userList.add(user1)){
            System.out.println("유저가 추가됨"+user1);
        }else{
            System.out.println("이미 존재하는 유저"+user1);
        }
    }

    public void allUser() {
        if (userList.isEmpty()) {
            System.out.println("등록된 유저가 없다.");
        } else {
            for (회원 user : userList) {
                System.out.println(user);
            }
        }
    }

    public void serachUser(int id){
        for (회원 user : userList) {
            if(user.getId() == id){
                System.out.println(user);
            }else{
                System.out.println("회원X");
            }
        }
    }
    
    public void deleteUser(int id){
        for(회원 user : userList){
            if(user.getId() == id){
                userList.remove(user);
                break;
            }
        }
        System.out.println("해당 메뉴가 삭제되었습니다.");
    }
}
