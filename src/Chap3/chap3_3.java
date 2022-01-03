package Chap3;

public class chap3_3 {
    public static void main(String[] args) {
        //3.3 산술 연산자
        int i = 10/4; //연산결과의 타입은 피연산자의 타입과 일치하므로 이는 2가 된다 (2.5ㄴㄴ)
        float f = 10/4.0f; //따라서 이렇게 형변환 해주어야함

        System.out.println(3/0.0); //(3/0)처럼 정수0으로 나누는 경우 오류가 뜨지만 실수형의 경우 infinity로 출력이 된다.
        byte a = 10;
        byte b = 30;
        // byte c = a + b 불가능, 왜냐면 int보다 작은 형끼리 계산은 int형으로 둘다 변환된뒤에 계산되기 때문
        byte c = (byte)(a*b); //따라서 이렇게 형변환 해주어야함
        System.out.println(c); //원래 결과는 300이여야 하지만 형변환이 이루어져서 데이터 손실발생하고 44가 저장됨

        char ch = 'a';
        for(i=0;i<26;i++){
            System.out.print(ch++);
        }
        ch = 'a';
        char upperCase = (char)(ch -32);
        System.out.println(upperCase);
        //소수점 첫째자리에서 반올림하고 결과를 정수로 돌려주는 메서드
        double pi = 3.141592;
        double short_pi = Math.round(pi*1000)/1000.0;
        System.out.println(short_pi);
        //나머지 연산자 %는 피연산자로 정수만 허용
        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);
        //오른쪽은 상관없고, 그저 부호 다 떼고 계산한다음 나눠지는 수의 부호를 붙이면된다.

    }
}
