package BeakJoon_Reapeating;

import java.io.*;

public class Bj25314 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int count = num/4;
        for(int i=0 ; i<count ; i++){
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
    }
}