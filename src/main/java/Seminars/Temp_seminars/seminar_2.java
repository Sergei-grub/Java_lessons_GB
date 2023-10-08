package Seminars.Temp_seminars;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class seminar_2 {
//    public static void main(String[] args) {
//        String a = "World";
//        StringBuilder stSum = new StringBuilder();
//        stSum.append(a).append(", hi!").append(" How are you?");
//        System.out.println(stSum.reverse());
//    }
//}


//    public static void main(String[] args) {
//        String stSum = "c";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Укажите целое число: ");
//        int usrNum = Integer.parseInt(scanner.nextLine());
//        while (usrNum > 0) {
//            if (usrNum % 2 == 0) {
//                System.out.printf(stSum + 1);
//            } else System.out.printf(stSum + 2);
//            usrNum--;
//        }
//    }
//}

//    public static void main(String[] args) {
//        String a = "c1";
//        String b = "c2";
//        int usrNum = 8;
//        StringBuilder stSum = new StringBuilder();
//        for (int i = 0; i < usrNum; i++) {
//            stSum.append(a).append(b);
//        }
//        System.out.printf(String.valueOf(stSum));
//    }
//}


//    public static void main(String[] args) {
//        String str = "aaabbbcdd";
//        StringBuilder newStr = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (newStr.toString().indexOf(str.charAt(i)) == -1) {
//                newStr.append(str.charAt(i));
//            }
//        }
//        System.out.println(newStr);
//    }
//}


//    public static void main(String[] args) {
//        String str = "aaabbbcdd";
//        char crntChr = str.charAt(0);
//        StringBuilder newStr = new StringBuilder();
//        for (int i = 1; i < str.length(); i++) {
//            char nxtChr = str.charAt(i);
//            if (nxtChr != crntChr) {
//                newStr.append(crntChr);
//                crntChr = nxtChr;
//            }
//        }
//        newStr.append(crntChr);
//        System.out.println(newStr);
//    }
//}


//    System.out.println(str);
//    System.out.println(newStr.reverse());


//    static boolean palingdrom(String str) {
//        StringBuilder newStr = new StringBuilder(str);
//        String result = String.valueOf(newStr.reverse());
//        System.out.println(str + " => " + result);
//        return Objects.equals(result, str);
//    }
//    public static void main(String[] args) {
//        String str = "мадам";
//        Boolean result = palingdrom(str);
//        System.out.println(result);
//    }
//}

//    public static void main(String[] args) {
//        String word = "1мадам";
//        StringBuilder newStr = new StringBuilder(word);
//        if (newStr.reverse().toString().equals(word)) System.out.println(newStr + " - это палиндром!");
//        else System.out.println(newStr + " - не палиндром!");
//    }
//
//


    public static void main(String[] args) throws IOException {
        try {
            FileWriter nwFl = new FileWriter("jastFile.txt");
            nwFl.write("Hi man!");
            nwFl.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Logger mJrnl_1 = Logger.getLogger(seminar_2.class.getName());
        try {
            FileHandler ffLg = new FileHandler("mylog.txt");
            ffLg.setFormatter(new SimpleFormatter());
            mJrnl_1.addHandler(ffLg);
            mJrnl_1.setLevel(Level.ALL);

            mJrnl_1.info("info log in this Prog");
            mJrnl_1.warning("warning log");
            mJrnl_1.severe("Severe is YES");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //clearScreen();


    }

//    public static void clearScreen() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }
}