package boostcourse;
class Cal{
    public int sum (int v1, int v2){
        return  v1+v2;
    }

}
class Cal3 extends Cal{
    public int minus (int v1, int v2){
        return  v1-v2;
    }
    //오버라이드, 오버라이딩, Overriding, 재정의 부모클래스를 오버라이드
    public int sum (int v1, int v2){
        System.out.println("Cal3 부모꺼 수정함");
        return super.sum(v1,v2); // but 이거는 그냥 부모꺼를 쓴다는걸 의미한다
    }
    //오버로딩이다. 이게
    public int sum (int v1, int v2, int v3){
        return  this.sum(v1,v2)+v3;
    }
}

//상속과 생성자
class A{
    int v1, v2;
    A(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
    }
}
class A2 extends A{

    A2(int v1, int v2) {
        super(v1, v2); //부모클래스걸 따온다
        System.out.println("A2만의 작업이다");
    }
}
public class InheritanceStudy {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(1,4));
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,3,9));
        System.out.println(c3.minus(3,5));
        //여기부터 상속과 생성자

        A a = new A(2,1);
        A2 a2 = new A2(3,2);
    }
}