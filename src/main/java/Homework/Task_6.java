package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6 {

    static class Answer {
        public static void removeEvenNumbers(Integer[] arr) {
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
            a.removeIf(n -> (n % 2 == 0));
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}

