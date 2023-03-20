package BeakJoon_Reapeating;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10952 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt;
        while(true){
            stt = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(stt.nextToken());
            int num2 = Integer.parseInt(stt.nextToken());
            if(num1==0 || num2==0) break;
            bw.write(String.valueOf(num1+num2)+"\n");
        }
        bw.flush();
    }
}