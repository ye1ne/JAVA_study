package boostcourse;

import java.io.FileWriter;
import java.io.IOException;

public class MyExceptionStudy {             //남에게 예외를 던져버림
    public static void main(String[] args) throws IOException {
 //       throw new RuntimeException("문제가 있어요!");
        FileWriter f = new FileWriter("file.txt");
    }
}
