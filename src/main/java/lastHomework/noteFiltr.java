package lastHomework;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class noteFiltr {
    private Map<String, Integer> noteStatus = new Map<String, Integer>() {
    };

    public void checkNote(Notebook note) {
        if (note.getHdd()) {
            noteStatus.add(note);
        } else System.out.println("Собака " + note.getName() + " здорова!");
    }
}
