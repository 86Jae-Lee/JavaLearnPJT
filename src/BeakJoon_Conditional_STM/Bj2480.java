package BeakJoon_Conditional_STM;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(stt.nextToken());
        int num2 = Integer.parseInt(stt.nextToken());
        int num3 = Integer.parseInt(stt.nextToken());

        int prizeMoney = 0;

        if(num1==num2 && num2==num3){
            prizeMoney = 10000 + num1*1000;
        } else if (num1==num2 || num2==num3){
            prizeMoney = 1000 + num2*100;
        } else {
            if(num1>num2 && num1>num3){
                prizeMoney = num1 * 100;
            } else if (num2>num1 && num2>num3) {
                prizeMoney = num2 * 100;
            } else {
                prizeMoney = num3 * 100;
            }
        }
        bw.write(String.valueOf(prizeMoney));
        bw.flush();
    }
}
