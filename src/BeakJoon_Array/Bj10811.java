package BeakJoon_Array;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Bj10811 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int lineNum = Integer.parseInt(stt.nextToken());
        int caseNum = Integer.parseInt(stt.nextToken());
        int[] line = IntStream.range(1, lineNum+1).toArray();
        for(int i=0 ; i<caseNum ; i++){
            String str = br.readLine();
            String[] strings = str.split(" ");
            int num1 = Integer.parseInt(strings[0])-1;
            int num2 = Integer.parseInt(strings[1])-1;


        }


    }
}
