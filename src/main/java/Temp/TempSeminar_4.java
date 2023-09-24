package Temp;

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

    }

}
