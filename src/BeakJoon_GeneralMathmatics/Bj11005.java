package BeakJoon_GeneralMathmatics;

import java.io.*;
import java.util.StringTokenizer;

public class Bj11005 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(stt.nextToken());
        int timeNum = Integer.parseInt(stt.nextToken());
        String answer;
        answer = Integer.toString(num, timeNum);
        var s = answer.toUpperCase();
        bw.write(s);
        bw.flush();
    }
}
