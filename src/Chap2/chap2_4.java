package Chap2;

public class chap2_4 {
    public static void main(String[] args) {
        char ch = 'c';
        int code = (int)ch;

        System.out.printf("%c = %d (%#X)%n",ch,code,code); //숫자는 유니코드, 그중 X는 16진수를 의미함

        char hch = '가';
        System.out.printf("%c = %d (%#X)%n",hch,(int)hch,(int)hch); //숫자는 유니코드
    }
}
