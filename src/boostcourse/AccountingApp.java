package boostcourse;
class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1;
    //세율은 항상 공유하므로 static으로 내버려 두는 것이다
    // 메모리 매번 사용하지 않아서 컴퓨터 자원을 아낌
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }

}
public class AccountingApp {

    public static void main(String[] args) {
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 9000.0;
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("Total : " + a1.getTotal());

    }
}
