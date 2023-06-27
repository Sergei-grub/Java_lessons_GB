/*
Урок 1. Знакомство с языком программирования Java
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/

package Homework;
import java.util.Scanner;


public class Task_1 {
    static int fctrl(int num) {
        if (num == 1) return 1;
        return num * fctrl(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите целое число для вычисления треугольного числа: ");
        int numTr = Integer.parseInt(scanner.nextLine());
        System.out.println((numTr * (numTr + 1)) / 2);

        System.out.print("Укажите целое число для вычисления факториала: ");
        int numFc = Integer.parseInt(scanner.nextLine());
        System.out.println(fctrl(numFc));
    }
}

