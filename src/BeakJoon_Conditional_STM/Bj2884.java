package BeakJoon_Conditional_STM;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(stt.nextToken());
        int M = Integer.parseInt(stt.nextToken());
        if (M <45) {
            if (H==0) {
                bw.write("23 "+String.valueOf(M+15));
            } else {
                bw.write(String.valueOf(H-1)+" "+String.valueOf(M+15));
            }
        } else {
            bw.write(String.valueOf(H)+" "+String.valueOf(M-45));
        }
        bw.flush();
    }
}