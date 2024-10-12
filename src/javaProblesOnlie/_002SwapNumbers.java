package javaProblesOnlie;

public class _002SwapNumbers {
    public static void main(String[] args) {
        int a = 6546;
        int b = 8888;

        System.out.println("a is " + a + "and b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a is " + a + "and b is " + b);

    }


}
