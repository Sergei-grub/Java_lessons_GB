package OOP_Homework.Task_7_Attestation.Model;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcLogger {
    public void logger() throws IOException {

        //Логгер программы
        Logger log = Logger.getLogger(CalcLogger.class.getName());


        try {
            FileHandler toLogFile = new FileHandler("logfileComplexCalculator.txt");
            log.addHandler(toLogFile);

            SimpleFormatter sFormat = new SimpleFormatter();
            toLogFile.setFormatter(sFormat);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void readLogFile() {
        try (FileReader reader = new FileReader("logfileComplexCalculator.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}