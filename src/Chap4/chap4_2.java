package Chap4;
            //반복문
import java.util.*;
public class chap4_2 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            System.out.println("I can do it!");
        }

        for (int j=0; j<5; j++){
            System.out.print("You can do it!");
        }
        System.out.println();
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i==j) {System.out.print("["+i+ ","+j+ "]");}
                else {System.out.print("[ , ]");}
            }
            System.out.println();
        }
        int[] arr = {10,20,30,40,50};
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i]+" ");
        for(int tmp : arr){
            System.out.print(tmp+" ");
        }
        System.out.println();
        int i = 1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        //while (true){} < - > for(;;){} 두개 같은 의미임, 무한루프
        System.out.println();
        int count = 10;
        while(count--!=0){ // <-> count !=0 하고 안에 count-- 넣는거랑 같은의미이다
            System.out.print(count+" ");
        } // 얘는 먼저 비교하고 마이너스 따라서 비교한 후 0만들고 출력된다, 그래서 0도 됨
        System.out.println();
        count = 10;
        while(--count!=0){ // <-> count !=0 하고 안에 count-- 넣는거랑 같은의미이다
            System.out.print(count+" ");
        } // 얘는 마니어스 하고 비교, 그래서 0 출력 ㄴㄴ
        //do-while문은 먼저 {}블럭 수행후 조건 평가하여 최소 1번 실행을 보장한다
        //break -> 반복문을 벗어나게 할때 사용
        //continue -> 반복문의 끝줄로 이동하여 다음 반복으로 넘어가도록 하는 의미임.
        //2.6 이름이 붙은 반복문

        Loop1 : for(i =2;i<6;i++){
            for(int j=1;j<10;j++){
                if(i==3 && j==3) {continue Loop1;} //이렇게 되면 바깥 루프로 가서 3단의 경우 3이후로 출력 ㄴㄴ
                else if(i==4 && j==3) {continue;} //이렇게 되면 안에 루프로 가서 4단의 경우 3만빼고 다출력
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
        int num = 0;
        outer:
        while(true){
            for(;;){
                if (num == 10){
                    System.out.println("num ==10 만남");
                    break;
                }
                if(num==20){
                    System.out.println("num ==20 만남");
                    break outer;
                }
                num++;
                System.out.println("for문 안에");
            }
            num++;
            System.out.println("while문 안에");
        }
        //이와 비슷한 break 에서 사용가능한 것도 있음 ex) 여기서 outer

    }
}
