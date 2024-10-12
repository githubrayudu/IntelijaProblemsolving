package javaProblesOnlie;

import java.util.Scanner;

public class _004PrimeNumberCheck {

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
//            int n1 = sc.nextInt();
            System.out.println(isPrime(n));
//            System.out.println("the remider for "+n+" % "+n1+" is "+n % n1);
        }
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
            }
        return true;
    }
}
