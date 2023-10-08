package Seminars.Temp_seminars;


//public class Seminar1_v2 {
//    public static void main(String[] args) {
////        int num = 18;
////        String s = "Hello ";
////        System.out.println(s + num);
//        for (int i = 0; i < 3; i++) {
//            Scanner inputData = new Scanner(System.in);
//            System.out.print("Enter your age: ");
//            int age = inputData.nextInt();
//            if (age >= 18) {
//                System.out.println("welcome");
//            } else if (age >= 15) {
//                System.out.println("sorry youre not allowed");
//            } else {
//                System.out.println("too small, go to school");
//            }
//        }
//    }
//}
// Написать программу с запросом и выводом имени.
//public class Seminar1_v2 {
//    public static void main(String[] args) {
//        Scanner inputData = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = inputData.nextLine();
//        System.out.println("Hi, " + name + "!");
//    }
//}

public class seminar_1v2 {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int count = 0;
        int result = 0;
        for (int i : binaryArray)
            if (i == 1) {
                count++;
                if (count > result) result = count;
            } else count = 0;
        System.out.printf("Массив содержит %d идущих подряд единиц.", result);


    }

}



