package School;

public class Teacher extends Person implements Teachable{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("교수 : "+name+", "+age+"살");
        System.out.println("강의하기");
    }
}