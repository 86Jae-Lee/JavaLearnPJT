package BeakJoon_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stt;
        String str = br.readLine();
        String[] strs = str.split(" ");
        int linelen = Integer.parseInt(strs[0]);
        int caseNum = Integer.parseInt(strs[1]);
        int[] line = new int [linelen];
        for(int i=0 ; i<linelen ; i++){
            line[i] = 0;
        }
        for (int i=0 ; i<caseNum ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(stt.nextToken());
            int second = Integer.parseInt(stt.nextToken());
            int putNum = Integer.parseInt(stt.nextToken());
            for(int j=first+1 ; j<=second ; j++){
                line[j] = putNum;
            }
        }

        for(int i=0 ; i<linelen ; i++){
            bw.write(String.valueOf(line[i])+" ");
        }
        bw.flush();
    }
}
