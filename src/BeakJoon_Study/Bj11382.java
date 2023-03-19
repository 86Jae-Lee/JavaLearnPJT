package BeakJoon_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Bj11382 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(stt.nextToken());
        int num2 = Integer.parseInt(stt.nextToken());
        int num3 = Integer.parseInt(stt.nextToken());
        bw.write(String.valueOf(num1+num2+num3));
        bw.flush();

    }

}
