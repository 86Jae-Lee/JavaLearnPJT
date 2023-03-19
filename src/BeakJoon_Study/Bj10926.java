package BeakJoon_Study;

import java.io.*;

public class Bj10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String stPlus = "??!";
        bw.write(str+stPlus);
        bw.flush();
    }
}
