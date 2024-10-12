package javaProblesOnlie;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class bubblesorting { 

    public static void printArry(int arr []){
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {1, 9, 8, 7, 3, 2, 5,6,8,14,9,3,

                749,749,46,494,68,46,87496,584,94,};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
printArry(arr);

    }


}