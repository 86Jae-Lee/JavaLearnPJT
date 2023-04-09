package BeakJoon_Squar_Tri;

import java.io.*;
import java.util.*;
public class Bj1085 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int answer;
        answer = x;
        if (w-x<answer) {answer = w-x;}
        if (y<answer) {answer = y;}
        if (h-y<answer) {answer = h-y;}

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}