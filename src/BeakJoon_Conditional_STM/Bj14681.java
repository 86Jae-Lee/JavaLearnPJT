package BeakJoon_Conditional_STM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj14681 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int answer;
        if (x>0&&y>0) {
            answer = 1;
        } else if (x>0&&y<0) {
            answer = 4;
        } else if (x<0&&y>0) {
            answer = 2;
        } else {
            answer = 3;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}