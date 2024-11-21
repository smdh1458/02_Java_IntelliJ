package com.kh.oop.methodPre;

public class ReturnPre2 {
    public String method1(String name, int age){
        String result2 = "안녕하세요! 제 이름은 "+ name + "이고, 나이는 "+age+"세입니다.";
        return result2;
    }

    public String method2(int num1, int num2){
        if(num1 > num2){
            return num2 + "보다 "+num1+"이(가) 큰 숫자입니다.";
        }
        return num1+ "보다 "+num2+"이(가) 큰 숫자입니다.";
    }

    public char method3(int result){
        if(result >= 90){
            return 'A';
        }
        else if(result >= 80){
            return 'B';
        }
        else if(result >= 70){
            return 'C';
        }
        else if(result >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public int method4(int price, int discount){
        int result = price - (price*discount/100);
        return result;
    }

   public double method5(double[] numbers){
        double sum = 0;
       for (double number : numbers) {

           sum += number;
       }
       return sum / numbers.length;
    }

    public String method6(int age1){
        if (age1 <= 18){
            return "나이: "+age1+" 결과: 미성년자입니다.";
        }
        return "나이: "+age1+" 결과: 성인입니다.";
    }

    public String method7(String str1, String str2){
        return str1 +" "+ str2;
    }

    public String method8(String[] arr1, String find){
        for(String arr : arr1){
            if(arr.equals(find)) {
                return "배열에 " + find + "이(가) 존재합니다.";
            }
        }
        return "일치하는 것이 없습니다.";
    }
    public double method9(int radius){
        return Math.PI * radius * radius;
    }
}
