package javaProblesOnlie;

public class _005PrintFibonocci {

    public static void main(String[] args) {
//01123581321
        int a = 0, b = 1;
        System.out.print(a + "," + b);
        for (int i = 1; i <= 10; i++) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;
        }
    }
}



