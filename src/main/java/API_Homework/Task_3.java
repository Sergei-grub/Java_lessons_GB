/*
Урок 1. Знакомство с языком программирования Java
3) Реализовать простой калькулятор
*/

package API_Homework;
import java.util.Scanner;

public class Task_3 {
    static void SmpCalc() {
        System.out.println("Для вычислений необходимо выбрать операцию и ввести последовательно два значения:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите операцию + - / *: ");
        char operation;
        operation = scan.next().charAt(0);
        System.out.print("Введите первое число: ");
        int numb_a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int numb_b = scan.nextInt();

        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.printf("Результат: %d\n", res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.printf("Результат: %d\n", res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.printf("Результат: %d\n", res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.printf("Результат: %d\n", res);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- ПРОСТОЙ КАЛЬКУЛЯТОР ---");
        boolean endProg = true;
        while (endProg){
            System.out.println("\n1 - Запустить калькулятор; \nДля выхода введите 0 или другое число.");
            System.out.print("Выберите пункт меню: ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num != 0){
                SmpCalc();
            }
            else {
                endProg = false;
            }
        }
        System.out.println("До новых встреч! ");
    }
}