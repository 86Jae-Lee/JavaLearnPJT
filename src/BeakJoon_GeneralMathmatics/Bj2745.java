package BeakJoon_GeneralMathmatics;

import java.io.*;
import java.util.*;

public class Bj2745 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        String str = stt.nextToken();
        int timeNum = Integer.parseInt(stt.nextToken());
        int answer;
        answer = Integer.parseInt(str, timeNum);
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}