package JavaStudy_Interface_ect;

public class Compare {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 3);
        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        System.out.println("p1.equals(p3) : " + p1.equals(p3));

        Rectangle r1 = new Rectangle(1, 2, 3, 4);
        Rectangle r2 = new Rectangle(1, 2, 3, 4);
        Rectangle r3 = new Rectangle(2, 3, 4, 5);
        System.out.println("r1.equals(r2) : " + r1.equals(r2));
        System.out.println("r1.equals(r3) : " + r1.equals(r3));
    }
}

class Point {
    private final int xPos; private final int yPos;
    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Point other)){
            return false;
        }
        return (xPos == other.xPos) && (yPos == other.yPos);
    }
}
class Rectangle {
    private final Point upperLeft; private final Point lowerRight;
    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }
    @Override
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        if(!(obj instanceof Rectangle other)){
            return false;
        }
        return (upperLeft.equals(other.upperLeft)) && (lowerRight.equals(other.lowerRight));
    }
}