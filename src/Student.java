import java.util.HashMap;
import java.util.List;

public class Student extends Hobby {
    String nameOfStudent;

    public Student(String nameOfHobby, int frequency, List<String> address, String nameOfStudent) {
        super(nameOfHobby, frequency, address);
        this.nameOfStudent = nameOfStudent;

        HashMap<Student, Hobby> studentHobbyHashMap = new HashMap<Student, Hobby>();
        studentHobbyHashMap.put("John","cycling" );

    }
}