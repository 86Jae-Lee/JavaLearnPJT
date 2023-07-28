package Java_Study_19_30;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

class Paddle {
    private int height, x, y, speed;
    private Color color;

    static final int PADDLE_WIDTH = 15;

    public Paddle(int x, int y, int height, int speed, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.height = height;
        this.speed = speed;
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, PADDLE_WIDTH, height);
    }

    public void moveTowards(int moveToY) {
        int centerY = y + height / 2;

        if(Math.abs(centerY - moveToY) > speed){
            if(centerY > moveToY) {
                y -= speed;
            }
            if (centerY < moveToY) {
                y += speed;
            }
        }
    }

    public boolean checkCollision(Ball b) {
        int rightX = x + PADDLE_WIDTH;
        int bottomY = y + height;

        if(b.getX() > x && b.getX() < rightX) {
            if (b.getY() > y && b.getY() < bottomY) {
                return true;
            }
        }
        return false;
    }
}

class Ball {
    private int x, y, cx, cy, speed, size;
    private Color color;

    public Ball(int x, int y, int cx, int cy, int speed, Color color, int size){
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }

    public void sound(){

    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public void moveBall() {
        x += cx;
        y += cy;
    }

    public void bounceOffEdges(int top, int bottom) {
        if (y > bottom) {
           reverseY();
        } else if (y < top) {
            reverseY();
        }
        if (x < 0) {
            reverseX();
        } else if (x > 610) {
            reverseX();
        }
    }

    public void reverseX() {
        cx *= -1;
    }

    public void reverseY() {
        cy *= -1;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int Y) {
        this.y = y;
    }

    public void setCX(int cx) {
        this.cx = cx;
    }
    public void setCY(int cy) {
        this.cy = cy;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class PongGame extends JPanel implements MouseMotionListener {

    private int userScore, pcScore;
    private int userMouseY;

    private Ball gameGall = new Ball(300, 200, 3, 3, 3, Color.YELLOW, 10);

    private Paddle userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);

    private Paddle pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);

    static final int WINDOW_WIDTH = 630;
    static final int WINDOW_HEIGHT = 480;

    public PongGame() {
        userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);

        userMouseY = 0;
        userScore = 0;
        pcScore = 0;
    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
