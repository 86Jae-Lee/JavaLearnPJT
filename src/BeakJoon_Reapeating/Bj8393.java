package BeakJoon_Reapeating;

import java.io.*;

public class Bj8393 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0 ; i<=num ; i++) sum = sum+i;
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}