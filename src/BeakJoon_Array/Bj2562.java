package BeakJoon_Array;

import java.io.*;

public class Bj2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] line = new int[9];
        int max = 0;
        int count = 0;
        for (int i=0 ; i<9 ; i++){
            line[i] = Integer.parseInt(br.readLine());
            if(line[i]>max) {
                max = line[i];
                count = i;
            }
        }
        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(count+1));
        bw.flush();
    }
}