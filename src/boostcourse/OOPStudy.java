package boostcourse;

class Print{
    String delimiter = "----";
    Print(String _delimeiter){
        this.delimiter = _delimeiter;
    }
    void A() {
        System.out.println(this.delimiter);
        System.out.println("AAAA");
        System.out.println(this.delimiter);
    }

    void B() {
        System.out.println(this.delimiter);
        System.out.println("BBBB");
        System.out.println(this.delimiter);
    }
}

class Foo{
    static String classVar = "I class var";
    String instanceVar = "I instance Var";
}
public class OOPStudy {
    public static void main(String[] args) {
        Print p1 = new Print("!11111");
        p1.delimiter = "****";
        p1.A();
        Print p2 = new Print("*******");
        System.out.println(p2.delimiter);

    }

}
