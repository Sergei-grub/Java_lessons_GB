package OOP_Homework.Task_7_Attestation.Controller;

import OOP_Homework.Task_7_Attestation.Model.CalcLogger;
import OOP_Homework.Task_7_Attestation.Model.CalculateFunctions;
import OOP_Homework.Task_7_Attestation.Model.Complex;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class StartCalculate {
    public void startOperation() throws IOException {

        //Логирование операций - вывод в консоль и запись в файл
        Logger log = Logger.getLogger(CalcLogger.class.getName());
        FileHandler toLogFile = new FileHandler("logfileComplexCalculator.txt");
        log.addHandler(toLogFile);
        SimpleFormatter sFormat = new SimpleFormatter();
        toLogFile.setFormatter(sFormat);

        //Калькулятор. Запрос значений
        Scanner input = new Scanner(System.in);
        int calculate = 0;
        System.out.println("Введите последовательно два комплексных числа:");
        System.out.print("\nВведите действительные и мнимые части ПЕРВОГО комплексного числа: ");
        TakeComplex num1 = new TakeComplex();
        Complex complex1 = num1.takeComplexNum();
        System.out.print("\nВведите действительные и мнимые части ВТОРОГО комплексного числа: ");
        TakeComplex num2 = new TakeComplex();
        Complex complex2 = num2.takeComplexNum();
        log.log(Level.INFO, "Ввод значений и выбор операции:");
        log.addHandler(toLogFile);


        //Калькулятор. Выбор операций
        while (calculate != 5) {
            System.out.println("\n  Выберите операцию: \n" +
                    "   Для сложения нажмите 1\n" +
                    "   Для вычитания нажмите 2\n" +
                    "   Для умножения нажмите 3\n" +
                    "   Для деления нажмите 4\n" +
                    "   Для Выхода нажмите 5");
            System.out.print("-> ");
            calculate = input.nextInt();

            switch (calculate) {
                case (1):
                    CalculateFunctions sumResult = new CalculateFunctions();
                    log.log(Level.INFO, "Выбор операции сложения, запуск объекта: ");
                    log.addHandler(toLogFile);
                    sumResult.sumFunction(complex1, complex2);
                    break;
                case (2):
                    CalculateFunctions diffResult = new CalculateFunctions();
                    log.log(Level.INFO, "Выбор операции вычитания, запуск объекта: ");
                    log.addHandler(toLogFile);
                    diffResult.diffFunction(complex1, complex2);
                    break;
                case (3):
                    CalculateFunctions mulResult = new CalculateFunctions();
                    log.log(Level.INFO, "Выбор операции умножения, запуск объекта: ");
                    log.addHandler(toLogFile);
                    mulResult.mulFunction(complex1, complex2);
                    break;
                case (4):
                    CalculateFunctions divResult = new CalculateFunctions();
                    log.log(Level.INFO, "Выбор операции деления, запуск объекта: ");
                    log.addHandler(toLogFile);
                    divResult.divFunction(complex1, complex2);
                    break;
                case (5):
                    log.log(Level.INFO, "Ввод значения для завершения расчетов: ");
                    log.addHandler(toLogFile);
                    System.out.println("5 Exit");
                    break;
                default:
                    break;
            }
        }
    }
}
