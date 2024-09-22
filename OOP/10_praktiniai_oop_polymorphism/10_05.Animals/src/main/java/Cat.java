public class Cat extends Animal implements NoiseCapable{

    public Cat() {
        super("Cat");
    }
    public Cat(String name) {
        super(name);
    }
    public void purr() {
        System.out.println("purrs");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
