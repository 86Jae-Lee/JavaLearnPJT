package BeakJoon_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int caseNum = Integer.parseInt(st1.nextToken());
        int findNum = Integer.parseInt(st1.nextToken());
        int line[] = new int[caseNum];
        String str = br.readLine();
        String[] strings = str.split(" ");
        for(int i=0 ; i<caseNum ; i++){
            line[i] = Integer.parseInt(strings[i]);
            if(line[i] < findNum){
                bw.write(String.valueOf(line[i])+" ");
            }
        }
        bw.flush();
    }
}