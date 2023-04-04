package BeakJoon_PrimeNum_ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(stt.nextToken());
        int lineNum = Integer.parseInt(stt.nextToken());

        ArrayList<Integer> line = new ArrayList<>();
        for (int i=1 ; i*i<=num ; i++) {
            if(i*i==num) line.add(i);
            else if(num%i==0) {
                line.add(i);
                line.add(num/i);
            }
        }
        Collections.sort(line);
        if(lineNum>line.size()) {
            bw.write(String.valueOf(0));
        } else {
            bw.write(String.valueOf(line.get(lineNum-1)));
        }
        bw.flush();
    }
}