package OOP_Seminars.OOP_seminar_4;

import OOP_Seminars.OOP_seminar_4.data.Student;
import OOP_Seminars.OOP_seminar_4.controller.StudentController;
import OOP_Seminars.OOP_seminar_4.data.Teacher;
import OOP_Seminars.OOP_seminar_4.view.StudentView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> nSt = new ArrayList<>();

        Student stdnt1= new Student("Sam", "Samons", "Ivanovoch", LocalDate.ofEpochDay(1970-11-26), 1L);
        nSt.add(stdnt1);
        StudentView stdview = new StudentView();
        stdview.sendOnConsole(nSt);
//        System.out.println(stdview);
        //        System.out.println(stdnt1);
        StudentController start = new StudentController();
//        start.create("Sam", "Samons", "Ivanovoch", LocalDate.ofEpochDay(1970-11-26));
//        start.createStudentGroup(new Teacher("Sam", "Samons", "Ivanovoch", LocalDate.ofEpochDay(1970-11-26)), );
        //        start.getStudentInStudentGroup("Sam", "Samons");
    }
}
