import Animals.Animals;

public class test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Animals animal1 = factory.getAnimal("Dog");
        animal1.say();
        Animals animal2 = factory.getAnimal("Cat");
        animal2.say();
        Animals animal3 = factory.getAnimal("Mouse");
        animal3.say();
    }
}
