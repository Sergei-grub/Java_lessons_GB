package Exception_Homework.Task_2;

import Exception_Seminars.Ex_Seminar_2.task1.MyArraySizeException;

// Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
// если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
// "Пустая строка введена.".
// В противном случае программа должна возвращать сообщение
// "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.
public class Task_4 {

    class Expr {
        public static String expr(char a) throws Exception {
        // Введите свое решение ниже
            String result;
            if (a == ' ') {
                throw new Exception("Пустая строка введена.");
            } else {
                result = ("Ваш ввод - " + a);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = 'J'; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
