
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrenHospital = new HealthStation();

        Person ethan = new Person("Ethan",1,110,7);
        Person peter = new Person("Peter",33,176,85);
        System.out.println("----------------------");

        System.out.println("weighings performed: " + childrenHospital.weighings());
        System.out.println("----------------------");
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(peter);

        System.out.println("weighings performed: " + childrenHospital.weighings());
        System.out.println("----------------------");
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrenHospital.weighings());
        System.out.println("----------------------");
    }
}