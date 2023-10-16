package OOP_Seminars.OOP_seminar_4.controller;

import OOP_Seminars.OOP_seminar_4.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
