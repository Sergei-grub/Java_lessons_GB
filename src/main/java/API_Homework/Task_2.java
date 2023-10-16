/*
Урок 1. Знакомство с языком программирования Java
2) Вывести все простые числа от 1 до 1000
*/

package API_Homework;

public class Task_2 {

    public static void main(String[] args) {
        System.out.println("Простые числа от 0 до 1000:");
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}