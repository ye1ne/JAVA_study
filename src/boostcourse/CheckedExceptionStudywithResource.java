package boostcourse;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionStudywithResource {
    public static void main(String[] args) {
        //try with resource statements 라고 한다
        try(FileWriter f = new FileWriter("dataaa.txt")){
            f.write("Hello");
        }catch (IOException e){
            e.printStackTrace();
        }
        //아까의 더러운 코드를 더 간단하고 쉽게 가능하다
    }
}
