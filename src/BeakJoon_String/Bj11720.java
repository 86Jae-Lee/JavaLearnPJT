package BeakJoon_String;

import java.io.*;

public class Bj11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        String[] strings = str.split("");
        int[] count = new int[caseNum];
        for(int i=0 ; i<caseNum ; i++){
            count[i] = Integer.parseInt(strings[i]);
            sum += count[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
