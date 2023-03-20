package BeakJoon_Array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        int[] line = new int[caseNum];
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        for(int i=0 ; i<caseNum ; i++){
            line[i] = Integer.parseInt(stt.nextToken());
        }
        Arrays.sort(line);
        bw.write(String.valueOf(line[0])+" "+String.valueOf(line[caseNum-1]));
        bw.flush();
    }
}