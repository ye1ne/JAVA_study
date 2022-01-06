package Chap5;

public class chap5_2 {
    public static void main(String[] args) {
        String[] name = new String[3];

        char[] hex = {'C','A','F','E'};
        String[] binary = {"0000","0001","0010","0011",
                        "0100","0101","0110","0111",
                        "1000","1001","1010","1011",
                        "1100","1101","1110","1111"};

        String result = "";
        for(int i=0; i< hex.length;i++) {
            if (hex[i] >= '0' && hex[i] <= '9'){
                result += binary[hex[i] - '0']; //'8' - '0' 하면 숫자 8 된다
            }else{
                result += binary[hex[i] - 'A' + 10]; //'C'- 'A' 는 2 그러면 10진수됨
            }
        }
        System.out.println(result);
        String str = "hi, everyone!";
        char[] tmp = str.toCharArray(); //String을 char 배열로

        for(int i=0; i<tmp.length; i++)
            System.out.println(tmp[i]);

        String backToString = new String(tmp);
        System.out.println(backToString); //char배열을 다시 String으로

        System.out.println(args);
    }
}
