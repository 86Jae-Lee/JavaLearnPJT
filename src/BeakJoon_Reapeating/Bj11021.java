package BeakJoon_Reapeating;

import java.io.*;
import java.util.StringTokenizer;

public class Bj11021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        StringTokenizer stt;
        for(int i=0 ; i<caseNum ; i++){
            stt = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(stt.nextToken());
            int num2 = Integer.parseInt(stt.nextToken());
            bw.write("Case #"+i+": "+ String.valueOf(num1+num2));
            bw.write("\n");
        }
        bw.flush();
    }
}
