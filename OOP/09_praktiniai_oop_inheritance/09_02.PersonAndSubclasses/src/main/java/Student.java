public class Student extends Person {
    private int credit;

    public Student(String fullName,String fullAddress) {
        super(fullName,fullAddress);
        credit = 0;
    }

    public int credits() {
        return credit;
    }
    public void study() {
        credit++;
    }
    public String toString() {
        return getFullName() + "\n" +
                spaceBeforeString() + getFullAddress() + "\n" +
                spaceBeforeString() + "Study credits " + credits();
    }
}
