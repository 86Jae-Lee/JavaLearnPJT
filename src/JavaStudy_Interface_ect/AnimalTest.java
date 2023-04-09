package JavaStudy_Interface_ect;

public class AnimalTest {
    public static void main(String[] args) {
        Whale mov = new Whale("Mobydick", 15);
        mov.swim();
        Bird kiki = new Bird("Kiki", 1);
        kiki.fly();
    }
}

interface Flyable {
    void fly();
}
interface Swimable {
    void swim();
}
class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void fly() {
        System.out.println(name+" can fly");
        if(age==1) System.out.println(name+" is "+age+" year old");
        else System.out.println(name+" is "+age+" years old");
    }
}
class Whale extends Animal implements Swimable {
    public Whale(String name, int age) {
        super(name, age);
    }
    @Override
    public void swim() {
        System.out.println(name+" can swim");
        if(age==1) System.out.println(name+" is "+age+" year old");
        else System.out.println(name+" is "+age+" years old");
    }
}