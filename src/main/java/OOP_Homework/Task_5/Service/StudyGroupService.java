package OOP_Homework.Task_5.Service;

import OOP_Homework.Task_5.Data.Student;
import OOP_Homework.Task_5.Data.StudyGroup;
import OOP_Homework.Task_5.Data.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students){
        return new StudyGroup(teacher, students);

    }
}
