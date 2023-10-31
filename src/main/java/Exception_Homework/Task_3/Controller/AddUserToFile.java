package Exception_Homework.Task_3.Controller;

import Exception_Homework.Task_3.Data.User;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddUserToFile {

    public static void prepareFile(String userData, String surname) throws IOException {

        List<String> filesUsers = new ArrayList<>();

        User correctUser = User.create(userData);
        String newUser = correctUser.getUserData();
        String newFileName = surname + "_(Task_3).txt";

        if (filesUsers.isEmpty()) {
            addFile(newFileName, newUser);
        } else {
            reWritFile(newFileName, newUser);
        }
    }

    static void reWritFile(String newFileName, String newUser, List<String> filesUsers) throws IOException {
        for (String f : filesUsers) {
            if (Objects.equals(f, newFileName)) {
                try (FileWriter fileReWriter = new FileWriter(f, true) {
                    BufferedWriter bufferWriter = new BufferedWriter(fileReWriter);
                    bufferWriter.w;
                    bufferWriter.close();
                    System.out.println("Пользователь с фамилией <"+surname +"> добавлен в файл: "+f);
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
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

    static void printFiles(List<String> filesUsers) {
        for (String f : filesUsers) {
            System.out.println(f);
        }
    }
}
