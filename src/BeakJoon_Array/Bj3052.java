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
        for(int i=0 ; i<line.length ; i++){
            for(int j=i+1 ; j<line.length ; j++){
                if(line[i]==line[j]) line[i] = -1;
            }
        }
        int result = 0;
        for(int i=0 ; i<line.length ; i++){
            if(line[i]!=-1) result++;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}