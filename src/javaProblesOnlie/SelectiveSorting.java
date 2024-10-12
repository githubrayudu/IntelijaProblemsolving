package javaProblesOnlie;

public class SelectiveSorting {
    public static void printArry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



public static void main(String[] args) {

    int arr[] = {9, 8, 4, 2, 42, 24, 4};

    for (int i = 0; i < arr.length - 1; i++) {

        int smallstno = i;

        for (int j = i + 1; j < arr.length; j++) {

            if (arr[smallstno] > arr[j]) {

                smallstno = j;

            }

        }
        int temp = arr[smallstno];
        arr[smallstno] = arr[i];
        arr[i] = temp;
    }

    printArry(arr);

}


}