package boostcourse;
interface Calculable {
    int sum(int v1, int v2);
}
interface Printable{
    void print();
}
class RealCal implements Calculable, Printable{
    public int sum(int v1, int v2){
        return v1+v2;
    }

    public void print() {
     System.out.println("이거는 RealCal이야!");
    }
}
public class InterfaceStudy {
    public static void main(String[] args) {
        Calculable c = new RealCal(); //이렇게 할 수 있음!!
        System.out.println(c.sum(2,1));
        //이렇게 하는이유?? 'RealCal'라는 '복잡한' 기능중 일부만 보여주고
        // 나머지는 감추는 것이다..
        // 최소한의 학습을 이용하여 할 수 있음
        // 또는 cal 기능만 쓰고 나머지는 사용하지 않을꺼야!
        // 라고 했을때 유용하다

    }
}
