package BeakJoon_Squar_Tri;

import java.io.*;

public class Bj15894 {

    static long[] line;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(count(num)));
        bw.flush();
    }

    static long count(int num){
        if(num==0) return 1;
        if(num==1) return 1;
        else {
            return line[num-1]+line[num-2];
        }
    }
}