package BeakJoon_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(stt.nextToken());
        int B = Integer.parseInt(stt.nextToken());
        int C = Integer.parseInt(stt.nextToken());

        bw.write(String.valueOf((A+B)%C)+"\n");
        bw.write(String.valueOf(((A%C) + (B%C))%C)+"\n");
        bw.write(String.valueOf((A*B)%C)+"\n");
        bw.write(String.valueOf(((A%C) * (B%C))%C));
        bw.flush();
    }
}
