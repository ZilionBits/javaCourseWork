
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();

        room.add(new Person("aaa",160));
        room.add(new Person("bbb",150));
        room.add(new Person("ccc",170));
        room.add(new Person("ddd",140));
        room.add(new Person("eee",190));
        room.add(new Person("eee",190));
        room.add(new Person("eee",190));

        System.out.println(room.isEmpty());
        System.out.println();

        for(Person person : room.getPersons()){
            System.out.println(person);
        }
        System.out.println();

        System.out.println(room.shortest());

        System.out.println();

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }

    }
}
