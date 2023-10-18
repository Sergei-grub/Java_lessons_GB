package OOP_Homework.Task_4.view;

import OOP_Homework.Task_4.data.Teacher;

import java.util.List;

public class TeacherView implements IUserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher i : list){
            System.out.println(i.toString());
        }
    }
}
