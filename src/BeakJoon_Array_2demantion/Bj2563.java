package BeakJoon_Array_2demantion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());

        StringTokenizer stt;

        int[][] caseA = new int [100][100];

        for (int i=0 ; i<caseNum ; i++) {
            stt = new StringTokenizer(br.readLine(), " ");
            int width = Integer.parseInt(stt.nextToken())-1;
            int hight = Integer.parseInt(stt.nextToken())-1;
            for (int j=width ; j<width+10 ; j++) {
                for (int k=hight ; k<hight+10 ; k++) {
                    caseA[j][k] = 1;
                }
            }
        }

        int count = 0;
        for (int i=0 ; i<100 ; i++) {
            for (int j=0 ; j<100 ; j++) {
                if (caseA[i][j]==1) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}