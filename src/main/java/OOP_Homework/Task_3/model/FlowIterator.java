package OOP_Homework.Task_3.model;


import Seminars.OOP_seminar_3.Student;

import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<Group> {

    private int counter;
    private List<Group> groupList;

    public FlowIterator(List<Group> groupList) {
        this.counter = 0;
        this.groupList = groupList;
    }

    @Override
    public boolean hasNext() {
        return counter < groupList.size() - 1;
    }

    @Override
    public Group next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return groupList.get(counter);
    }
}
