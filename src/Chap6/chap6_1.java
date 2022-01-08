package Chap6;

public class chap6_1 {
    public static void main(String[] args) {
        Tv[] t = new Tv[2];
        t[0] = new Tv(); //선언후 객체 생성
        t[0].channel = 7;
        t[0].channelDown();
        System.out.println("현재 채널은" + t[0].channel + "입니다.");

        t[1] = new Tv(); //선언후 객체 생성
        t[1].channel = 64;
        t[1].channelDown();
        System.out.println("현재 채널은" + t[1].channel + "입니다.");
    }
}

class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() { ++channel;};
    void channelDown() { --channel;}
}
