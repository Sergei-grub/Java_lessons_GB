package OOP_Seminars.OOP_seminar_4;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> studentList;


    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
        this.counter = 0;
    }
public void zeroCounter(){
        this.counter = 0;
}
    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext())
            return null;
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
        Iterator.super.remove();
    }
}
