public class Dog extends Animal implements NoiseCapable{

    public Dog() {
        super("Dog");

    }
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void makeNoise() {
        bark();
    }
}

