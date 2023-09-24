package Temp;

import java.sql.Array;
import java.util.*;

public class TempSeminar_4 {

    public static boolean isempty(int[] arr) {
        int count = 0;
        ArrayList<Integer> array = new ArrayList<>();

        for (int item : arr) {
            arr[item] = (int) (10 * Math.random());
            if (item == 0) {
                count++;
            }
        }
        System.out.println(arr[4]);

        return (count == arr.length);
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        String s = "ss";
        var count = 0;
        Random random = new Random();


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 999);
            if (i == 0) {
                count++;
            }
        }


        Set<Integer> HS = new HashSet<>(List.of(2, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Set<Integer> lktHS = new LinkedHashSet<>(List.of(2, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Set<Integer> trHS = new TreeSet<>(List.of(2, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9));

//        System.out.println(arr.getClass().getSimpleName());
//        System.out.println(s.getClass().getSimpleName());
//        System.out.println(arr.getClass());
//        System.out.println(s.getClass());
//        System.out.println(isempty(arr));
//        System.out.println();
//        System.out.println(HS);
//        System.out.println(lktHS);
//        System.out.println(trHS);
//        System.out.println();
//        System.out.println(HS.getClass());
//        System.out.println(lktHS.getClass());
//        System.out.println(trHS.getClass());
//        System.out.println();
//        System.out.println(HS.getClass().getSimpleName());
//        System.out.println(lktHS.getClass().getSimpleName());
//        System.out.println(trHS.getClass().getSimpleName());



        System.out.println("Кол-во уникальных значений: " + sortSet(arr) + "%");

    }

    public static float sortSet(int[] arr) {
        Set<Integer> arHS = new HashSet<>();
        for (int j : arr) {
            arHS.add(j);
            System.out.println(j);
        }
        return (float) (arHS.size() * 100 / arr.length);
    }
}
