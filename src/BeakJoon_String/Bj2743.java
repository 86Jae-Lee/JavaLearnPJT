package BeakJoon_String;

import java.io.*;

public class Bj2743 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strs = str.split("");
        bw.write(String.valueOf(strs.length));
        bw.flush();
        bw.close();
        br.close();
    }
}