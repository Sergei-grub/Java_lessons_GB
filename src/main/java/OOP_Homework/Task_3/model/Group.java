package OOP_Homework.Task_3.model;

import Seminars.OOP_seminar_3.TeacherGit.data.Student;
import Seminars.OOP_seminar_3.TeacherGit.data.User;

public class Group implements Comparable<Group>{
    private String groupNum;
    private String groupName;
    private int countOfStudents;

    public Group(String groupNamb, String groupName, int countOfStudents) {
        this.groupNum = groupNamb;
        this.groupName = groupName;
        this.countOfStudents = countOfStudents;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    @Override
    public String toString() {
        return "\nGroup: " +
                "groupNam = " + groupNum +
                ", groupName ='" + groupName + '\'' +
                ", countOfStudents =" + countOfStudents;
    }

    @Override
    public int compareTo(Group o) {
        return this.groupNum.compareTo(o.groupNum);
    }




}
