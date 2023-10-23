package OOP_Seminars.OOP_seminar_4.controller;

import OOP_Seminars.OOP_seminar_4.Student;
import OOP_Seminars.OOP_seminar_4.service.StudentService;
import OOP_Seminars.OOP_seminar_4.view.StudentView;

public class StudentController implements iUserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void ceate(String firstName, String secondName, String patronymic, String dateOfBirth) {
        studentService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(studentService.getAll());
    }
}
