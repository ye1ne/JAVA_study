package Chap2;

public class chap2_3 {
    public static void main(String[] args) {
        int age = 14;
        System.out.printf("age:%d %n줄바꿔짐?", age); //얘는 출력후 줄바꿈을 하지 않으며 %n으로 줄바꿈 할 수 있음
        int octNum = 010; //8진수로10 10진수로8
        int hexNum = 0x10; //16진수로10 10진수로16
        int binNum = 0b10; //2진수로10 10진수로2
        System.out.printf("%noctNum:%o %nhexNum:%x %nbinNum:%d%n", octNum, hexNum, binNum); //2진수로 출력하는건 아직 없는듯

        System.out.printf("hex=%x%n",hexNum);
        System.out.printf("hex=%#x%n",hexNum);  //소문자출력
        System.out.printf("hex=%#X%n",hexNum);  //대문자출력

        int finger = 10;
        System.out.printf("%nfinger = [%5d]%n",finger);
        System.out.printf("finger = [%-5d]%n",finger);
        System.out.printf("finger = [%05d]%n",finger);

        char c = 'c';
        System.out.printf("c=%c, %d%n",c,(int)c); //(int)붙여서 형변환 가능하다

        double d = 1.23456789;
        System.out.printf("14.10의 경우 -> d=[%14.10f]%n",d); //전체14자리 출력하는데, 소숫점아래는 10자리만! 이라는 의미
        //이때 소숫점 아래의 경우는 0으로 채우게 됨, 소숫점위는 채우지 않음
    }
}
