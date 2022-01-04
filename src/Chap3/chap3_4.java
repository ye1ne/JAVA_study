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
        //쉬프트 연산자
        int dec = 8;
        System.out.printf("%d >> %d = %4d \t%s%n",dec,0,dec >>0,toBinaryString(dec>>0));
        System.out.printf("%d >> %d = %4d \t%s%n",dec,2,dec >>2,toBinaryString(dec>>2));
        System.out.printf("%d << %d = %4d \t%s%n",dec,7,dec <<7,toBinaryString(dec<<7));
        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n",dec,0,dec >>0,toBinaryString(dec>>0));
        System.out.printf("%d >> %d = %4d \t%s%n",dec,4,dec >>4,toBinaryString(dec>>4));

        int x = 0 ;
        int result = x > 0 ? 1 : (x ==0 ? 0 : -1);

        //6.2 대입연산자
        int i;
        int j;
        i = j = 3; //오른쪽에서 왼쪽으로 결합됨
        i *= 10 + j;
        i = i*(10+j);//위와 같은거임에 헷갈리지 말자
    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }
}
