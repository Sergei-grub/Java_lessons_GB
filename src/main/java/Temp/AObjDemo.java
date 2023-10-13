package Temp;

import javax.swing.*;

// Класс для создания на его основе
// анонимного объекта:
class AnonClass {
    // Поле - переменная массива:
    int[] nums;

    // Конструктор класса:
    AnonClass(int n) {
// Создание массива:
        nums = new int[n];
// Заполнение массива натуральными числами:
        for (int i = 0; i < nums.length; i++)
            nums[i] = i + 1;
    }

// Метод для отображения элементов массива
// в диалоговом окне:
    void show() {
// Текст для отображения в диалоговом окне
// (начальное значение):
        StringBuilder text = new StringBuilder("Натуральные числа:\n");
// Формирование текста:
        for (int i = 0; i < nums.length; i++)
            text.append(nums[i]).append(" ");
// Отображение диалогового окна:
        JOptionPane.showMessageDialog(null, text.toString());
    }
}

public class AObjDemo {
    // Статический метод для отображения сообщения
// на основе объекта класса MyClass:
    static void show(AnonClass obj) {
// Текст (начальное значение)
// для отображения в окне:
        StringBuilder text = new StringBuilder("Элементы массива:\n");
// Определение количества элементов в строке:
        int n = (int) Math.ceil(Math.sqrt(obj.nums.length));
// Формирование текста:
        for (int i = 0; i < obj.nums.length - 1; i++) {
            text.append(obj.nums[i]).append((i + 1) % n == 0 ? " >> дальше\n" : " : ");
        }
// Финальная "точка":
        text.append(obj.nums[obj.nums.length - 1]).append(". конец");
// Отображение сообщения:
        JOptionPane.showMessageDialog(null, text.toString());
    }

    public static void main(String[] args) {
// Вызов метода из анонимного объекта:
        new AnonClass(15).show();
// Анонимный объект - аргумент метода:
        show(new AnonClass(20));
    }
}