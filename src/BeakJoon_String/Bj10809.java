package BeakJoon_String;

import java.io.*;
import java.util.*;

public class Bj10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int alpha[] = new int [26];
        Arrays.fill(alpha, -1);

        for (int i=0 ; i<str.length() ; i++) {
            if (alpha[charPlace(str.charAt(i))]>-1) {
                continue;
            } else {
                alpha[charPlace(str.charAt(i))] = i;
            }
        }

        for (int i=0 ; i<26 ; i++) {
            System.out.print(alpha[i]+" ");
        }
    }

    static int charPlace(char a) {
        int num = (int)a;
        num = num-97;
        return num;
    }
}