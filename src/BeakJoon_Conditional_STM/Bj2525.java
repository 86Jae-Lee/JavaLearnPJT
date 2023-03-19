package BeakJoon_Conditional_STM;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(stt.nextToken());
        int b = Integer.parseInt(stt.nextToken());
        int c = Integer.parseInt(br.readLine());
        b = b + c;
        a = a+(b/60);
        b = b % 60;
        if (a > 23) {
                bw.write(String.valueOf(a-24)+" "+String.valueOf(b));
        } else {
            bw.write(String.valueOf(a)+" "+String.valueOf(b));
        }
        bw.flush();
    }
}