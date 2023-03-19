package BeakJoon_Conditional_STM;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1330 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(stt.nextToken());
        int num2 = Integer.parseInt(stt.nextToken());
        if(num1>num2){
            bw.write(">");
        }else if(num2>num1){
            bw.write("<");
        }else bw.write("==");
        bw.flush();
    }
}
