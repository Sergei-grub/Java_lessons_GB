package Homework;

import java.util.Scanner;

/*
Урок 1. Знакомство с языком программирования Java
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2) Вывести все простые числа от 1 до 1000
*/
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

        int s = 24;
        System.out.println(s % 2);

        System.out.println("Простые числа от 0 до 1000:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0 /*&& i / i == 10*/)
                System.out.printf("%d\n", i);


        }
//Простое число (2, 3, 5, 7, 11, 13) имеет ровно два различных натуральных делителя — единицу и самого себя.

    }
}

