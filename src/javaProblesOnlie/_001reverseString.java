package javaProblesOnlie;

public class _001reverseString {

    public static void main(String[] arg) {

        String str = "THE WHefwefMPANY ";


        System.out.println(revers(str));
    }

    public static String revers(String in) {

        if (in == null)
            throw new IllegalArgumentException("Null is not a valied String");
        char[] ca = in.toCharArray();
        StringBuilder out = new StringBuilder();
        for (int i = ca.length - 1; i >= 0; i--)
            out.append(ca[i]);

        return out.toString();
    }
}