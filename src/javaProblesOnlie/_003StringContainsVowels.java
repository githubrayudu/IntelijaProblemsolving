package javaProblesOnlie;

import java.util.Scanner;

public class _003StringContainsVowels {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(stringContainsVowels(input));
    }

    public static boolean stringContainsVowels(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
