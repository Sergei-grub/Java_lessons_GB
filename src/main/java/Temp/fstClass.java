package Temp;


import javax.swing.*;

// Описание класса:
class MyClass {
    int num;
    char symb;
    String text;


    // Метод класса:
    String showText() {

        // Локальная текстовая переменная:
        String str = "Значения полей объекта:\n";

        // Формирование результата (значения локальной переменной):
        str += "num=" + num + "\n";
        str += "symb=" + symb + "\n";
        str += "text=" + text + "\n";


        // Метод возвращает значение:
        return str;
    }
}

class Tester {
    int num;
    long result;
    Long factorial(){
//        int n = result;

        for (int i = 1; i <= num; i++) {
            result *= i;
            System.out.println("Step " + i + " = " + result);
        }
        return result;
    }
}

// Главный класс программы:
public class fstClass {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MyClass obj = new MyClass();
        MyClass obj2 = new MyClass();
        Tester fact = new Tester();

        // Заполнение полей объекта:
        obj.num = 112;
        obj.symb = 'A';
        obj.text = "Текстовое поле";

        fact.num = 19;
        fact.result = 1;


        // Отображение окна:
//        JOptionPane.showMessageDialog(null, obj.showText() + "\n" + obj2.showText());
//        System.out.println(obj2.showText());
//        JOptionPane.showMessageDialog(null, fact.factorial());
        System.out.println("Факториал " + fact.num + "!= " + fact.factorial());
        long stop = System.currentTimeMillis();
        System.out.print("Time: " + (stop-start));
    }
}