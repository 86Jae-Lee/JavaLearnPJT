package BeakJoon_Reapeating;

import java.io.*;

public class Bj2739 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=1 ; i<10 ; i++){
            bw.write(String.valueOf(num)+" * "+i+" = "+String.valueOf(num*i)+"\n");
        }
        bw.flush();
    }
}
