package API_Lessons.Lesson_2;
import java.io.File;

public class Ex002_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file1111.txt");
        File f2 = new File("/*/file1111.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}