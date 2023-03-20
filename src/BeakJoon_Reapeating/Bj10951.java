package BeakJoon_Reapeating;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt;
        String input = "";
        while((input = br.readLine())!=null && !input.isEmpty()){
            stt = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(stt.nextToken());
            int num2 = Integer.parseInt(stt.nextToken());
            bw.write(String.valueOf(num1+num2)+"\n");
        }
        bw.flush();
    }
}