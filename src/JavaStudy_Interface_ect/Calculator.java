package JavaStudy_Interface_ect;

import java.io.*;

public class Calculator {

    static int num1; static int num2; static int cal;
    static boolean check = true;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("[계산기를 시작하겠습니다.]\n");
        bw.flush();
        while(check) {
            startMethod();
            controlMethod();
            calculateMethod();
            if(cal==6){
                checkForEnd();
            }
        }
        bw.write("[계산기가 종료되었습니다. 감사합니다.]");
        bw.flush();
    }
    public static void startMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("[두 수를 입력해 주십시오.]\n");
        bw.flush();
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());
        bw.write("["+num1+"], ["+num2+"]\n");
        bw.flush();
    }
    public static void controlMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("[1:더하기] [2:빼기] [3:곱하기] [4:빼기] [5:처음으로] [6:끝내기]\n");
        bw.flush();
        cal = Integer.parseInt(br.readLine());
    }
    public static void calculateMethod() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Calculate ca = new Calculate();
        if (cal==1) bw.write(String.valueOf(ca.plus(num1, num2)));
        else if (cal==2) bw.write(String.valueOf(ca.minus(num1, num2)));
        else if (cal==3) bw.write(String.valueOf(ca.multiple(num1, num2)));
        else if (cal==4) bw.write(String.valueOf(ca.divide(num1, num2)));
        bw.write("\n");
        bw.flush();
    }
    public static void checkForEnd() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("[계산기를 끝내시겠습니까?]\n[Y / N]\n");
        bw.flush();
        String str = br.readLine();
        if(str.equals("Y")||str.equals("y")) check = false;
    }
}

interface iCalculator {
    int plus(int x, int y);
    int minus(int x, int y);
    int multiple(int x, int y);
    double divide(double x, double y);
}

class Calculate implements iCalculator{
    @Override
    public int plus(int x, int y) {
        return x + y;
    }
    @Override
    public int minus(int x, int y) {
        return x - y;
    }
    @Override
    public int multiple(int x, int y) {
        return x * y;
    }
    @Override
    public double divide(double x, double y) {
        return x / y;
    }
}