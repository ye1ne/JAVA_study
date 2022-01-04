package Chap4;

import java.util.Scanner;

public class chap4_1 {
    public static void main(String[] args) {
        int x =1;
        if(x==1) System.out.println("x==1");
        if(x==2)
            System.out.println("x==2");
            System.out.println("x==2"); //속하지 않게 되서 출력이 되어버린다
        if(x==1)
        {
            System.out.println("x==1");
        }
        int num =0;
        if(num>=0)
            if(num!=0)
                System.out.println("num!=0"); // 가장가까운 if문에 else가 붙기 때문이다.
        else
            System.out.println("num은 마이너스??"); //이렇게 괄호가 없으면 바깥 if가 아니라 안에 if문에 속하게된다

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("지금은 봄입니다");
                break;
            case 6: case 7: case 8:
                System.out.println("지금은 여름입니다");
                break;
            case 9: case 10: case 11:
                System.out.println("지금은 가을 입니다");
                break;
            default:
                System.out.println("지금은 겨울입니다");
        }

        System.out.println("가위(1),바위(2),보(3)중 하나 입력하세요.");
        int user = scanner.nextInt();
        int com = (int)(Math.random() *3) + 1;
        //여기서 Math.random은 0부터 1사이에 하나의 double값 난수를 만든다.
        //따라서 각변에 3을 곱하고 int형을 만든후 1을 더하면 1-3 사이의 임의 정수가 만들어 진다
        switch (user-com){
            case 2: case -1:
                System.out.println("you're lose");
                break;
            case 1: case -2:
                System.out.println("you're win");
                break;
            case 0:
                System.out.println("비김");
                break; //마지막 문장이므로 break를 사용하지 않아도 무방함
        }
        String str = "012456789";
        System.out.println(str.charAt(7));
        int i = 0;
        int j = 0;
        switch (i){
            case 0:
                switch (j){
                    case 0:
                        System.out.println("0 , 0");
                }
                break; //꼭!!!!!!!!!!써주자 아니면 아래 case 1이 실행되어버림 빼먹지말자!!
            case 1:
                System.out.println("1");
        }
    }
}
