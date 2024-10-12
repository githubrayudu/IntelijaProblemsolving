package pavanKumarJavaCode;

import java.util.Scanner;

public class _002JavaInterviewQuestions {
    public static void main(String[] args) {
        _002JavaInterviewQuestions j2 = new _002JavaInterviewQuestions();
        // Uncomment the methods you want to test
        // j2.FloydTriangle();
        // j2.findSubString();
        // j2.ReverseString();
//            j2.palindromNumber();
//        System.out.println(1/100);
//        j2.addTwoMatrix();
//        j2.transposeMatrix();
//        j2.compareTwoStrings();
//        j2.stringEndsWith();
//        j2.indexOfExample();

        j2.Almstrong();

    }

    private void Almstrong() {

        int input = 153;
        int temp = input;
        int count = 0;
        int a = 0;
        while(input > 0) {
            int r = input % 10;
             a = r;
            System.out.println(r);
            count++;
            input = input / 10;
        }
        System.out.println(a);
        double result = Math.pow(a, count) + Math.pow(a, count) + Math.pow(a, count);
        int result1 = (int) result;
        System.out.println(result);
        if (temp == result1) {
            System.out.println("it is Alstrong number ");
        } else {
            System.out.println("it is not Alstrong number ");
        }


    }

    private void indexOfExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input Strintf ");
        String inputString = sc.nextLine();
        System.out.println("Entert the input Second String ");
        String subSting = sc.nextLine();
        int index = inputString.indexOf(subSting);
        System.out.println(index);
    }

    private void stringEndsWith() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        boolean endsWithCaracter = s1.endsWith("e");
        System.out.println("String ends with caracter 'e' " + endsWithCaracter);
        boolean endsWithText = s1.endsWith("java");
        System.out.println("String ends with String 'lang': " + endsWithText);
    }

    private void compareTwoStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first String ");
        String input = sc.next();
        System.out.println("enter the second String ");
        String input1 = sc.next();

        compare(input, input1);

    }

    public static void compare(String s1, String s2) {

        if (s1.compareTo(s2) == 0) {
            System.out.println("Stings are equal ");
        } else {
            System.out.println("Strings are not equal ");
        }
    }

    private void transposeMatrix() {
        int[][] original = {{6, 6, 874, 6},
                {66, 6, 8, 7},
                {6, 9, 9, 7},
                {6, 68, 77, 88}};
        int[][] transpose = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                transpose[i][j] = original[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; i < 4; j++) {
//                System.out.print(transpose[i][j] + " ");
//            }
//        }

    }

    private void addTwoMatrix() {
//        Scanner sc = new Scanner(System.in);


        int[][] a = {{35, 65, 654}, {6, 4, 85}, {9, 6, 4}};
        int[][] b = {{1, 3, 58}, {5, 6, 8}, {98, 98, 6}};
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }


    private void palindromNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int r, temp, sum = 0;
        if (input < 0) {
            System.out.println("Negative numbers are not palindromes.");
            return;
        }
        temp = input;
        while (input > 0) {
            r = input % 10;
            sum = sum * 10 + r;
            input = input / 10;
        }
        if (temp == sum) {
            System.out.println("Number is a palindrome.");
        } else {
            System.out.println("Number is not a palindrome.");
        }
    }

    public void ReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String s2 = reverseString(s1);
        System.out.println("Reversed string: " + s2);
    }

    public static String reverseString(String s) {
        StringBuilder reveStr = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reveStr.append(s.charAt(i));
        }
        return reveStr.toString();
    }

    public void findSubString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        System.out.println("Contains 'Java': " + name.contains("Java"));
        System.out.println("Contains 'java': " + name.contains("java"));
        System.out.println("Contains 'Interview': " + name.contains("Interview"));
        System.out.println("Contains 'questions': " + name.contains("questions"));
    }

    private void FloydTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int input = sc.nextInt();
        floydTriangle02(input);
    }

    public static void floydTriangle02(int n) {
        if (n <= 0) {
            System.out.println("Number of rows must be positive.");
            return;
        }
        int number = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
