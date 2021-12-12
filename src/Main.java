import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Main extends Student {

    public Main(String nameOfHobby, int frequency, List<String> address, String nameOfStudent) {
        super(nameOfHobby, frequency, address, nameOfStudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return nameOfStudent.equals(main.nameOfStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStudent);
    }

    @Override
    public String toString() {
        return  nameOfStudent + "'s hobby is "+ nameOfHobby + '\'' +
                "It can be practiced" + frequency + "times a week in" + address;
    }

    public static void main(String[] args) {

        ArrayList<Hobby> listOfHobbies = new ArrayList<>();
        Hobby cycling = new Hobby("Cycling", 3, List.of("Botosani", "Iasi"));
        Hobby swimming = new Hobby("Swimming", 5, List.of("Cluj", "Bucuresti", "Bacau"));
        Hobby bowling = new Hobby("Bowling", 2, List.of("Iasi", "Timisoara"));
        Hobby football = new Hobby("football", 4, List.of("Cluj", "Craiova"));
        listOfHobbies.add(cycling);
        listOfHobbies.add(swimming);
        listOfHobbies.add(bowling);
        listOfHobbies.add(football);


        HashMap<Student, List<Hobby>> studentHobbyHashMap = new HashMap<Student, List<Hobby>>();
        studentHobbyHashMap.put(new Student("John"), List.of(football,bowling));
        studentHobbyHashMap.put(new Student("Valeria"), List.of(cycling,bowling));
        studentHobbyHashMap.put(new Student("Bogdan"), List.of(football,cycling,swimming));
        studentHobbyHashMap.put(new Student("Denis"), List.of(bowling,cycling));

        System.out.println(studentHobbyHashMap.toString());
    }
}
