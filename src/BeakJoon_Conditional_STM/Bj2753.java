package BeakJoon_Conditional_STM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int tf;
        if((((num % 4) == 0) && ((num % 100) != 0)) || ((num % 400) == 0)) {
            tf = 1;
        } else {
            tf = 0;
        }
        bw.write(String.valueOf(tf));
        bw.flush();
    }
}