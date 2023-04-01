package BeakJoon_GeneralMathmatics;

import java.io.*;

public class Bj2720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        for(int i=0 ; i<caseNum ; i++) {
            int num = Integer.parseInt(br.readLine());
            int qu; int di; int nic; int pen;
            qu = num/25;
            di = (num%25)/10;
            nic = ((num%25)%10)/5;
            pen = ((num%25)%10)%5;
            bw.write(qu+" "+di+" "+nic+" "+pen);
            bw.write("\n");
        }
        bw.flush();
    }
}