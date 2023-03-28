package BeakJoon_String;

import java.io.*;

public class Bj9086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String[] str = new String [num];
        for(int i=0 ; i<num ; i++){
            str[i] = br.readLine();
            bw.write(str[i].charAt(0)+str[i].charAt(str[i].length()-1));
            bw.write("\n");
        }
        bw.flush();
    }
}
