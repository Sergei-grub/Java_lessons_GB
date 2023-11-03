package Temp;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTemp {
    public static void main(String[] args) throws IOException {

        try (FileWriter writer = new FileWriter("FileWriterTemp.txt", true)){
            writer.append("XXX");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
