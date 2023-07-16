package Java_19_30_Time;

import java.io.*;

public class Test_0712_T2 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));





    }

    public static void colorCode(int num1) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("색상코드는 "+num1+"입니다.\n");
        bw.flush();
    }

    public static void colorCode(int num1, int num2) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("색상코드는 "+num1+"입니다.\n");
        bw.write("투명도는 "+num2+"입니다.\n");
        bw.flush();
    }
}
