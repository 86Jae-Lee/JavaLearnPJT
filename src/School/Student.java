package School;

public class Student extends Person implements Studyable{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("학생 : "+name+", "+age+"살");
        System.out.println("공부하기");
    }
}
