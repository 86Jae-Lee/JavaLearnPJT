package JavaStudy_Interface_ect;

public class Zoo_Test {
}
interface AnimalSoundable{
    void makeSound();
}
class animal {
    String name;

    public animal(String name) {
        this.name = name;
    }

    void makeSound() {
    }
}

class Dog extends animal implements AnimalSoundable{
    int legNumber;
    public Dog(String name, int legNumber) {
        super(name);
        this.legNumber = legNumber;
    }

    @Override
    public void makeSound() {

    }
}