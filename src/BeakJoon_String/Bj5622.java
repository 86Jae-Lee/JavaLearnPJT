package BeakJoon_String;

import java.io.*;

public class Bj5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = (br.readLine()).split("");
        int time = 0;
        for (int i=0 ; i<str.length ; i++) {
            int charNum = str[i].charAt(0);
            if(65<=charNum&&charNum<=67) {
                time += 3;
            } else if(68<=charNum&&charNum<=70) {
                time += 4;
            } else if(71<=charNum&&charNum<=73) {
                time += 5;
            } else if(74<=charNum&&charNum<=76) {
                time += 6;
            } else if(77<=charNum&&charNum<=79) {
                time += 7;
            } else if(80<=charNum&&charNum<=83) {
                time += 8;
            } else if(84<=charNum&&charNum<=86) {
                time += 9;
            } else if(87<=charNum&&charNum<=90) {
                time += 10;
            }
        }
        bw.write(String.valueOf(time));
        bw.flush();
    }
}