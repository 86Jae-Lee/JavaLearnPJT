package BeakJoon_Reapeating;

import java.io.*;

public class Bj2439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=1 ; i<=num ; i++){
            for(int j=num ; j>0 ; j--){
                if(i<j){
                    bw.write(" ");
                } else{
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}