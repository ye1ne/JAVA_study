package Chap3;

public class chap3_1 {
    public static void main(String[] args) {
        //3.1연산자
        //1.5 산술변환
        int i = 10;
        float f = 20.0f;

        float result;
        result = f + (float)i;
        result = f + i; //큰타입으로 변환시 형변환연산자 생략가능
        //byte + short -> int + int -> int
        //즉, 피연산자의 타입이 int 보다 작으면 둘다 int로 변환된다
        i = 10/4; //연산결과의 타입은 피연산자의 타입과 일치하므로 이는 2가 된다 (2.5ㄴㄴ)

    }

}
