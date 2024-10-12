package javaProblesOnlie;

import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.edge.AddHasCasting;

public class RecursionProblem2 {


    public static void towerOfHanoi(int n, String src,
                                    String hel,
                                    String des) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + des);
            return;
        }
        towerOfHanoi(n - 1, src, des, hel);
        System.out.println("transfer disk " + n + " from " + src + " to " + des);
        towerOfHanoi(n - 1, hel, src, des);
    }

    public static void printRev(String st, int index) {
        if (index == 0) {
            System.out.println(st.charAt(index));
            return;
        }
        System.out.print(st.charAt(index));
        printRev(st, index - 1);
    }
    public static  int first = -1;
    public static int last =-1;

    public static void occurenceOfAnElement(String str , int indx,char element ){

        if (indx == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }


        char currCar = str.charAt(indx);
        if (currCar == element ) {

            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
        }
        occurenceOfAnElement(str,indx+1,element);




    }

    public static void main(String[] args) {
//            int n = 2;
//            towerOfHanoi(n,"S","H","D");

//        String st = "labcd";
//        printRev(st, st.length() - 1);
        String s = "abaacdaefaah";
occurenceOfAnElement(s,0, 'a');

    }
}
