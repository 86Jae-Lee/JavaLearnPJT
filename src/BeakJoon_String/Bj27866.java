package BeakJoon_String;

import java.io.*;

public class Bj27866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());
        bw.write(str.charAt(num-1));
        bw.flush();
    }
}