package BeakJoon_Array_2demantion;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2738 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt;
        stt = new StringTokenizer(br.readLine(), " ");
        int width = Integer.parseInt(stt.nextToken());
        int height = Integer.parseInt(stt.nextToken());
        int[][] hex1 = new int[width][height];
        int[][] hex2 = new int[width][height];
        for(int i=0 ; i<height ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            for(int j=0 ; j<width ; j++) hex1[j][i] = Integer.parseInt(stt.nextToken());
        }
        for(int i=0 ; i<height ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            for(int j=0 ; j<width ; j++) hex2[j][i] = Integer.parseInt(stt.nextToken());
        }
        for(int i=0 ; i<height ; i++){
            for(int j=0 ; j<width ; j++) bw.write(hex1[j][i] + hex2[j][i] + " ");
            bw.write("\n");
        }
        bw.flush();
    }
}