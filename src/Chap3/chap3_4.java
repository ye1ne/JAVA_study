package Chap3;

import java.awt.*;

public class chap3_4 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";

        System.out.println(str1=="abc"); //new로 선언해서 false나옴, 그러니까 웬만하면 .equals 사용하도록
        System.out.println(str2=="abc");
        System.out.println(str1.equals(str2));

        //문자는 대문자인가?
        char a = 'A';
        char b = 'b';
        System.out.println("대문자 인가?");
        System.out.println('A'<=a && a<='Z');
        System.out.println('A'<=b && b<='Z');
        System.out.println("위의 값에 !()붙이면?");
        System.out.println(!('A'<=a && a<='Z'));
        System.out.println(!('A'<=b && b<='Z'));
        System.out.println("위의 값에 !를 한번 더 붙이면?");
        System.out.println(!!('A'<=a && a<='Z'));
        System.out.println(!!('A'<=b && b<='Z'));

        //비트단위 연산, 바꿔서 출력해줌... 그래서 특정 비트값 바꿀때 주로 사용됨
        System.out.println(toBinaryString(0xAB));
        System.out.println(toBinaryString(0xF));
        System.out.println(toBinaryString(0xAB | 0xF));
        System.out.println("~붙이면 0이랑 1이랑 바꿔서 출력해줌 아래와 같음");
        System.out.println(toBinaryString(0xAB));
        System.out.println(toBinaryString(~0xAB));
        System.out.println("즉, 피연산자의 1의 보수를 얻는것과 같은 효과이다");
        System.out.println(0xAB);
        System.out.println(~0xAB);
    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }
}
