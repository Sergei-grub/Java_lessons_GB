package OOP_Homework.Task_3.model;


import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Group> {

    private int counter;
    private List<Group> groupList;

    public StreamIterator(List<Group> groupList) {
        this.counter = 0;
        this.groupList = groupList;
    }
    public void zeroCounter(){
        this.counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < groupList.size();
    }

    @Override
    public Group next() {
        if (!hasNext())
            return null;
        return groupList.get(counter++);
        }
    @Override
    public void remove() {
        groupList.remove(counter);
//        Iterator.super.remove();
    }
}
