package BeakJoon_Array_2demantion;

import java.io.*;

public class Bj10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] str = new String[5][];
        for (int i=0 ; i<5 ; i++) {
            String string = br.readLine();
            str[i] = new String[string.length()];
            String[] sample = string.split("");
            for (int j=0 ; j<string.length() ; j++) {
                str[i][j] = sample[j];
            }
        }

        for (int i=0 ; i<15 ; i++) {
            try {
                bw.write(str[0][i]);
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                bw.write(str[1][i]);
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                bw.write(str[2][i]);
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                bw.write(str[3][i]);
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                bw.write(str[4][i]);
            } catch (IndexOutOfBoundsException e) {
            }
        }
        bw.flush();
    }
}