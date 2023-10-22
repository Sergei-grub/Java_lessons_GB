package Temp;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class loggerTemp {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(loggerTemp.class.getName());

        FileHandler toLogFile = new FileHandler("logfileTest111.txt");
        log.addHandler(toLogFile);

        SimpleFormatter sFormat = new SimpleFormatter();
        toLogFile.setFormatter(sFormat);

        log.info("Test log 3333");

    }
}
