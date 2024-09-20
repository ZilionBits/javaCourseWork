import java.util.ArrayList;

public class Person {
    private String fullName;
    private String fullAddress;

    public Person(String fullName, String fullAddress) {
        this.fullName = fullName;
        this.fullAddress = fullAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String spaceBeforeString() {
        return "  ";
    }
    public static void printPerson(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public String toString() {
        return fullName + "\n" + spaceBeforeString() + fullAddress;
    }
}
