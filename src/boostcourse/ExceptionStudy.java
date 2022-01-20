package boostcourse;

public class ExceptionStudy {
    public static void main(String[] args) {
        System.out.println(1);
        int[] scores = {10,20,30};
        try {
            System.out.println(1);
 //           System.out.println(scores[3]);
            System.out.println(3); //뒤에는 아예 발생불가하고 멈춘다
            System.out.println(2 / 0); //
            System.out.println(5); //
        }catch (ArithmeticException e){
            System.out.println("0으로 나누셨네요." + e.getMessage());
            e.printStackTrace(); //보안적인 메세지가 들어일수 있기에 로깅시스템을 ㅣ용ㅇ해서 관리자만 보여주게 하기도함
            //try catch 하면 대체 코드
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("어레이에서 없는 인덱스");
    }

    }
}
