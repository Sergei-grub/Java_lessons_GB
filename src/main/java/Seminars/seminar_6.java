package Seminars;

import java.util.*;

public class seminar_6 {

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
    static void Sets() {
        Set<Integer> HS = new HashSet<>(List.of(2, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Set<Integer> lktHS = new LinkedHashSet<>(List.of(2, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Set<Integer> trHS = new TreeSet<>(List.of(2, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println();
        System.out.println(HS);
        System.out.println(lktHS);
        System.out.println(trHS);
        System.out.println();
        System.out.println(HS.getClass());
        System.out.println(lktHS.getClass());
        System.out.println(trHS.getClass());
        System.out.println();
        System.out.println(HS.getClass().getSimpleName());
        System.out.println(lktHS.getClass().getSimpleName());
        System.out.println(trHS.getClass().getSimpleName());
    }

    public static float sortSet(int[] arr) {
        Set<Integer> arHS = new HashSet<>();
        for (int j : arr) {
            arHS.add(j);
        }
        return (float) (arHS.size() * 100 / arr.length);
    }

    public seminar_6() {
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        var count = 0;
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 999);
        }
        System.out.println("Кол-во уникальных значений: " + sortSet(arr) + "%");
    }
}
