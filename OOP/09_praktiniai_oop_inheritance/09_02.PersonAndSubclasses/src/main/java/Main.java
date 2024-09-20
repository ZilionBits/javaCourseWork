import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
//        Person ada = new Person("Ada Lovelace","24 Maddox St. London W1S 2Qn");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        System.out.println(ada);
//        System.out.println(esko + "\n~~~~~~~~~~~~~~~~~");
//
//        Student ollie = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        System.out.println("Study credits " + ollie.getCredit());
//        ollie.study();
//        System.out.println("Study credits " + ollie.getCredit() + "\n~~~~~~~~~~~~~~~~~");
//
//        System.out.println(ollie);
//        ollie.study();
//        System.out.println(ollie + "\n~~~~~~~~~~~~~~~~~");
//        Teacher ada = new Teacher("Ada Lovelace","24 Maddox St. London W1S 2Qn",1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki",5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//        Student ollie = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028");
//
//        for (int i = 0; i < 25; i++) {
//            ollie.study();
//        }
//
//        System.out.println(ollie);
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Teacher("Ada Lovelace","24 Maddox St. London W1S 2Qn",1200));
        persons.add(new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028"));


        printPersons(persons);

    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
