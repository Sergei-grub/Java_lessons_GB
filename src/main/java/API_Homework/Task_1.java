/*
Урок 1. Знакомство с языком программирования Java
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/

package API_Homework;
//import java.util.Scanner;
//
//
//public class Task_1 {
//    static int fctrl(int num) {
//        if (num == 1) return 1;
//        return num * fctrl(num - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Укажите целое число для вычисления треугольного числа: ");
//        int numTr = Integer.parseInt(scanner.nextLine());
//        System.out.println((numTr * (numTr + 1)) / 2);
//
//        System.out.print("Укажите целое число для вычисления факториала: ");
//        int numFc = Integer.parseInt(scanner.nextLine());
//        System.out.println(fctrl(numFc));
//    }
//}

//Новое исполнение через веб-итерфейс
public class Task_1 {
    static int countNTriangle(int n) {
        // Введите свое решение ниже
        return ((n * (n + 1)) / 2);
    }


    public static void main(String[] args) {
        int n;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        } else {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        int itresume_res = countNTriangle(n);
        System.out.println(itresume_res);
    }
}
