package com.kh.oop.methodPre;

public class ReturnPre2 {
    public String method1(String name, int age) {
        String result2 = "안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세입니다.";
        return result2;
    }

    public String method2(int num1, int num2) {
        if (num1 > num2) {
            return num2 + "보다 " + num1 + "이(가) 큰 숫자입니다.";
        }
        return num1 + "보다 " + num2 + "이(가) 큰 숫자입니다.";
    }

    public char method3(int result) {
        char grade;
        if (result >= 90) {
            grade = 'A';
        } else if (result >= 80) {
            grade = 'B';
        } else if (result >= 70) {
            grade = 'C';
        } else if (result >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

   /* public int method4(double price, double discount) {
        double result = price - (price * discount / 100);
        return result;
    }*/

    public double method5(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {

            sum += number;
        }
        return sum / numbers.length;
    }

    public String method6(int age1) {
        //(         조건식         ) ? true : false;
        //  (age>19) ? "성인입니다." : "미성년자입니다."
        String result = (age1 >= 19) ? "성인입니다." : "미성년자입니다.";
        return "나이: " + age1 + "결과: " + result;

        /*public String method7 (String str12, String str22){

            return str12 + " " + str22;
            //return "첫 번째로 입력된 문자열: "+str1+"두 번째로 입력된 문자열: "+str2+"위 두 문자열을 이어붙인 결과: "+strl+str2;
            //String result = str1 + str2;
            //return "첫 번째로 입력된 문자열: "+str1+"두 번째로 입력된 문자열: "+str2+"위 두 문자열을 이어붙인 결과: "+result;

        }*/

        /*public String method8 (String[] arr1, String find){
            //값이 존재하는지 확인하는 boolean 자료형 변수명을 생성
            boolean found = false;

            for (String str : arr1) {
                if (str.equals(find)) {
                    found = true;
                    break;
                }
            }
            //존재 유무를 모두 확인
            if (found) {
                return "배열에" + find + "이(가) 존재합니다.";
            } else {
                return "배열에" + find + "이(가) 존재하지 않습니다.";
            }
        }*/



            /*for (String arr : arr1) {
                if (arr.equals(find)) {
                    return "배열에 " + find + "이(가) 존재합니다.";
                }
            }
            return "일치하는 것이 없습니다.";*/
    }

    public double method9(int radius) {

        return Math.PI * radius * radius;

    }
}
