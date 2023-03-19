package BeakJoon_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1008 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());
        bw.write(String.valueOf(num1 / num2));
        bw.flush();
    }
}
