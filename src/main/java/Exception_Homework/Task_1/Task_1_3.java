package Exception_Homework.Task_1;

public class Task_1_3 {

    public static int[] subArrays(int[] a, int[] b) {
        int i = 0;

        if (a.length != b.length) {
            int[] c = new int[1];
            c[0] = 0;
            return c;
        } else {
            int[] c = new int[a.length];
            while (i < a.length) {
                c[i] = a[i] / b[i];
                i++;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{12, 8, 16, 25};
        int[] b = new int[]{4, 2, 4};

        int[] result = subArrays(a, b);

        for (int item : result) {
            System.out.print(" " + item);
        }
    }
}