package BeakJoon_Array;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Bj5597 {

    public static void main(String[] args) throws IOException {
        int[] line = new int[30];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1 ; i<28 ; i++){
            int a = Integer.parseInt(br.readLine());
            line[a-1] = 1;
        }
        for(int i=0 ; i<28 ; i++){
            if(line[i]==0){
                bw.write(i+1+"\n");
            }
        }
        bw.flush();
    }
}