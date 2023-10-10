package OOP_Homework.Task_3.model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group> {
    private List<Group> groupsList;

    public Stream() {
        this.groupsList = new ArrayList<>();;
    }

    public void add(Group group) {
        groupsList.add(group);
    }

    public int count() {
        return groupsList.size();
    }



    public Group get(Integer index) {
        return groupsList.get(index);
    }


    public List<Group> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Group> groupsList) {
        this.groupsList = groupsList;
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(this.groupsList);
    }

    @Override
    public String toString() {
        return "Flow{" +
                "groupsList=" + groupsList +
                '}';
    }


}
