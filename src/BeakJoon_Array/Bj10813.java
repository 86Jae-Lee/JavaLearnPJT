package BeakJoon_Array;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Bj10813 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] strings = str.split(" ");
        int lineNum = Integer.parseInt(strings[0]);
        int caseNum = Integer.parseInt(strings[1]);
        int[] line = IntStream.range(1, lineNum+1).toArray();
        StringTokenizer stt;
        for(int i=0 ; i<caseNum ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(stt.nextToken())-1;
            int num2 = Integer.parseInt(stt.nextToken())-1;
            int temp;
            temp = line[num1];
            line[num1] = line[num2];
            line[num2] = temp;
        }
        for (int j : line) bw.write(j + " ");
        bw.flush();
    }
}