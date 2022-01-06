package Chap5;

import java.util.Arrays;

public class chap5_3{
    public static void main(String[] args) {
        int[][] score = new int[][]{ {11,22,33},
                                    {44,55,66}};
        System.out.println(Arrays.toString(score)); //주소값나옴
        System.out.println(Arrays.toString(score[0])+Arrays.toString(score[1]));

        for(int[] row :score){ //파이썬이랑 비슷
            for(int col :row){ //파이썬이랑 비슷 유용하게 써먹을 수 있을듯
                System.out.println(col);
            }
        }
        System.out.println("가변배열");
        int[][] changeArrays = new int[3][];
        changeArrays[0] = new int[4];
        changeArrays[1] = new int[3];
        changeArrays[2] = new int[2];

        String original = "it's real?";
        char[] convertChar = original.toCharArray();

        System.out.println(convertChar); //char 배열은 한줄로 출력해줌 대박!

    }

}
