package Chap5;  //배열

import java.lang.reflect.Array;
import java.util.Arrays;

//5.1배열!
public class chap5_1 {
    public static void main(String[] args) {
        int[] score; //배열을 다루기 위한 참조변수 스코어 선언
        score = new int[5];//배열의 실제 저장공간을 생성 이때 인덱스는 0부터 배열길이-1까지, 즉, 4까지!!
        //이때 모든 배열내의 값은 0으로 초기화 되어 생성된다.

        score[3] = 100;
        for(int i=0;i<score.length;i++) //이때 배열의 길이는 0을포함한 양의 정수 여야한다.
            System.out.println(score[i]);
        //socre.length = 10 이런식으로 배열의 길이를 변경할수 없음 불가능
        //1.4 배열의 초기화
        int[] arr1 = new int[10]; //길이가 5인 배열을 생성함
        //이때는 값이 초기화 되지 않고 이상한 쓰레기값이 들어있음에 유의!!!!
        for(int i=0;i<arr1.length;i++)
            System.out.println(arr1);

        int[] arr2 = new int[] {10,20,30};
        int[] arr3 = {10,20,30}; //둘이 같음

        System.out.println("아래는 길이가 0인 배열들 표기법");
        int[] arr_0_1 = new int[0];
        int[] arr_0_2 = new int[] {};
        int[] arr_0_3 = {};

        System.out.println("한번에 배열을 문자열로 만들어 출력시켜줌");
        System.out.println(Arrays.toString(arr2));

        System.out.println("Arrays.toString 안쓰고 그냥 배열명을 입력하면 '주소값'이 출력됨!");
        System.out.println(arr2);

        char[] chArr = {'A','B','C'};
        System.out.println("예외적으로 char형 배열만 println (또는 print)매서드로 출력했을때 그대로 출력이됨");
        System.out.println(chArr);

        System.out.println("##1.5배열의 복사");
        int[] arr = new int[]{1,2,3,4,5};
        int[] tmp = new int[arr.length*2];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++)
            tmp[i] = arr[i];
        arr = tmp;
        System.out.println(Arrays.toString(arr));
        System.out.println("System.arrayCopy 이용하여 배열 복사가능");
        arr = new int[]{1,2,3,4,5};
        tmp = new int[]{10,9,8,7,6};
        int[] result = new int[arr.length+tmp.length];
        System.arraycopy(arr,0,result,0,arr.length);
        System.arraycopy(tmp,0,result,arr.length,tmp.length);
        System.out.println(Arrays.toString(result));

        System.out.println("##1.6배열의 활용");
        System.out.println("1)배열의 평균값 출력");
        int[] arr1_6 = {3,20,19,5,30,9,7,13,36,72,1,2};
        int sum =0;
        for(int i=0;i<arr1_6.length;i++){sum += arr1_6[i];}
        System.out.println("평균은 "+ sum/(float)arr1_6.length);

        System.out.println("2)배열의 최소 최대값 찾는 방법");
        int max = arr1_6[0];
        int min = arr1_6[0];
        for(int i=0;i<arr1_6.length;i++){
            if(arr1_6[i]>max) max = arr1_6[i];
            if(arr1_6[i]<min) min = arr1_6[i];
        }
        System.out.println(max+" "+min);



    }
}
