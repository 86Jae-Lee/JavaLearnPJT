package JavaStudy_Interface_ect;

public class Angle_Test {
}

interface Shape {
    double area();
    double perimeter();
    default String getColor(){
        return "White";
    }
}

class Circle implements Shape {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String getColor() {
        return Shape.super.getColor();
    }
}