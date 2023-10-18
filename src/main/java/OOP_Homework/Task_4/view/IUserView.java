package OOP_Homework.Task_4.view;

import OOP_Homework.Task_4.data.User;

import java.util.List;

public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
