package OOP_Homework.Task_4.service;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();

    void create(String firstName,
                String secondName,
                String patronymic,
                String dateOfBirth);


}
