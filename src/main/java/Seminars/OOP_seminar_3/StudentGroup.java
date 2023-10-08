package Seminars.OOP_seminar_3;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentsList;
    private Teacher teacher;

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.studentsList);
    }

    public StudentGroup(List<Student> students) {
        this.studentsList = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return studentsList;
    }

    public void setStudents(List<Student> students) {
        this.studentsList = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + studentsList +
                ", teacher=" + teacher +
                '}';
    }

//    @Override
//    public StudentGroupIterator iterator() {
//        return new StudentGroupIterator((List<Student>) this);
//    }

}
