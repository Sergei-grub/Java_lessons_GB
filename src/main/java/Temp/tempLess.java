package Temp;


import java.util.Scanner;

public class tempLess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder("Массив из нечетных чисел:\n");
        System.out.print("Укажите размер массива: ");
        int uNum = scan.nextInt();
        int[] arr = new int[uNum];
        if (uNum > 0) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = 2 * j + 1;
                text.append(arr[j]).append(" ");
            }
//            System.out.println(Arrays.toString(arr).replace("[","").replace("]", "").replace(",",""));
            System.out.println(text);
        } else System.out.println("Error 1");
    }
}
