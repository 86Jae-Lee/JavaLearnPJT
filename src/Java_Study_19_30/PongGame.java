package Java_Study_19_30;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

class PongGame_Logic extends JPanel implements MouseMotionListener {

    private int userScore, pcScore;
    private int userMouseY;

    private Ball gameBall = new Ball(300, 200, 3, 3, 3, Color.YELLOW, 10);

    private Paddle userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);

    private Paddle pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);

    static final int WINDOW_WIDTH = 630;
    static final int WINDOW_HEIGHT = 480;

    public PongGame_Logic() {
        userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);

        userMouseY = 0;
        userScore = 0;
        pcScore = 0;

        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        //컴포넌트의 내용을 검은색으로 설정한다.
        g.setColor(Color.BLACK);

        //컴포넌트를 전체화면에 채운다.
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_WIDTH);

        gameBall.paint(g);

        pcPaddle.paint(g);
        userPaddle.paint(g);

        g.setColor(Color.WHITE);
        g.drawString("점수 - 유저[" + userScore + "] 컴퓨터 [" + pcScore + "]", 250, 20);
    }

    public void reset() {
        gameBall.setX(300);
        gameBall.setY(200);
        gameBall.setCX(3);
        gameBall.setCY(3);
        gameBall.setSpeed(3);
    }

    public void gameLogic() {
        gameBall.moveBall();

        gameBall.bounceOffEdges(0, WINDOW_HEIGHT);

        if (gameBall.getX() < 0) {
            pcScore ++;
        } else if (gameBall.getY() > WINDOW_WIDTH) {
            userScore ++;
        }

        if (pcPaddle.checkCollision(gameBall) || userPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
        }

        userPaddle.moveTowards(userMouseY);

        pcPaddle.moveTowards(gameBall.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        userMouseY = e.getY();
    }
}

public class PongGame {

    static  JFrame f = new JFrame("Pong");

    public static void main(String[] args) {
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(640, 495);
        PongGame_Logic game = new PongGame_Logic();

        f.add(game);

        f.setVisible(true);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.gameLogic();
                game.repaint();
            }
        });

        timer.start();
    }
}