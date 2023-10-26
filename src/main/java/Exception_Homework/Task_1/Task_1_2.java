package Exception_Homework.Task_1;

public class Task_1_2 {
    //Урок 1. Обработка ошибок в программировании Задача 2
    public static int[] subArrays(int[] a, int[] b) {
        int i = 0;

        if (a.length != b.length) {
            int[] c = new int[1];
            c[0] = 0;
            return c;
        } else {
            int[] c = new int[a.length];
            while (i < a.length) {
                c[i] = a[i] - b[i];
                i++;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3};

        int[] result = subArrays(a, b);

        for (int item : result) {
            System.out.print(" " + item);
        }
    }
}



