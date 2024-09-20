public class Teacher extends Person {
    private int salary;

    public Teacher(String fullName, String fullAddress, int salary) {
        super(fullName, fullAddress);
        this.salary = salary;
    }

    public String toString() {
        return getFullName() + "\n" +
                spaceBeforeString() + getFullAddress() + "\n" +
                spaceBeforeString() + "salary " + salary + " euro/month";
    }

}
