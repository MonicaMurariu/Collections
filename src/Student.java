import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Student extends Hobby {
    String nameOfStudent;

    public Student(String nameOfHobby, int frequency, List<String> address, String nameOfStudent) {
        super(nameOfHobby, frequency, address);
        this.nameOfStudent = nameOfStudent;
    }
//
//    Collection<Main> findStudentsWithHobby(Hobby hobby, HashMap<Student, List<Hobby>>) {
//        return Collection.toString();
//    }
//
//    private findStudentsWithHobby() {
//        String find = Collections.binarySearch(List<Hobby>,nameOfHobby,HashMap<Student, List<Hobby>>)
//        }
//    }

    public Student(String nameOfStudent) {
        super();
    }
}
