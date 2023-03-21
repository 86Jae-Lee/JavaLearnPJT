package BeakJoon_Array;

import java.io.*;

public class Bj3052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] line = new int[10];
        for(int i=0 ; i<10 ; i++){
            line[i] = Integer.parseInt(br.readLine())%42;
        }


    }
}
