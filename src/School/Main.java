package School;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("홍길동", 20);
        Teacher te1 = new Teacher("이순신", 35);
        st1.study();
        te1.teach();
    }
}
