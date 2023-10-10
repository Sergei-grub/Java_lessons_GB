package OOP_Homework.Task_3.model;

import java.util.Comparator;

public class StreamComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return o2.getCountOfStudents() - o1.getCountOfStudents();
    }
}