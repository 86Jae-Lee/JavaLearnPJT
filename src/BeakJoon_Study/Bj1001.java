package BeakJoon_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1001 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(num1-num2));
        bw.flush();
        bw.close();
    }

}