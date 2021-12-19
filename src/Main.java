
import java.util.*;

public class Main extends Student {


    public Main(String nameOfHobby, int frequency, List<String> address, String nameOfStudent) {
        super(nameOfHobby, frequency, address, nameOfStudent);
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
        studentHobbyHashMap.put(new Student("John"), List.of(football, bowling));
        studentHobbyHashMap.put(new Student("Valeria"), List.of(cycling, bowling));
        studentHobbyHashMap.put(new Student("Bogdan"), List.of(football, cycling, swimming));
        studentHobbyHashMap.put(new Student("Denis"), List.of(bowling, cycling));



//        Collection<Student> findStudent (HashMap<Student,List<Hobby>>);
//                if (studentHobbyHashMap.containsValue(cycling)){
//                    System.out.println(studentHobbyHashMap.toString());
//                }
//

//
//        for (Student name: studentHobbyHashMap.keySet()){
//            String namePrint = name.nameOfStudent;
//            String hobbyPrint = name.nameOfHobby;
//            String cityPrint = name.address.toString();
//
//            if (name.nameOfStudent.contains("Valeria")){
//                System.out.println("Verificare" + name.nameOfStudent + name.nameOfHobby+ name.address);
//            }
//        }
    }

    @Override
    public String toString() {
        return super.nameOfStudent + "'s hobby is " + super.nameOfHobby + '\'' +
                "It can be practiced" + super.frequency + "times a week in" + super.address;
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


}
