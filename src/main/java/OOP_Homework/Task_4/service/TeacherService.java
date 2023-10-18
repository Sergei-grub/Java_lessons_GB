package OOP_Homework.Task_4.service;

import OOP_Homework.Task_4.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private Long countMaxId;
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
        this.countMaxId = 0L;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Teacher teacher = new Teacher(firstName,
                secondName,
                patronymic,
                dateOfBirth,
                countMaxId);
        countMaxId++;
        teachers.add(teacher);
    }
    public void dellUser(int u){
        teachers.remove(u);
    }

//    public void setUser(int u, ){
//        teachers.remove(u);
//    }

}
