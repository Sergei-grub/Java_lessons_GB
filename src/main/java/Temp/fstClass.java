package Temp;


// Описание класса:
class MyClass {
    int num;
    char symb;
    String text;


    // Метод класса:
    void showText() {

        // Локальная текстовая переменная:
        String str = "Значения полей объекта:\n";

        // Формирование результата (значения локальной переменной):
        str += "num=" + num + "\n";
        str += "symb=" + symb + "\n";
        str += "text=" + text + "\n";

        // Метод показывает значения:
        System.out.println(str);

    }
}

class Tester {
    int num;
    long result;
    void factorial(){
//        int n = result;

        for (int i = 1; i <= num; i++) {
            result *= i;
            System.out.println("Step " + i + " = " + result);
        }
//        return result;
        System.out.println("Факториал " + num + "!= " + result);
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

        obj2.num = 1;
        obj2.symb = 'B';
        obj2.text = "Текстовое поле 2";

        fact.num = 7;
        fact.result = 1;


        // Отображение окна:

        obj.showText();
        obj2.showText();

        fact.factorial();



        long stop = System.currentTimeMillis();
        System.out.print("Time: " + (stop-start));
    }
}