package OOP_Seminars.OOP_seminar_4.service;

import OOP_Seminars.OOP_seminar_4.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{
    private Long countMaxId;
    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
        this.countMaxId = 0L;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
    @Override
    public void create(String firstName,
                       String secondName,
                       String patronymic,
                       String dateOfBirth) {

        Student student = new Student(firstName,
                secondName,
                patronymic,
                dateOfBirth,
                countMaxId);
        countMaxId++;
        students.add(student);

    }
}
