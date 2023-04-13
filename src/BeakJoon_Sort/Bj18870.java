package BeakJoon_Sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj18870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        int[] num = new int[caseNum];
        for (int i=0 ; i<caseNum ; i++){
            StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
            num[i] = Integer.parseInt(stt.nextToken());
        }
        Arrays.sort(num);
        for (int i=0 ; i<caseNum ; i++){
            
        }



    }
}
