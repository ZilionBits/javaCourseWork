
public class HealthStation {
    private int weightingsCounter; //nepriskyriau reiksmes 0, nes pagal nutylejima 0.


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weightingsCounter++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    public int weighings() {
        return weightingsCounter;
    }

}
