package OOP_Homework.Task_7_Attestation.Controller;

import OOP_Homework.Task_7_Attestation.Model.CalcLogger;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SelectOperation {
    public void calc() throws IOException {

        //Логирование операций - вывод в консоль и запись в файл
        Logger log = Logger.getLogger(CalcLogger.class.getName());
        FileHandler toLogFile = new FileHandler("logfileComplexCalculator.txt");
        log.addHandler(toLogFile);
        SimpleFormatter sFormat = new SimpleFormatter();
        toLogFile.setFormatter(sFormat);

        //Запуск калькулятора, запрос журнала операций и выход
        Scanner input = new Scanner(System.in);
        int operation = 0;

        while (operation != 3) {
            System.out.println("\n  Выберите действие: \n" +
                    "   1 — Запустить калькулятор Комплексных чисел\n" +
                    "   2 — Посмотреть журнал операций\n" +
                    "   3 — Выход");
            System.out.print("-> ");
            operation = input.nextInt();
            switch (operation) {
                case (1):
                    StartCalculate toStart = new StartCalculate();
                    log.log(Level.INFO, "Запуск калькулятора Комплексных чисел");
                    log.addHandler(toLogFile);
                    toStart.startOperation();

                    break;
                case (2):
                    CalcLogger readLog = new CalcLogger();
                    readLog.readLogFile();
                    log.log(Level.INFO, "Просмотр журнала операций");
                    log.addHandler(toLogFile);
                    System.out.println("\n*_*_*\nЖурнал действий программы\n->");
                    break;
                case (3):
                    System.out.println("До новых встреч!");
                    log.log(Level.INFO, "Завершение работы программы");
                    log.addHandler(toLogFile);
                    break;
                default:
                    break;
            }
        }
    }
}