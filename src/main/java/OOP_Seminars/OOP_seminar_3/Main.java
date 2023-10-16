package OOP_Seminars.OOP_seminar_3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        test1();

    }

    public static void test1() {
        Student students1 = new Student("1", "1", "1", "11.11", 1111L);
        Student students2 = new Student("2", "2", "2", "22.22", 2222L);
        Student students3 = new Student("3", "3", "3", "33.33", 3333L);
        Student students4 = new Student("4", "4", "4", "44.44", 4444L);
        Teacher teacher5 = new Teacher("4", "4", "4", "44.44", 55555L);
        List<Student> studentList = List.of(new Student[]{students1, students2, students3, students4});
        StudentGroupIterator sgi = new StudentGroupIterator(studentList);
        sgi.next();

        System.out.println(sgi.next());
        sgi.remove();
        sgi.zeroCounter();
//        StudentGroup studentGroup = new StudentGroup(studentList);
//        for (Student i : studentGroup){
//            System.out.println(i);
//        }
        //        while (sgi.hasNext()){
//            System.out.println(sgi.next());
//        }
    }

//    public static void test3() {
//        Student students1 = new Student("1", "1", "1", "11.11", 1111L);
//        Student students2 = new Student("2", "2", "2", "22.22", 2222L);
//        Student students3 = new Student("3", "3", "3", "33.33", 3333L);
//        Student students4 = new Student("4", "4", "4", "44.44", 4444L);
//        Teacher teacher5 = new Teacher("4", "4", "4", "44.44", 55555L);
//        List<Student> studentList = new ArrayList<>(List.of(new Student[]{students4, students2, students3, students1}));
//        for (Student i : studentList) {
//            System.out.println(i);
//        }
//        System.out.println("______________________________________________________________");
//        Collections.sort(studentList, new StudentComparator());
//        for (Student i : studentList){
//            System.out.println(i);
//        }
//    }
}
