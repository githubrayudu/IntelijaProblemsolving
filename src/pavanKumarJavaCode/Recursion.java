package pavanKumarJavaCode;


public class Recursion {
    static int fact;

    public static void main(String[] args) {
//        int ans = factoeieal(5);
//        System.out.println(ans);
//fabinosis(0,1,5);
        int res=calculatePower(2,5);
        System.out.println(res);

    }
    public  static  int calculatePower (int x , int n ){

        if(n==0){
            return 1;
        }
        if (x==0){
             return 0 ;
        }
        int xPowerNm1 =  calculatePower(x,n-1);
        int xPowerN = x *xPowerNm1;
        return xPowerN;
    }

public static void fabinosis (int a, int b,int n){

        if (  n==0){
            return;
    }
    int  c = a+b;
    int d =b+c;
    System.out.println(c);
    System.out.println(d);
    fabinosis(c,d,n-1);


}

    public static int factoeieal(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_nm1 = factoeieal(n - 1);
        int fact_n = n * fact_nm1;

        return fact_n;

    }

    public static void printSum(int i, int n, int sum) {

        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        System.out.println(sum);
        printSum(i + 1, n, sum);
    }

    public static void pirntNumber(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        pirntNumber(n + 1);
    }
}







