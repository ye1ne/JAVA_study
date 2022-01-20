package boostcourse;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionStudy {
    public static void main(String[] args) {
        FileWriter f = null;
        //그냥 이렇게 쓰고 이섹셥안해주면 아예 컴파일러가 컴파일 안해줌
        try {
            f = new FileWriter("dataaa.txt");
            f.write("Hello");
        }catch (IOException e){
            System.out.println("안댐");
            e.printStackTrace();
        }finally { //exception 발생여부와 관련없이 여기꺼는 무조건 발생
            if(f != null) {
                try {
                    f.close(); //try안에서 Fileclose선언하면 안됨, 밖에서 미리 선언해야함
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
