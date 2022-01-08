package Chap6;
class Data { int x;}
public class chap6_3 {
    static void method(int n){
        if(n==0) return;
        System.out.println(n);
        method(--n);
    }
    public static void main(String[] args) {
       Card card = new Card();
       System.out.println(Card.width);
        System.out.println(card.test);
        System.out.println(card.color);
        System.out.println(card.d);
        System.out.println(card.c);

        MyMath mymath = new MyMath();
        System.out.println(mymath.division(10,4)); //double형에 10이랑 4인 int가 들어왔지만 자동 형변환 된다.
        System.out.println("첫번째 main시작");
        first();
        System.out.println("첫번째 main종료");
        method(6);
    }


    static
    void first(){
        System.out.println("두번째 first 시작");
        second();
        System.out.println("두번째 first 종료");
    }

    static void second(){
        System.out.println("세번째 second 시작");
        System.out.println("세번쨰 second 종료");
    }

}



class MyMath{
    double division(double a, double b){return a/b;}
}
class Card{
    static int width = 100;
    static int height = 200;
    int test = 200;
    int color; //기본 0 초기화
    double d; //기본 0.0으로 초기화
    String c; //기본 null값

}
