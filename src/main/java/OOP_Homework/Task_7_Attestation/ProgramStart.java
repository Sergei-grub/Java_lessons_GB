package OOP_Homework.Task_7_Attestation;

import OOP_Homework.Task_7_Attestation.Controller.SelectOperation;
import OOP_Homework.Task_7_Attestation.Model.CalcLogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class ProgramStart {
    public static void main(String[] args) throws IOException {

        //Логирование операций - вывод в консоль и запись в файл
        Logger log = Logger.getLogger(CalcLogger.class.getName());
        FileHandler toLogFile = new FileHandler("logfileComplexCalculator.txt");
        log.addHandler(toLogFile);
        SimpleFormatter sFormat = new SimpleFormatter();
        toLogFile.setFormatter(sFormat);
        log.log(Level.INFO, "Запуск программы");

        //Запуск программы
        System.out.println("\n*_*_* Калькулятора комплексных чисел *_*_*\n");
        SelectOperation start = new SelectOperation();
        start.calc();
    }
}
