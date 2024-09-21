import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        if(!persons.contains(person)) {
            persons.add(person);
        }
    }
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return persons;
    }
    public Person shortest() {
        Person shortest = null;
        int minHeight = Integer.MAX_VALUE;
        for (Person person : persons) {
            if (person.getHeight()<minHeight) {
                minHeight = person.getHeight();
                shortest = person;
            }
        }
        return shortest;
    }
    public Person take() {
        if (!isEmpty()) {
            Person temp = shortest();
            persons.remove(shortest());
            return temp;
        }
        return null;
    }

}
