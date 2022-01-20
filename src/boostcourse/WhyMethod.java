package boostcourse;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

    public static void main(String[] args) throws IOException{


        //1억줄의 코드       함수안으로 주입한 구체적인 값은 인자, argument 라고함
        System.out.println(refactoringMethod("a"));
        FileWriter fw =  new FileWriter("out.txt");
        fw.write(refactoringMethod("testIO"));
        fw.close();
        System.out.println(a());
    }


                                        //method안으로 흘려넣어주는 매개면수, 즉, parameter
    private static String refactoringMethod(String text) {
        //우클릭해서 자동 method 생성, 이것을 리팩토링이라고함
        String returnString = "";
        returnString = "----------------------";
        returnString = returnString + "\n" + "hi\n" + text;

        return returnString;
        }

    private static String a(){
        return "a";

    }
}
