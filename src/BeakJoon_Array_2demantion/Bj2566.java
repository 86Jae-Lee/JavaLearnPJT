package BeakJoon_Array_2demantion;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2566 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] Array = new int[9][9];
        StringTokenizer stt;
        int maxNum = 0;
        int iNum = 0; int jNum = 0;
        for(int i=0 ; i<9 ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            for(int j=0 ; j<9 ; j++){
                Array[i][j] = Integer.parseInt(stt.nextToken());
                if(Array[i][j]>maxNum) {
                    maxNum = Array[i][j]; iNum = i; jNum = j;
                }
            }
        }
        bw.write(maxNum +"\n");
        bw.write(iNum + 1 +" "+ (jNum + 1));
        bw.flush();
    }
}
