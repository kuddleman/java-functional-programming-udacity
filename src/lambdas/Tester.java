package lambdas;

public class Tester {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        BinaryOperation myOp = (c, d) -> c + d;

        System.out.println(myOp.apply(a, b));
    }
}
