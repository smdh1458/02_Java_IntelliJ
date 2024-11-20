package com.kh.pratice.condition;

import java.util.Objects;
import java.util.Scanner;

public class Practice1 {
    Scanner sc = new Scanner(System.in);

    public void method1() {

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호를 입력하세요: ");
        //메뉴 번호 입력받기
        int choice = sc.nextInt();
        String result = "";

        switch (choice) {
            case 1:
                result = "입력";
                break;

            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;

            case 4:
                result = "삭제";
                break;
            case 7:
                result = "종료";
                break;
            default:
                System.out.println("잘못된 번호 조회입니다.");
                return;
        }
        System.out.println(result + " 메뉴 입니다.");
    }

    public void method2() {

        System.out.print("홀/짝 맞추기 정수를 입력하세요: ");
        int number = sc.nextInt();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        } else {
            System.out.println("음수입니다.");
        }
    }

    public void method5() {

        String Id = "myId";
        String Pw = "myPassword12";

        System.out.print("아이디 입력: ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호 입력: ");
        String inputPw = sc.nextLine();

        if (inputPw.equals(Id) && inputId.equals(Pw)) {
            System.out.println("아이디와 비밀번호가 모두 일치합니다.");
        }
        if (inputId.equals(Id)) {
            System.out.println("아이디가 일치합니다.");
        }

        if (inputPw.equals(Pw)) {
            System.out.println("비밀번호가 일치합니다.");
        }
        /*
        ==부등호
        if (inputId == Id && inputPw == Pw) {
            System.out.println("로그인성공!");
        } else if (inputId != Id) {
            System.out.println("아이디가 틀렸습니다.");
            System.out.println("비밀번호가 틀렸습니다.");
        } else if (inputPw != Pw) {
            System.out.println("비밀번호가 틀렸습니다.");
        }else {
            System.out.println("모두 틀렸습니다.");
        }*/
    }

    public void method4() {
        //1~12 사이의 정수 입력받기
        System.out.print("1~12 사이의 정수 입력: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println(month + "월은 겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + "월은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "월은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "월은 가을입니다.");
                break;
            default:
                System.out.println(month + "월은 잘못 입력된 달입니다.");
                break;
        }

    }

    public void method6() {

        System.out.print("권한을 확인하고자 하는 회원 등급: ");
        String role = sc.next();
        if ("관리자".equals(role)) {
            System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
        } else if ("회원".equals(role)) {
            System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
        } else if ("비회원".equals(role)) {
            System.out.println("게시글 조회");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        /*
        switch (role) {
            case "관리자":
                System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
                break;
            case "회원":
                System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
                break;
            case "비회원":
                System.out.println("게시글 조회");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }*/
    }

    public void method10() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("****실행할 기능을 선택하세요.****");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt(); // 사용자가 번호를 선택하도록 입력하는 공간 작성
            //sc.nextLine(); //한 줄 공백이 있을 경우 날림처리
            //선택한 번호에 따른 기능 실행
            switch (choice) {
                case 1:
                    method1(); //public void method1() 작성된 코드 호출
                    // 외부에서 기능을 특정적으로 실행하지 않을 때는
                    // 내부에서 만 기능 불러오기를 진행할 때 기능명칭() 만 작성해주면 됨
                    // 단 main() 예외적으로 클래스파일명 변수명 = new 클래스파일명();
                    // 작성후 기능 불러오기 가능
                    break;
                case 2:
                    method2();
                    break;
                case 5:
                    method5();
                    break;
                case 4:
                    method4();
                    break;
                case 6:
                    method6();
                    break;
                case 3:
                case 7:
                case 8:
                case 9:
                    System.out.println("기능 준비중입니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
