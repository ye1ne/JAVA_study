package Chap3;

public class chap3_2 {
    public static void main(String[] args) {
        //2 단항 연산자
        //2.1 증감 연산자
        int i = 5, j = 0;
        j = i++;
        System.out.println("j=i++; 실행후, i= "+i+"j="+j); //i를 먼저 할당하고 ++이므로 j값은 안바꼈다..!!

        i=5;
        j=0;
        j= ++i;
        System.out.println("j=i++; 실행후, i= "+i+"j="+j);


    }
}
