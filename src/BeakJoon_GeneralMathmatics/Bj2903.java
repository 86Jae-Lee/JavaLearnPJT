package BeakJoon_GeneralMathmatics;

import java.io.*;

public class Bj2903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(midAlgorithm(num)));
        bw.flush();
    }

    static int midAlgorithm(int num){
        if (num==1) return 4;
        if (num>1) {

        }



        return 0;
    }
}
