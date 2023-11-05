package Temp;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTemp {
    public static void main(String[] args) throws IOException {
        String fNmae = "FileWriterTemp2.txt";
        String newFname = "FileWriterTemp2.txt";
        if (fNmae.equals(newFname)){
            try (FileWriter writer = new FileWriter(fNmae, true)) {
                writer.append("\nXXX");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (FileWriter writer = new FileWriter(fNmae)) {
                writer.write("\nHHH");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
