package Homework;
import java.util.*;
import java.io.*;
/*
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
@param args аргументы командной строки
*/

public class Task_4 {
    public static void main(String[] args) {
        // Читаем выражение из файла input.txt
        String inputString = getDataFromFile("file.txt");
        System.out.println("Получено уравнение: " + inputString);
        // Вывод результата
        System.out.println(getSolution(inputString));
    }

    public static String getSolution(String str) {
        // Формируем список. Резделитель - пробел, "+" и "=" исключаем
        ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
        list.remove("+");
        list.remove("=");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Заменяем "?" в цикле от 0 до 9, сравниваем с результатом выражения
                int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
                int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(j)));
                if (x + y == Integer.parseInt(list.get(2))) {
                    // Решение найдено, формируем строку ответа
                    return String.format("Результат: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
                }
            }
        }
        // Иначе решения нет
        return "Нет решения";
    }

    public static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "";
        }
    }
}
