package javaProblesOnlie;

import java.util.ArrayList;

public class RecursionHighLevelProblem {

    public static void printPerm(String str, String permutaion) {
        if (str.length() == 0) {
            System.out.println(permutaion);

            return;
        }


        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i + 1);

            printPerm(newString, permutaion + currChar);

        }

    }


    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {

            return 1;
        }


        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);


        return downPaths + rightPaths;
    }

    public static int placeTailes(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        //vertical placemtn
        int vertialPlacement = placeTailes(n - m, m);
        // horizontlly
        int horizontalplacement = placeTailes(n - 1, m);

        return vertialPlacement + horizontalplacement;
    }

    public static int callGust(int n) {


        if (n <= 1) {
            return 1;
        }
        int way1 = callGust(n - 1);
        int way2 = (n - 1) * callGust(n - 2);

        return way1 + way2;

    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findsStubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {

            printSubset(subset);
            return;
        }


        //add
        subset.add(n);
        findsStubset(n - 1, subset);

        // not adding

        subset.remove(subset.size() - 1);
        findsStubset(n - 1, subset);

    }

    public static void main(String[] args) {

        int n = 3;

        ArrayList<Integer> subset = new ArrayList<>();
        findsStubset(n, subset);



        /*
        int n=5;
        System.out.println(callGust(n));
*/

        /*
        String str = "abc";
        printPerm(str, " ");
    */

     /*   int n = 3, m = 3;
        int totoalPaths = countPaths(0, 0, n, m);
        System.out.println(totoalPaths);
    */



        /*  int n= 4 ,m=2;
        System.out.println(placeTailes(n,m));
    */


    }

}