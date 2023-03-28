package BeakJoon_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testNum = Integer.parseInt(br.readLine());
        StringTokenizer stt = new StringTokenizer(br.readLine());
        double maxNum = 0;
        double[] test = new double[testNum];
        for(int i=0 ; i<testNum ; i++){
            test[i] = Integer.parseInt(stt.nextToken());
            if(test[i]>maxNum) maxNum=test[i];
        }
        double sum = 0;
        for(int i=0 ; i<testNum ; i++){
            test[i] = test[i]/maxNum*100;
            sum += test[i];
        }
        bw.write(String.valueOf(sum/testNum));
        bw.flush();
    }
}