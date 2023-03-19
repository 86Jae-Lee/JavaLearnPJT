package BeakJoon_Reapeating;

import java.io.*;
import java.util.StringTokenizer;

public class Bj25304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalPrice = Integer.parseInt(br.readLine());
        int caseNum = Integer.parseInt(br.readLine());
        int totalSum = 0;
        StringTokenizer stt;
        for(int i=0 ; i<caseNum ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(stt.nextToken());
            int num = Integer.parseInt(stt.nextToken());
            totalSum = totalSum+(price*num);
        }
        if(totalPrice==totalSum) bw.write("Yes");
        else bw.write("No");
        bw.flush();
    }
}