package OOP_Seminars.OOP_seminar_4.view;

import OOP_Seminars.OOP_seminar_4.Student;

import java.util.List;

public class StudentView implements IUserView<Student>  {



    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student i : list){
            System.out.println(i.toString());
        }
    }
}
