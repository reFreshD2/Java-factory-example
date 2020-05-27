import Animals.*;

public class Factory {
    public Animals getAnimal(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Mouse":
                return new Mouse();
        }
        return null;
    }
}
