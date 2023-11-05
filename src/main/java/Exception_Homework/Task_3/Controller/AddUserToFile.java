package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Data.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddUserToFile {

    public static void prepareFile(String userData, String surname) {

        List<String> filesUsers = new ArrayList<>();

        User correctUser = User.create(userData);
        String newUser = correctUser.getUserData();
        String newFileName = surname + "_v2_(Task_3).txt";
        filesUsers.add(newFileName);

        for (String f : filesUsers) {
            if (Objects.equals(f, newFileName)) {
                reWritFile(newUser, f);
            } else {
                addFile(newFileName, newUser);
            }
        }

    }


    static void reWritFile(String newUser, String fName) {

        try (FileWriter writer = new FileWriter(fName, true)) {
            writer.append("\n" + newUser);
            System.out.println("В файл <" + fName + "> добавлена запись: " + newUser);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void addFile(String newFileName, String newUser) {
        try (FileWriter fileWriter = new FileWriter(newFileName)) {
            fileWriter.write(newUser);
            System.out.println("Создан файл <" + newFileName + "> c данными: " + newUser);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}