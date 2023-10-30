package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Data.User;

import java.io.FileWriter;
import java.io.IOException;

public class AddUserToFile {
    public AddUserToFile(String userData) {
    }

    static void prepareFile(String correctData) throws IOException, Exception{

        User correctUser = User.create(correctData);
        String newUser = correctUser.getUserData();


        try (FileWriter fileWriter = new FileWriter("UserNames(Task_3).txt")) {
            fileWriter.write(newUser);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}