package OOP_Homework.Task_3.model;


import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<Group>{
    private List<Group> groupsList;

    public Flow() {
        this.groupsList = groupsList;
    }

    @Override
    public Iterator<Group> iterator() {
        return new FlowIterator(this.groupsList);
    }


    public List<Group> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Group> groupsList) {
        this.groupsList = groupsList;
    }
}
