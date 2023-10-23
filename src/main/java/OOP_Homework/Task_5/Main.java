package OOP_Homework.Task_5;

import OOP_Homework.Task_5.Controler.Controler;
import OOP_Homework.Task_5.Data.Student;
import OOP_Homework.Task_5.Data.StudyGroup;
import OOP_Homework.Task_5.Data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1", "1", "1");
        controler.createStudent("2", "2", "2", "2");
//        controler.getAllStudent();
        controler.createStudent("3", "3", "3", "3");
        controler.createStudent("4", "4", "4", "4");
//        controler.getAllStudent();

        Teacher teacher1 = new Teacher("Bob", "Varius", "Dillan", "11.05.1977", 1);

        List<Student> students = List.of(new Student("Sam", "Dee", "Wonder", "21.12.1995", 1),
                new Student("David", "Shills", "Getter", "21.12.1996", 2),
                new Student("Nic", "Samuel", "Burns", "28.10.1994", 3),
                new Student("Eric", "Jee", "Nils", "08.12.1995", 4));

        StudyGroup studyGroup1 = controler.createStudyGroupTeacherAndStudents(teacher1, students);

        System.out.println("Teacher id and lastname: " + studyGroup1.getTeacher().getTeacherId() + " " + studyGroup1.getTeacher().getLastName());
        for (Student student :studyGroup1.getStudents()){
            System.out.println("    Student id and lastname: " + student.getStudentId() + " " + student.getLastName());
        }

    }
}

