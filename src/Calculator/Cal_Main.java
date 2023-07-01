package Calculator;

import java.io.*;


public class Cal_Main {



    static int num1;
    static int num2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("계산기를 시작합니다. ");
        bw.flush();
        while(true){
            num1 = Integer.parseInt(br.readLine());


        }

    }
    static int plus(int a, int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
    static int multiple(int a, int b) { return a*b; }
    static double divide(int a, int b) { return a/b; }



}
