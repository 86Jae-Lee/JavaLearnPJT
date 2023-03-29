package BeakJoon_String;

import java.io.*;

public class Bj11654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char cr = (br.readLine()).charAt(0);
        ascCode(cr);
    }

    public static void ascCode(char c) {
        System.out.println((int)c);
    }
}