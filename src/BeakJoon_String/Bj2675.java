package BeakJoon_String;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt;
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0 ; i<testCase ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            int repeatNum = Integer.parseInt(stt.nextToken());
            String str = stt.nextToken();
            String[] strings = str.split("");
            for (String string : strings) {
                for (int k = 0; k < repeatNum; k++) {
                    bw.write(string);
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}