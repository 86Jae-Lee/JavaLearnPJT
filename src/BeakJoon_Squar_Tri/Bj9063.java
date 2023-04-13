package BeakJoon_Squar_Tri;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj9063 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int dotNum = Integer.parseInt(br.readLine());
        int[] weDot = new int[dotNum];
        int[] snDot = new int[dotNum];
        StringTokenizer stt;
        for(int i=0 ; i<dotNum ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            weDot[i] = Integer.parseInt(stt.nextToken());
            snDot[i] = Integer.parseInt(stt.nextToken());
        }
        Arrays.sort(weDot);
        Arrays.sort(snDot);
        int sn = snDot[dotNum-1] - snDot[0];
        int we = weDot[dotNum-1] - weDot[0];
        bw.write(String.valueOf(sn*we));
        bw.flush();
    }
}