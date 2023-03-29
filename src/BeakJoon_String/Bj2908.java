package BeakJoon_String;

import java.io.*;
import java.util.StringTokenizer;

public class Bj2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        String st1 = stt.nextToken(); String st2 = stt.nextToken();
        StringBuilder stb1 = new StringBuilder(st1);
        StringBuilder stb2 = new StringBuilder(st2);
        stb1 = stb1.reverse(); stb2 = stb2.reverse();
        st1 = stb1.toString(); st2 = stb2.toString();
        int a = Integer.parseInt(st1); int b = Integer.parseInt(st2);
        if(a>b) bw.write(String.valueOf(a));
        if(b>a) bw.write(String.valueOf(b));
        bw.flush();
    }
}