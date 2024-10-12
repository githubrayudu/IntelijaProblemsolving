package javaProblesOnlie;

import java.util.ArrayList;
import java.util.List;

public class _006OnlyOddNumbers {
    public static void main (String [] args){
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(654);
        ls.add(856);
        ls.add(32516);
        ls.add(1217);
        ls.add(68432);
        ls.add(55476);
        System.out.println(onlyOddNumbers(ls));
    }
    public static boolean onlyOddNumbers(List<Integer> ls) {
        for (int i : ls) {
            if (i % 2 == 0) return false;
            return false;
        }
        return true;
    }
}