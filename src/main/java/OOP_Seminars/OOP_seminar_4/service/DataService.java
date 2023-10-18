package OOP_Seminars.OOP_seminar_4.service;

import OOP_Seminars.OOP_seminar_4.Student;
import OOP_Seminars.OOP_seminar_4.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}
