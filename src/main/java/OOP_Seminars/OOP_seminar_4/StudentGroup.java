package OOP_Seminars.OOP_seminar_4;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentsList;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.studentsList = students;
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.studentsList);
    }

    public List<Student> getStudents() {
        return studentsList;
    }

    public void setStudents(List<Student> students) {
        this.studentsList = students;
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + studentsList +
                '}';
    }



}
