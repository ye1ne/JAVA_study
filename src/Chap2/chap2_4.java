package Chap2;

public class chap2_4 {
    public static void main(String[] args) {
        //4.1 논리형 - boolean
        boolean power = true;
        boolean checked = false;

        //4.2 문자형 - char
        char ch = 'c';
        int code = (int)ch; //ch의 값을 유니코드로 변환

        System.out.printf("%c = %d (%#X)%n",ch,code,code); //숫자는 유니코드, 그중 X는 16진수를 의미함

        char hch = '가';
        System.out.printf("%c = %d (%#X)%n",hch,(int)hch,(int)hch); //숫자는 유니코드
        // hch = 0xAC00; 이런식으로 직접 할당도 가능함
        // hch = '\uAC00';이렇게 붙여서도 가능함

        //특수문자 다루기
        char tab = '\t';
        char backspace = '\b';
        char form_feed = '\f';
        char new_line = '\n';
        char carriage_return = '\r';
        char back_s = '\\';
        char small = '\'';
        char big = '\"';
        System.out.print("tab"+tab+"\nbackspace"+backspace+"\nform_f"+form_feed+"\nnew_line"
                +new_line+"\ncarriage_return"+carriage_return+"\nback_s"+back_s+"\nsmall"+small+"\nbig"+big);

        //4.3 정수형
        // byte(1) short(2) int(4) long(8)
        //4.4 실수형
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("f    : %f%n",f);
        System.out.printf("f    : %24.20f%n",f);
        System.out.printf("f2   : %24.20f%n",f2);
        System.out.printf("d    : %24.20f%n",d);

        f = 9.1234567f;
        int i = Float.floatToIntBits(f);
        System.out.printf("%f%n",f);
        System.out.printf("%X%n",i); //잘려나간 첫번째 값이 1 이라 반올림되어 2진수 마지막 두자리 값이 01에서 10으로 증가함. 그래서 계산값과 다르다

    }
}
