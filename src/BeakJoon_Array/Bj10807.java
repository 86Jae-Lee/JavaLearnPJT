package BeakJoon_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = Integer.parseInt(br.readLine());
        int[] line = new int[caseNum];
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int findNum = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0 ; i<caseNum ; i++){
            line[i] = Integer.parseInt(stt.nextToken());
            if(line[i] == findNum) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
