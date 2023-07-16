package Java_19_30_Time;

import java.io.*;

public class Test_0712_T1 {
    private static int price = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        price = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        double b = Double.parseDouble(br.readLine());

        bw.write(String.valueOf(pay(a))+"\n");
        bw.write(String.valueOf(pay(a, b)));
        bw.flush();

    }

    public static double pay(int a) {
        return a * price;
    }

    public static double pay(int a, double b) {
        double num1 = pay(a);
        double num2 = num1 * b;
        return num1 + num2;
    }

}
