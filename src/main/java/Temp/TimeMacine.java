package Temp;

import java.io.IOException;

public class TimeMacine {
    public static void main(String[] args) throws IOException {
//        int[] tcodI = new int[18];
//        for (int item = 0; item < tcodI.length; item++) {
//            tcodI[item] = item + 1;
//            System.out.println(tcodI[item]);
//        }

//        int nn = 7;
//        char s = '\u2122';
//        char s2 = (char) System.in.read();
//        System.out.println(s + "  " + nn + s2);
        int i = 0;

        while ((char) System.in.read() != '+'){
            System.out.println(++i);
        }
    }
}