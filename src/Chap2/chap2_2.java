package Chap2;

public class chap2_2 {
    public static void main(String[] args) {
        final int constantNum = 10; // 선언과 동시에 초기화가 반드시 필요하다, 다시 수정 불가능한 상수(constant)
        long testNum = 100_000_000_000l; //long type이고 _로 구분 가능하다, 끝에 l을 붙여줘야 한다
        // float pi = 3.14; 는 에러뜸, 그이유는 실수는 자바에서 기본이 double type이기 때문이다.
        float floatPi = 3.14f; //따라서 끝부분에 반드시 f를 붙여주어야함
        double doublePi = 3.14; //얘는 d를 안붙여줘도 오류가 안뜸을 볼 수 있다.
        System.out.println(floatPi);

        //타입의 불일치
        int intI = 'A'; //문자 'A'의 유니코드인 65가 변수 i에 저장
        long longI = 123; //int보다 long이 더 길어서 가능
        double doubleD = 3.14f; //float보다 double의 범위가 더 넓어 가능

        byte b1 = 65; //byte 타입에 저장가능한 범위의 int 타입 리터럴
        byte b2 = 127; //얘까진 되고 b2 = 128은 안됨
        byte b3 = -128; // 얘까진 되고 b3 = -129는 안됨
        System.out.println(b1);

        char ch = 'j'; // ch = 'java'는 안됨
        String name = ""; //빈문자열은 가능
        // char ch2 = '' 근데 빈 문자는 안됨 대신 공백으로 초기화는 가능 아래처럼
        char ch2 = ' ';
        String name2 = new String("java"); //String은 클래스 이므로 객체 생성 연산자 사용해서 가능함
        String name3 = "Ja" + "Va"; //더하기도 가능하며 숫자도 가능
        String name4 = name3 + 1.8; // 이것도 가능 JaVa1.8로 출력
        // 덧셈 연산의 피연산자 중 어느 한쪽이 String이면 나머지 한쪽을 String으로 변환 후 두 String 덧셈시킴
        String test1 = 7 + 7 + ""; //앞에 두개 먼저 해서 14되고
        String test2 = "" + 7 + 7; // 앞에 두개가 string 화 되서 그냥 77이 붙는다
        System.out.println("test1:" + test1+" test2:"+test2);
        String test3 = true + "";
        System.out.println(test3); //따라서 얘도 그냥 true라는 문자가 됨!




    }
}
