package OOP_Homework.Task_7_Attestation.View;

import OOP_Homework.Task_7_Attestation.Model.CalcLogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class PrintOperation {
    public void pOperation(Double real, Double image) throws IOException {
        //Логирование операций - вывод в консоль и запись в файл
        Logger log = Logger.getLogger(CalcLogger.class.getName());
        FileHandler toLogFile = new FileHandler("logfileComplexCalculator.txt");
        log.addHandler(toLogFile);
        SimpleFormatter sFormat = new SimpleFormatter();
        toLogFile.setFormatter(sFormat);

        //Вывод информации в консоль
        System.out.print("\nРезультат: ");
        if (image > 0) {
            System.out.println(real + " + " + image + "i");
        } else if (image < 0) {
            System.out.println(real + "" + image + "i");
        } else {
            System.out.println(real);
        }
    }
}
