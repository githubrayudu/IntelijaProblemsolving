package javaProblesOnlie;

public class StringBuilderPractive {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("RayuduNaresh");

        for (int i = 0; i <sb.length()/2;i++) {

            int front = i ;
            int back = sb.length()-1-i;

             char frountChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frountChar);
            System.out.println(sb);
        }

    }


}
