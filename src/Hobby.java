import java.util.*;

public class Hobby {
    String nameOfHobby;
    int frequency;
    List<String> Address;

    public Hobby(String nameOfHobby, int frequency, List<String> address) {
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
        Address = address;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<String> getAddress() {
        return Address;
    }

    Hobby cycling = new Hobby("Cycling", 3, List.of("Botosani", "Iasi"));
    Hobby swimming = new Hobby("Swimming", 5, List.of("Cluj", "Bucuresti", "Bacau"));
    Hobby bowling = new Hobby("Bowling", 8, List.of("Iasi", "Timisoara"));

    List<Hobby> listOfHobbyes = new LinkedList<Hobby>();
}

