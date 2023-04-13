package BeakJoon_Squar_Tri;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj14215 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int[] lines = new int[3];
        for(int i=0 ; i<3 ; i++) lines[i] = Integer.parseInt(stt.nextToken());
        Arrays.sort(lines);
        int maxNum = lines[0];
        int numA = lines[1]; int numB = lines[2];
        if(maxNum>numA+numB){
            while(maxNum==numA+numB) maxNum--;
        }
        int sum = maxNum+numB+numA;
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}