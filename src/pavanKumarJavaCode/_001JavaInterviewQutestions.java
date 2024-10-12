package pavanKumarJavaCode;

import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class _001JavaInterviewQutestions {
    public static void main(String[] args) {
        _001JavaInterviewQutestions j1 = new _001JavaInterviewQutestions();
//        String [] command = {"nothing" ,"to" , "say" };
//        j1.simplePrintProgram();
//        j1.PrintInterger();
//        j1.scannerinput();

//        j1.commandlineargument(new String[]   {"nothing", "to", "say"});
//        j1.converFarenHeatToCelsius();
//        j1.swapNumbers();
//        j1.arrayprint();
//        j1.findLargeNumber();
//        j1.FindPrimeNumbers();
//        j1.nestedIF();
//        j1.findOddandEvenNumbers();
//       j1.compareTwoStrings();
//        j1.printStars(20);
//        j1.WhileLoopDemo();
//        j1.printTheNumberInReverse();
//        j1.AlphabetdFromAtoA();

//        j1.multiplicationTable();
        j1.prinumbersAgain();

//        j1.Armstrong();
//        j1.printstatments();



    }

    private void printstatments() {
//       notaion %d == boolean;
//        %c == Character;
//        %d == Integer;
//        %e == scientific notaion;
//        %f = floatint point ;
//        %s == String;
//        %tc == complete date and time ;
//        %n a newline of this platform;
//        %% == the character ;
        System.err.print("Pora ........... ");

    }

    private void Armstrong() {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int temp, c = 0, a;

       while(input >0) {
           a = input % 10;
           System.out.println("a =  " + input+ "% 10 ="+a);
           System.out.print("input ="+ input+" / 10 = ");
           input = input / 10;
           System.out.println( input);
           System.out.print("c = " +c+"+("+a+" * "+a+" *"+ a+") =" );
           c = c + (a * a * a);
           System.out.println( c);
       }
    }

    private void prinumbersAgain() {
        Scanner sc = new Scanner(System.in);
        int inputval = sc.nextInt();

        boolean primeCheVal = true;
        for (int i = 2; i <= inputval / 2; i++) {
            if (inputval % 2 == 0) {
                primeCheVal = false;

            }
        }
        if (primeCheVal) {
            System.out.println("it is  prime");
        } else {
            System.out.println("it is not prime ");
        }

    }

    private void multiplicationTable() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table requaired :");
        int tableNoInput = sc.nextInt();
        System.out.print("Up to which number the calcuation is required ");
        int tableLimit = sc.nextInt();
        for (int i = 1; i <= tableLimit; i++) {
            int tableoutput = tableNoInput * i;
            System.out.println(tableNoInput + "*" + i + "=" + tableoutput);
        }
    }

    private void AlphabetdFromAtoA() {

        char i;
        for (i = 65; i <= 'z'; i++) {
            System.out.print(i + " ");
        }


    }

    private void printTheNumberInReverse() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); //if we give the number 321
        int revers = 0;
        while (number != 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse number is " + revers);
    }

    private void WhileLoopDemo() {

        int i = 10;
        int a = 1;
        while (i >= 1) {
            System.out.print(a++ + ",");
            i--;
        }
    }

    private void printStars(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }

    }

    private void compareTwoStrings() {
        Scanner sc = new Scanner(System.in);
        String inputStr1 = sc.nextLine();
        String inputStr2 = sc.nextLine();

        if (inputStr2.equals(inputStr1)) {
            System.out.println("input text is same ");
        } else {
            System.out.println("input value are not same ");
        }


    }

    private void findOddandEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        int inputval = sc.nextInt();

        if (inputval % 2 == 0) {
            System.out.println(inputval + "it is a even number ");
        } else {
            System.out.println(inputval + "is a  odd number ");
        }
    }

    private void nestedIF() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            System.out.println("the 1st two inputs  is same ");
            if (b == c) {
                System.out.println("All the inputs are same ");
            }
        } else if (a == c) {
            System.out.println("1st and last inputs are same ");
        } else {
            System.out.println("all three are different value ");
        }


    }


    private void FindPrimeNumbers() {
        for (int z = 0; z < 20; z++) {
            Scanner sc = new Scanner(System.in);
            int inputval = sc.nextInt();
            boolean finalval = true;
            for (int i = 2; i <= inputval / 2; i++) {
                if (inputval % i == 0) {
                    finalval = false;
                }
            }
            if (finalval) {
                System.out.println("its a prime number ");
            } else {
                System.out.println("Not a Prime number ");
            }
        }
    }


    private void findLargeNumber() {
        int[] arr = {5454, 56, 5, 846, 231, 5684, 424314, 444, 4484, 24, 24, 11, 55, 8};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }

    private void arrayprint() {
        int[] arr = {2, 3, 5, 666, 46, 8, 833, 623, 245, 4567};
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private void swapNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of y :");
        int y = sc.nextInt();

        int c = x + y;

        x = c - x;
        y = c - y;
        System.out.println("x value is :" + x);
        System.out.println("y value is :" + y);
    }

    private void converFarenHeatToCelsius() {

        Scanner sc = new Scanner(System.in);
        int farval = sc.nextInt();
        float celsiucval = (farval - 32) * 5 / 9F;
        System.out.println(celsiucval);
    }

    private void commandlineargument(String[] args) {
        if (args.length > 0) {
            System.out.println("the commmand line arguments ");
            for (String val : args)
                System.out.println(val);
        } else {
            System.out.println("NO Command line arguments ");
        }
    }

    private void scannerinput() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(val);
    }

    public void PrintInterger() {
        int i = 1;
        System.out.println(i);

    }

    public void simplePrintProgram() {
        System.out.println("Hello World");
    }

}

